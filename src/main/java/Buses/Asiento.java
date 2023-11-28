package Buses;

public abstract class Asiento {
    protected int precio;
    protected String tipo;
    protected boolean ocupado;
    public Asiento() {
        this.ocupado = false;
    }

    public int getPrecio() {
        return precio;
    }

    public void setOcupado(boolean estado) {
        ocupado = estado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public String getTipo() {
        return tipo;
    }
}
