package Buses;

public class AsientoCama extends Asiento {
    private final TipoAsiento cama = TipoAsiento.CAMA;
    public AsientoCama() {
        precio = cama.getPrecio();
        tipo = cama.toString();
    }
}
