package Buses;

import java.util.ArrayList;

public abstract class Bus {
    protected int ASIENTOS_NORMAL;
    protected int ASIENTOS_SEMI;
    protected int ASIENTOS_CAMA;
    private int precio_viaje;
    private final ArrayList<Asiento> asientos;
    private final AsientoFactory asientoFactory;

    public Bus() {
        asientoFactory = new AsientoFactory();
        asientos = new ArrayList();
    }

    public void crearAsientos() {
        for (int i = 0; i < ASIENTOS_NORMAL; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.NORMAL);
            asientos.add(aux);
        }
        for (int i = 0; i < ASIENTOS_SEMI; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.SEMICAMA);
            asientos.add(aux);
        }
        for (int i = 0; i < ASIENTOS_CAMA; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.CAMA);
            asientos.add(aux);
        }
    }

    public void setPrecio(int precio) {
        this.precio_viaje = precio;
    }
}
