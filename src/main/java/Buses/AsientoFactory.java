package Buses;

public class AsientoFactory {
    private Asiento asiento;

    public AsientoFactory() {
    }

    public Asiento crearAsiento(TipoAsiento tipo) {
        switch (tipo) {
            case NORMAL -> asiento = new AsientoNormal();
            case SEMICAMA -> asiento = new AsientoSemiCama();
            case CAMA -> asiento = new AsientoCama();
        }
        return asiento;
    }
}
