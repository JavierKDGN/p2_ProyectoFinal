package Buses;

public class BusUnPiso extends Bus {

    public BusUnPiso() {
        super();
        ASIENTOS_NORMAL = 30;
        ASIENTOS_SEMI = 10;
        ASIENTOS_CAMA = 0;
        crearAsientos();
    }
}
