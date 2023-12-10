package GUI;

import Logica.Recorrido;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelConfirmacion extends JPanel {
    private Recorrido recorrido;
    private SistemaAsientos sistema_asientos;
    private JLabel label_precio;

    public PanelConfirmacion(Recorrido recorrido, SistemaAsientos sistema_asientos) {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.recorrido = recorrido;
        this.sistema_asientos = sistema_asientos;

        this.label_precio = new JLabel("Precio total: $" + sistema_asientos.getPrecioInt());
    }

    private class BotonPagar extends JButton {
        public BotonPagar(String s) {
            super(s);
            this.addActionListener(new BotonPagarListener());
        }

        class BotonPagarListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
    }
}
