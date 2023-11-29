package Buses;

public class AsientoNormal extends Asiento {
    private final TipoAsiento normal = TipoAsiento.NORMAL;
    public AsientoNormal() {
        precio = normal.getPrecio();
        tipo = normal.toString();
    }
}
