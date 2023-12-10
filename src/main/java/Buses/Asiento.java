package Buses;

public abstract class Asiento {
    protected int precio;
    protected String tipo;
    public boolean ocupado;
    private int numero;
    protected int seleccionado;
    public Asiento(int numero) {
        this.ocupado = false;//empieza con todos los asientos desocupados
        this.numero = numero;
        this.seleccionado = 0;//empieza con todos los asientos sinseleccionar
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

    public int getSeleccionado() {
        return seleccionado;
    }
    public void setSeleccionado(int seleccionado) {
        this.seleccionado = seleccionado;
    }

}
