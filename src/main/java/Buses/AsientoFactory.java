package Buses;

public class AsientoFactory {
    private Asiento asiento;

    public AsientoFactory() {
    }

    public Asiento crearAsiento(TipoAsiento tipo, int numero) {
        switch (tipo) {
            case NORMAL -> asiento = new AsientoNormal(numero);
            case SEMICAMA -> asiento = new AsientoSemiCama(numero);
            case CAMA -> asiento = new AsientoCama(numero);
        }
        return asiento;
    }
}
