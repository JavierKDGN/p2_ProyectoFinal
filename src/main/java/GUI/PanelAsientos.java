package GUI;

import Logica.*;
import Buses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PanelAsientos extends JPanel {
    private SistemaAsientos sistema_Asientos;
    private ArrayList<Asiento> asientos;
    private ArrayList<Asiento> asientos_pedidos;
    private Recorrido recorrido;
    private final int CANTIDAD_ASIENTOS;

    private PanelAsientos1Piso panel_primer_piso;
    private PanelAsientos2Pisos panel_segundo_piso;

    public PanelAsientos(Color color, Recorrido recorrido) {
        this.setBackground(Color.lightGray);
        this.setLayout(new GridLayout(2,1));
        this.recorrido = recorrido;
        sistema_Asientos = new SistemaAsientos(recorrido);
        asientos = sistema_Asientos.getAsientosTotalesArray();
        asientos_pedidos = sistema_Asientos.getAsientosPedidosArray();
        CANTIDAD_ASIENTOS = sistema_Asientos.getAsientosTotalInt();

        panel_primer_piso = new PanelAsientos1Piso(Color.lightGray);
        panel_primer_piso.agregarAsientos(asientos);
        this.add(panel_primer_piso, BorderLayout.NORTH);

        if (recorrido.getBus().getCantidadPisos() == 2) {
            panel_segundo_piso = new PanelAsientos2Pisos(Color.lightGray);
            this.add(panel_segundo_piso, BorderLayout.SOUTH);
        }
    }


}
