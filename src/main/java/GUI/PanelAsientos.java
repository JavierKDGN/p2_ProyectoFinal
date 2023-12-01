package GUI;

import Logica.*;
import Buses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public abstract class PanelAsientos extends JPanel {
    private SistemaAsientos sistema_Asientos;
    protected ArrayList<Asiento> asientos;
    protected ArrayList<Asiento> asientos_pedidos;
    protected final int CANTIDAD_ASIENTOS;
    protected Recorrido recorrido;
    public PanelAsientos(Color color, Recorrido recorrido) {
        this.setBackground(Color.lightGray);
        this.recorrido = recorrido;
        this.sistema_Asientos = new SistemaAsientos(recorrido);
        this.asientos = sistema_Asientos.getAsientosTotalesArray();
        this.asientos_pedidos = sistema_Asientos.getAsientosPedidosArray();
        this.CANTIDAD_ASIENTOS = sistema_Asientos.getAsientosTotalInt();
    }

    protected class GUIAsiento {
        private Asiento asiento;
        private Polygon p;
        private Color color;
        private int x, y;
        private static final int ancho = 25, alto = 25;
        private static final Color DESOCUPADO = Color.green, OCUPADO = Color.red;
        public GUIAsiento(int x, int y, Asiento asiento) {
            this.asiento = asiento;
            this.x = x;
            this.y = y;
            p = new Polygon();
            p.addPoint(x, y);
            p.addPoint(x + ancho, y);
            p.addPoint(x + ancho, y + alto);
            p.addPoint(x, y + alto);
            addMouseListener(new MouseListenerAsiento());
        }
        private class MouseListenerAsiento extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (p.contains(e.getPoint())) {
                    System.out.println("Click en asiento: " + asientos.indexOf(asiento));

                }
            }
        }

        public void paintComponent(Graphics g) {
            if (asiento.isOcupado()) {
                color = OCUPADO;
            } else {
                color = DESOCUPADO;
            }
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(Color.black);
            g.drawPolygon(p);
        }
    }
}
