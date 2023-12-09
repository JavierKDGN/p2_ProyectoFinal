package Buses;

public class AsientoCama extends Asiento {
    private final TipoAsiento cama = TipoAsiento.CAMA;
    public AsientoCama(int numero) {
        super(numero);
        precio = cama.getPrecio();
        tipo = cama.toString();
        ocupado=false;
    }
}
