package GUI;

import Buses.Asiento;
import Logica.Recorrido;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelAsientos2Pisos extends AbsPanelPisos {

    public PanelAsientos2Pisos(Color color, SistemaAsientos sistema_asientos) {
        super(color, sistema_asientos);
        panel_piso.setLayout(new GridLayout(2, 10, 10, 25));
        label_piso = new JLabel("Piso 2");
        this.add(panel_piso, BorderLayout.CENTER);
        this.add(label_piso, BorderLayout.EAST);
    }

    public void agregarAsientos(ArrayList<Asiento> asientos, int cantidad) {
        for (int i = cantidad; i < asientos.size(); i++) {
            BotonAsiento botonAsiento = new BotonAsiento(asientos.get(i), sistema_asientos);
            panel_piso.add(botonAsiento);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
