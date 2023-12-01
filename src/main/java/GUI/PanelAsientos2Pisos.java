package GUI;

import Logica.Recorrido;

import java.awt.*;

public class PanelAsientos2Pisos extends PanelAsientos {
    public PanelAsientos2Pisos(Color color, Recorrido recorrido) {
        super(color, recorrido);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 25;
        int y = 25;
        int ancho = 25;
        int alto = 25;
        int contador = 0;
        for (int i = 0; i < CANTIDAD_ASIENTOS; i++) {
            if (contador == 4) {
                y = 25;
                x += 50;
                contador = 0;
            }
            if (asientos_pedidos.contains(asientos.get(i))) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.green);
            }
            g.fillRect(x, y, ancho, alto);
            g.setColor(Color.black);
            g.drawRect(x, y, ancho, alto);
            y += 50;
            contador++;
        }
    }
}
