package GUI;

import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Buses.*;

public class PanelAsientos1Piso extends JPanel {
    //Label de piso que se mostrara a la derecha del panel
    private JLabel label_piso;
    public PanelAsientos1Piso(Color color) {
        this.setLayout(new GridLayout(4,10));

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
