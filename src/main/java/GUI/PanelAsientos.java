package GUI;

import Logica.*;
import Buses.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class PanelAsientos extends JPanel {
    private SistemaAsientos sistema_Asientos;
    protected ArrayList<Asiento> asientos;
    protected ArrayList<Asiento> asientos_pedidos;
    protected final int CANTIDAD_ASIENTOS;
    public PanelAsientos(Color color, Recorrido recorrido) {
        this.setBackground(Color.lightGray);
        this.sistema_Asientos = new SistemaAsientos(recorrido);
        this.asientos = sistema_Asientos.getAsientosTotalesArray();
        this.asientos_pedidos = sistema_Asientos.getAsientosPedidosArray();
        this.CANTIDAD_ASIENTOS = sistema_Asientos.getAsientosTotalInt();
    }
}
