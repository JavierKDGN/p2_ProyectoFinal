package GUI;

import Logica.*;
import Buses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelAsientos extends JPanel {
    private static VentanaAsientosMediator mediator;
    private Recorrido recorrido;
    private Bus bus;
    private static SistemaAsientos sistema_asientos;
    private int pisos;
    private int CANTIDAD_ASIENTOS_TOTAL;
    private int CANTIDAD_ASIENTOS_CAMA;
    private ArrayList<Asiento> asientos;

    private JButton botonConfirmar;
    private PanelAsientos1Piso panel_primer_piso;
    private PanelAsientos2Pisos panel_segundo_piso;

    public PanelAsientos(Color color, Recorrido recorrido, VentanaAsientosMediator mediator) {
        this.setBackground(Color.lightGray);
        this.setLayout(new GridLayout(3,1, 0, 50));

        this.mediator = mediator;
        this.mediator.setPanel(this);

        this.recorrido = recorrido;
        this.bus = recorrido.getBus();
        this.sistema_asientos = new SistemaAsientos(bus);

        this.pisos = bus.getCantidadPisos();
        this.CANTIDAD_ASIENTOS_TOTAL = sistema_asientos.getAsientosTotalInt();
        this.CANTIDAD_ASIENTOS_CAMA = bus.getAsientosCamaInt();
        this.asientos = sistema_asientos.getAsientosTotalesArray();
        this.botonConfirmar = new botonConfirmar("Confirmar");
        this.add(botonConfirmar);
        inicializarPisos();

    }
    private void inicializarPisos() {
        panel_primer_piso = new PanelAsientos1Piso(Color.lightGray, sistema_asientos);
        panel_primer_piso.agregarAsientos(asientos, CANTIDAD_ASIENTOS_TOTAL - CANTIDAD_ASIENTOS_CAMA);
        this.add(panel_primer_piso);
        if (pisos == 2) {
            panel_segundo_piso = new PanelAsientos2Pisos(Color.BLUE, sistema_asientos);
            panel_segundo_piso.agregarAsientos(asientos, CANTIDAD_ASIENTOS_TOTAL - CANTIDAD_ASIENTOS_CAMA);
            this.add(panel_segundo_piso);
        }
    }
    private class botonConfirmar extends JButton {
        public botonConfirmar(String s) {
            super(s);
            this.addActionListener(new botonConfirmarListener());
        }
        class botonConfirmarListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                // Limpiar la lista antes de agregar los asientos seleccionados
                sistema_asientos.confirmarAsientos();
                // Abrir la ventana de confirmación
                abrirVentanaConfirmacion(recorrido, sistema_asientos);
            }

            private void abrirVentanaConfirmacion(Recorrido recorrido, SistemaAsientos sistema_asientos) {
                VentanaConfirmacion ventanaConfirmacion = new VentanaConfirmacion(recorrido, sistema_asientos);
                mediator.cerrarVentana();
                ventanaConfirmacion.setVisible(true);
            }
        }
    }
}
