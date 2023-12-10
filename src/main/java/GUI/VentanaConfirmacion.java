package GUI;

import Buses.Asiento;
import Logica.Recorrido;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaConfirmacion extends JFrame {

    private PanelConfirmacion panel_confirmacion;
    private VentanasMediator mediator;

    public VentanaConfirmacion(Recorrido recorrido, SistemaAsientos sistema_asientos) {
        super();
        this.setTitle("Confirmacion de compra");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(600, 400);

        this.mediator = new VentanasMediator(this);
        this.panel_confirmacion = new PanelConfirmacion(recorrido, sistema_asientos, mediator);
        this.add(panel_confirmacion, BorderLayout.CENTER);
    }


}
