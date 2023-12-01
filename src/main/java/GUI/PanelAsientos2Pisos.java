package GUI;

import Buses.Asiento;
import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelAsientos2Pisos extends JPanel {
    private JLabel label_piso;

    public PanelAsientos2Pisos(Color color) {
        this.setLayout(new GridLayout(10, 1));
    }

    public void agregarAsientos(ArrayList<Asiento> asientos) {
        for (Asiento asiento : asientos) {
            BotonAsiento botonAsiento = new BotonAsiento(asiento);
            this.add(botonAsiento);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
