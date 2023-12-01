package GUI;

import javax.swing.*;
import java.awt.*;

public class VentanaRecorridos extends JFrame {
    private PanelRecorridos panel_recorridos;

    public VentanaRecorridos() {
        super();
        this.setTitle("Proyecto Final");
        this.setLayout(new BorderLayout());
        this.setSize(400, 400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel_recorridos = new PanelRecorridos(Color.white);
        this.add(panel_recorridos, BorderLayout.CENTER);
        this.setVisible(true);
    }

}
