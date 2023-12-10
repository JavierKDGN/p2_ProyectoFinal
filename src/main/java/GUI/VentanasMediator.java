package GUI;

import javax.swing.*;

public class VentanasMediator {
    private JFrame ventana;
    private JPanel panel;

    public VentanasMediator(JFrame ventana) {
        this.ventana = ventana;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void cerrarVentana() {
        ventana.dispose();
    }
}
