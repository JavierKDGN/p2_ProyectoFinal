package Buses;

public abstract class Asiento {
    protected int precio;
    protected String tipo;

    public Asiento() {
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
}
