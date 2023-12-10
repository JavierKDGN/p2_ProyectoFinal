package Buses;

public class BusDosPisos extends Bus{
    public BusDosPisos() {
        super();
        ASIENTOS_NORMAL = 30;
        ASIENTOS_SEMI = 10;
        ASIENTOS_CAMA = 10;
        crearAsientos();
    }
    @Override
    public String getTipo() {
        return "Dos Pisos";
    }

    public int getCantidadPisos() {
        return 2;
    }

    public String toString() {
        return "2 Pisos. Tarifa: " + this.getTarifa();
    }

}
