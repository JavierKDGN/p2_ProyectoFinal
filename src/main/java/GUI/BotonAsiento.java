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
        this.setSize(100, 25);
        this.asiento = asiento;
        this.sistema_asientos = sistema_asientos;

        this.setText("<html> " + String.valueOf(asiento.getNumero()) + "<br />" + asiento.getTipo() + "</html>");

        actualizarEstado();

        this.addActionListener(e -> {
            if (asiento.getSeleccionado() == 0) {
                System.out.println("Asiento " + asiento.getNumero() + " seleccionado");
                sistema_asientos.elegirAsiento(asiento.getNumero());
                asiento.setSeleccionado(1);

                // Al hacer clic, cambia a rojo
                setBackground(Color.red);
            } else {
                // Deseleccionar el asiento
                asiento.setSeleccionado(0);

                // Vuelve a verde si no está ocupado
                setBackground(asiento.getSeleccionado() == 1 ? Color.red : Color.green);
            }
        });
    }

    public void actualizarEstado() {
        setEnabled(!asiento.isOcupado());
        setBackground(asiento.isOcupado() ? Color.red : Color.green);
    }
}