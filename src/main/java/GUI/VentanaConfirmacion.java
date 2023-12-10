package GUI;

import Buses.Asiento;
import Logica.Recorrido;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaConfirmacion extends JFrame {

    private Recorrido recorrido;
    private PanelConfirmacion panel_confirmacion;

    public VentanaConfirmacion(Recorrido recorrido, SistemaAsientos sistema_asientos) {
        super();
        this.recorrido = recorrido;
        this.setTitle("Confirmacion de compra");
        this.setLayout(new BorderLayout());
        this.setSize(600, 400);

        panel_confirmacion = new PanelConfirmacion(recorrido, sistema_asientos);
        this.add(panel_confirmacion, BorderLayout.CENTER);
    }


}
