package GUI;

import Buses.Asiento;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

public class GuiAsiento {
    private Asiento asiento;
    private Polygon p;
    private Color color;
    private int x, y;
    private static final int ancho = 25, alto = 25;
    private static final Color DESOCUPADO = Color.green, OCUPADO = Color.red;
    public GuiAsiento(int x, int y, Asiento asiento) {
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
        public void mousePressed(MouseEvent e) {
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
