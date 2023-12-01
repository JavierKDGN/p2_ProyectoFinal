package GUI;

import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import Buses.*;

public class PanelAsientos1Piso extends PanelAsientos {
    //Label de piso que se mostrara a la derecha del panel
    private JLabel label_piso;
    public PanelAsientos1Piso(Color color, Recorrido recorrido) {
        super(color, recorrido);
        label_piso = new JLabel("Piso 1");
        label_piso.setFont(new Font("Arial", Font.BOLD, 20));
        label_piso.setForeground(Color.black);
        this.add(label_piso);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 25;
        int y = 25;
        int ancho = 25;
        int alto = 25;
        int contador = 0;
        GUIAsiento grafico_asiento;
        for (int i = 0; i < CANTIDAD_ASIENTOS; i++) {
            if (contador == 4) {
                y = 25;
                x += 50;
                contador = 0;
            }
            grafico_asiento = new GUIAsiento(x, y, asientos.get(i));
            grafico_asiento.paintComponent(g);
            y += 50;
            contador++;
        }
    }

}
