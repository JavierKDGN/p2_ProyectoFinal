package Buses;

public abstract class Asiento {
    protected int precio;
    private int numero;
    protected String tipo;
    public boolean ocupado;
    protected boolean temp_seleccionado;
    public Asiento(int numero) {
        this.ocupado = false;//empieza con todos los asientos desocupados
        this.temp_seleccionado = false;//empieza con todos los asientos sin seleccionar
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
    public boolean getTemp_seleccionado() {
        return temp_seleccionado;
    }
    public void setTemp_seleccionado(boolean temp_seleccionado) {
        this.temp_seleccionado = temp_seleccionado;
    }

}
