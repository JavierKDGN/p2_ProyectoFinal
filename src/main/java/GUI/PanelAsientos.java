package GUI;

import Buses.Asiento;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelAsientos extends JPanel {
    private ArrayList<Asiento> asientos;

    public PanelAsientos(Color color, ArrayList<Asiento> asientos) {
        this.setBackground(color);
        this.asientos = asientos;

        // Configura el diseño del panel
        GridLayout layout = new GridLayout(3, 10); // Ajusta según la disposición de tus asientos
        this.setLayout(layout);

        // Agrega botones para representar los asientos
        for (Asiento asiento : asientos) {
            JButton botonAsiento = new JButton(asiento.getTipo() + " " + asiento.getPrecio());
            botonAsiento.setEnabled(!asiento.isOcupado()); // Deshabilita el botón si el asiento está ocupado
            botonAsiento.addActionListener(e -> onAsientoClick(asiento));
            this.add(botonAsiento);
        }
    }

    // Método que se llama cuando se hace clic en un asiento
    private void onAsientoClick(Asiento asiento) {
        // Lógica al hacer clic en un asiento
        System.out.println("Asiento clicado: " + asiento.getTipo() + " " + asiento.getPrecio());
    }
}
