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
    private final int pisos;
    private final int CANTIDAD_ASIENTOS_TOTAL;
    private final int CANTIDAD_ASIENTOS_CAMA;

    private PanelAsientos1Piso panel_primer_piso;
    private PanelAsientos2Pisos panel_segundo_piso;

    public PanelAsientos(Color color, Bus bus) {
        this.setBackground(Color.lightGray);
        this.setLayout(new GridLayout(2,1));
        sistema_Asientos = new SistemaAsientos(bus);
        asientos = sistema_Asientos.getAsientosTotalesArray();
        asientos_pedidos = sistema_Asientos.getAsientosPedidosArray();
        CANTIDAD_ASIENTOS_TOTAL = sistema_Asientos.getAsientosTotalInt();
        CANTIDAD_ASIENTOS_CAMA = bus.getAsientosCamaInt();
        pisos = bus.getCantidadPisos();

        panel_primer_piso = new PanelAsientos1Piso(Color.lightGray);
        panel_primer_piso.agregarAsientos(asientos, CANTIDAD_ASIENTOS_TOTAL - CANTIDAD_ASIENTOS_CAMA);
        this.add(panel_primer_piso, BorderLayout.NORTH);

        if (pisos == 2) {
            panel_segundo_piso = new PanelAsientos2Pisos(Color.BLUE);
            panel_segundo_piso.agregarAsientos(asientos, CANTIDAD_ASIENTOS_TOTAL - CANTIDAD_ASIENTOS_CAMA);
            this.add(panel_segundo_piso, BorderLayout.SOUTH);
        }
    }

}
