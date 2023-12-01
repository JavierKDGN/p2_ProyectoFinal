package GUI;

import Buses.Asiento;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class AbsPanelPisos extends JPanel {
    protected JLabel label_piso;
    protected JPanel panel_piso;
    protected SistemaAsientos sistema_asientos;

    public AbsPanelPisos(Color color, SistemaAsientos sistema_asientos) {
        this.sistema_asientos = sistema_asientos;
        setLayout(new BorderLayout());
        panel_piso = new JPanel();

    }
    public abstract void agregarAsientos(ArrayList<Asiento> asientos, int cantidad) ;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

}
