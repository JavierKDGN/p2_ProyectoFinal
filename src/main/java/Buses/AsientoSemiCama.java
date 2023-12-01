package Buses;

public class AsientoSemiCama extends Asiento {
    private final TipoAsiento semi_cama = TipoAsiento.SEMICAMA;
    public AsientoSemiCama(int numero) {
        super(numero);
        precio = semi_cama.getPrecio();
        tipo = semi_cama.toString();
    }
}
