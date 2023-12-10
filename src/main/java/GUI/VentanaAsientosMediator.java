package GUI;

public class VentanaAsientosMediator {
    private VentanaAsientos ventana_asientos;
    private PanelAsientos panel_asientos;

    public VentanaAsientosMediator(VentanaAsientos ventana_asientos) {
        this.ventana_asientos = ventana_asientos;
    }

    public void setPanel(PanelAsientos panel_asientos) {
        this.panel_asientos = panel_asientos;
    }

    public void cerrarVentana() {
        ventana_asientos.dispose();
    }
}
