package GUI;

import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Buses.*;
import Logica.SistemaAsientos;

public class PanelAsientos1Piso extends AbsPanelPisos {
    //Label de piso que se mostrara a la derecha del panel

    public PanelAsientos1Piso(Color color, SistemaAsientos sistema_asientos) {
        super(color, sistema_asientos);
        panel_piso.setLayout(new GridLayout(4,10));
        label_piso = new JLabel("Piso 1");
        this.add(panel_piso, BorderLayout.CENTER);
        this.add(label_piso, BorderLayout.EAST);
    }

    public void agregarAsientos(ArrayList<Asiento> asientos, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            BotonAsiento botonAsiento = new BotonAsiento(asientos.get(i), sistema_asientos);
            panel_piso.add(botonAsiento);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
