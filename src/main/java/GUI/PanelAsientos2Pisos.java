package GUI;

import Logica.Recorrido;

import java.awt.*;

public class PanelAsientos2Pisos extends PanelAsientos {
    private final int CANTIDAD_ASIENTOS_CAMA = recorrido.getBus().getAsientosCamaInt();
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
        GUIAsiento grafico_asiento;
        for (int i = 0; i < CANTIDAD_ASIENTOS; i++) {
            if (i >= CANTIDAD_ASIENTOS - CANTIDAD_ASIENTOS_CAMA) {
                if (contador == 4) {
                    y = 225;
                    x += 50;
                    contador = 0;
                }
                grafico_asiento = new GUIAsiento(x, y, asientos.get(i));
                grafico_asiento.paintComponent(g);
                y += 50;
                contador++;
                continue;
            }
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
