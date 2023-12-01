package Buses;

public class AsientoNormal extends Asiento {
    private final TipoAsiento normal = TipoAsiento.NORMAL;
    public AsientoNormal(int numero) {
        super(numero);
        precio = normal.getPrecio();
        tipo = normal.toString();
    }
}
