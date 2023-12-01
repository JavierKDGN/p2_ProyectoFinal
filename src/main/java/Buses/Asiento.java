package Buses;

public abstract class Asiento {
    protected int precio;
    protected String tipo;
    protected boolean ocupado;
    private int numero;
    public Asiento(int numero) {
        this.ocupado = false;
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }
    public String getTipo() {
        return tipo;
    }
    public int getNumero() {
        return numero;
    }
    public void setOcupado(boolean estado) {
        ocupado = estado;
    }
    public boolean isOcupado() {
        return ocupado;
    }
}
