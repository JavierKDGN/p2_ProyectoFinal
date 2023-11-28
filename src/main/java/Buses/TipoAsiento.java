package Buses;

public enum TipoAsiento {
    NORMAL(3000),
    SEMICAMA(4000),
    CAMA(5000);

    private int precio;

    TipoAsiento(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }
    public String toString() {
        return this.name();
    }
}
