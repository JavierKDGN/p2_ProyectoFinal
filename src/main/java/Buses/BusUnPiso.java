package Buses;

public class BusUnPiso extends Bus {

    public BusUnPiso() {
        super();
        ASIENTOS_NORMAL = 30;
        ASIENTOS_SEMI = 10;
        ASIENTOS_CAMA = 0;
        crearAsientos();
    }
    @Override
    public String getTipo() {
        return "Un Piso";
    }
    public int getCantidadPisos() {
        return 1;
    }

    public String toString() {
        return "1 Piso. Tarifa: " + this.getTarifa();
    }
}
