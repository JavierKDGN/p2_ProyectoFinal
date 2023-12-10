package GUI;

import Logica.*;
import Buses.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelAsientos extends JPanel {
    private SistemaAsientos sistema_Asientos;
    private ArrayList<Asiento> asientos;
    private final int pisos;
    private final int CANTIDAD_ASIENTOS_TOTAL;
    private final int CANTIDAD_ASIENTOS_CAMA;

    private ArrayList<Asiento> asientosPedidos;

    private JButton botonConfirmar;

    private PanelAsientos1Piso panel_primer_piso;
    private PanelAsientos2Pisos panel_segundo_piso;

    public PanelAsientos(Color color, Bus bus) {
        this.setBackground(Color.lightGray);
        this.setLayout(new GridLayout(2,1, 0, 50));
        sistema_Asientos = new SistemaAsientos(bus);
        asientos = sistema_Asientos.getAsientosTotalesArray();
        CANTIDAD_ASIENTOS_TOTAL = sistema_Asientos.getAsientosTotalInt();
        CANTIDAD_ASIENTOS_CAMA = bus.getAsientosCamaInt();
        pisos = bus.getCantidadPisos();

        panel_primer_piso = new PanelAsientos1Piso(Color.lightGray, sistema_Asientos);
        panel_primer_piso.agregarAsientos(asientos, CANTIDAD_ASIENTOS_TOTAL - CANTIDAD_ASIENTOS_CAMA);
        this.add(panel_primer_piso, BorderLayout.NORTH);

        asientosPedidos = new ArrayList<>();

        if (pisos == 2) {
            panel_segundo_piso = new PanelAsientos2Pisos(Color.BLUE, sistema_Asientos);
            panel_segundo_piso.agregarAsientos(asientos, CANTIDAD_ASIENTOS_TOTAL - CANTIDAD_ASIENTOS_CAMA);
            this.add(panel_segundo_piso, BorderLayout.SOUTH);
        }

    }
    private void abrirVentanaConfirmacion(Recorrido recorrido, ArrayList<Asiento> asientosPedidos) {
        VentanaConfirmacion ventanaConfirmacion = new VentanaConfirmacion(recorrido, asientosPedidos);
        ventanaConfirmacion.setVisible(true);
    }
    void inicializarBotonConfirmar(Recorrido recorrido) {
        JButton botonConfirmar = new JButton("Confirmar");

        botonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar la lista antes de agregar los asientos seleccionados
                asientosPedidos.clear();

                // Iterar sobre todos los asientos y agregar los seleccionados a la lista
                for (Asiento asiento : sistema_Asientos.getAsientosTotalesArray()) {
                    if (asiento.getSeleccionado() == 1) {
                        asientosPedidos.add(asiento);
                    }
                }

                // Abrir la ventana de confirmación
                abrirVentanaConfirmacion(recorrido, asientosPedidos);
            }
        });

        // Agregar el botón Confirmar al panel
        this.add(botonConfirmar);
    }
    // Método adicional para asignar el Recorrido después de la creación del panel
    public void asignarRecorrido(Recorrido recorrido) {
        inicializarBotonConfirmar(recorrido);
    }

}
