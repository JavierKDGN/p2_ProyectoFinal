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
        if (asiento.isOcupado()) this.setBackground(Color.red);
        else this.setBackground(Color.green);
        this.addActionListener(new AsientoListener());
    }

    private class AsientoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(asiento.isOcupado());
            if (asiento.isOcupado() == false) {
                System.out.println("Asiento " + asiento.getNumero() + " seleccionado");
                sistema_asientos.elegirAsiento(asiento.getNumero());
                setBackground(Color.red);
            }
        }
    }
}
