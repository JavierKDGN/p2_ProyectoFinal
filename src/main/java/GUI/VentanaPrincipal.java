package GUI;

import Logica.SistemaRecorridos;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private PanelRecorridos panelInicial;
    private SistemaRecorridos sistemaRecorridos;
    public VentanaPrincipal(SistemaRecorridos sistemaRecorridos) {
        super();
        this.setTitle("Proyecto Final");
        this.setLayout(new BorderLayout());
        this.setSize(1500, 850);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.sistemaRecorridos = sistemaRecorridos;
        panelInicial = new PanelRecorridos(Color.white, sistemaRecorridos.recorridos);
        this.add(panelInicial, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaRecorridos sistema = new SistemaRecorridos(10);
            new VentanaPrincipal(sistema);
        });
    }
}
