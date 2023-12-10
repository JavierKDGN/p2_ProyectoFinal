package GUI;

import Buses.Asiento;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonAsiento extends JButton {
    private Asiento asiento;
    private SistemaAsientos sistema_asientos;
    public BotonAsiento(Asiento asiento, SistemaAsientos sistema_asientos) {
        super();
        this.setSize(100,25);
        this.asiento = asiento;
        this.sistema_asientos = sistema_asientos;

        this.setText("<html> " + String.valueOf(asiento.getNumero()) + "<br />" + asiento.getTipo() + "</html>");

        actualizarEstado();
        this.addActionListener(new AsientoListener());
    }

    public void actualizarEstado() {
        if (asiento.isOcupado()) {
            this.setBackground(Color.gray);
        }
        else {
            if (asiento.getTemp_seleccionado() == true) {
                this.setBackground(Color.red);
            }
            else {
                this.setBackground(Color.green);
            }
        }
    }
    private class AsientoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (asiento.isOcupado()) {
                JOptionPane.showMessageDialog(null, "Este asiento ya está ocupado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                if (asiento.getTemp_seleccionado() == false) {
                    System.out.println("Asiento " + asiento.getNumero() + " seleccionado");
                    sistema_asientos.elegirAsiento(asiento.getNumero());
                    // Al hacer clic, cambia a rojo
                    actualizarEstado();
                } else if (asiento.getTemp_seleccionado() == true){
                    // Deseleccionar el asiento
                    sistema_asientos.deselegirAsiento(asiento.getNumero());
                    // Vuelve a verde si no está ocupado
                    actualizarEstado();
                }
            }
        }
    }
}