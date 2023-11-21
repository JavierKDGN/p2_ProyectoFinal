package GUI;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    PanelPrincipal panelprincipal;

    public VentanaPrincipal(){
        super();
        this.setTitle("Proyecto Final");
        this.setLayout(new BorderLayout());
        this.setSize(1500, 850);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelprincipal = new PanelPrincipal(Color.white);
        this.add(panelprincipal);
        this.setVisible(true);
    }
}
