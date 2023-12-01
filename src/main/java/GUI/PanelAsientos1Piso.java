package GUI;

import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Buses.*;

public class PanelAsientos1Piso extends JPanel {
    //Label de piso que se mostrara a la derecha del panel
    private JLabel label_piso;
    private JPanel panel_piso;
    public PanelAsientos1Piso(Color color) {
        this.setLayout(new BorderLayout());
        panel_piso = new JPanel();
        panel_piso.setLayout(new GridLayout(4,10));
        this.add(panel_piso, BorderLayout.CENTER);
        label_piso = new JLabel("Piso 1");
        this.add(label_piso, BorderLayout.EAST);
    }

    public void agregarAsientos(ArrayList<Asiento> asientos, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            BotonAsiento botonAsiento = new BotonAsiento(asientos.get(i));
            panel_piso.add(botonAsiento);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
