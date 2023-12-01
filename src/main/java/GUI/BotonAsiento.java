package GUI;

import Buses.Asiento;

import javax.swing.*;
import java.awt.*;

public class BotonAsiento extends JButton {
    private Asiento asiento;
    public BotonAsiento(Asiento asiento) {
        super();
        this.setSize(100,25);
        this.asiento = asiento;
        this.setText(String.valueOf(asiento.getNumero()));
        if (asiento.isOcupado()) this.setBackground(Color.red);
        else this.setBackground(Color.green);
    }
}
