package GUI;

import Buses.Asiento;
import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaConfirmacion extends JFrame {

    private final ArrayList<Asiento> asientosPedidos;
    private Recorrido recorrido;
    private PanelPago pago;

    public VentanaConfirmacion(Recorrido recorrido, ArrayList<Asiento> asientosPedidos) {
        super();
        this.recorrido = recorrido;
        this.asientosPedidos = asientosPedidos;
            this.setTitle("Confirmacion de compra");
            this.setLayout(new BorderLayout());
            this.setSize(600, 400);

        JLabel precioLabel = new JLabel("Precio total: $" + calcularPrecioTotal(asientosPedidos) );
        this.add(precioLabel, BorderLayout.SOUTH);
        JButton pagarButton = new JButton("Pagar");
        pagarButton.addActionListener(e -> onPagarClick());


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(precioLabel);
        panel.add(pagarButton);
        add(panel, BorderLayout.CENTER);
        }

    // Método para calcular el precio total de los asientos QUE ESTEN EN EL ARRAYLIST DE ASIENTOS SELECCIONADOS
    private int calcularPrecioTotal(ArrayList<Asiento> asientosPedidos) {
        int total = 0;

        for (Asiento asiento : asientosPedidos) {
            total += asiento.getPrecio() + recorrido.getBus().getTarifa();
        }

        return total;
    }

    // Método que se ejecutará al hacer clic en el botón "Pagar"
    private void onPagarClick() {

    }
}
