package GUI;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelRecorridos panel_recorridos;
    private PanelHoras panel_horas;
    public PanelPrincipal(Color color) {
        super();
        this.panel_recorridos = new PanelRecorridos(Color.lightGray);
        this.panel_horas = new PanelHoras(Color.DARK_GRAY);
        this.setLayout(new GridLayout(2, 1));
        this.add(panel_recorridos);
        this.add(panel_horas);
        this.setBackground(color);

    }

    public void paint(Graphics g) {
        super.paint(g);
    }
}