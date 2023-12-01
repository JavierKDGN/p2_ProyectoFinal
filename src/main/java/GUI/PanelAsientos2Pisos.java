package GUI;

import Buses.Asiento;
import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelAsientos2Pisos extends JPanel {
    private JLabel label_piso;
    private JPanel panel_piso;
    public PanelAsientos2Pisos(Color color) {
        this.setLayout(new BorderLayout());
        panel_piso = new JPanel();
        panel_piso.setLayout(new GridLayout(2, 10));
        this.add(panel_piso, BorderLayout.CENTER);
        label_piso = new JLabel("Piso 2");
        this.add(label_piso, BorderLayout.EAST);
    }

    public void agregarAsientos(ArrayList<Asiento> asientos, int cantidad) {
        for (int i = cantidad; i < asientos.size(); i++) {
            BotonAsiento botonAsiento = new BotonAsiento(asientos.get(i));
            panel_piso.add(botonAsiento);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
