package Buses;

public class BusFactory {
    private int pisos;
    private Bus bus;

    public BusFactory(int pisos) {
        this.pisos = pisos;
    }

    public Bus crearBus() {
        switch (pisos) {
            case 1 -> bus = new BusUnPiso();
            case 2 -> bus = new BusDosPisos();
        }
        return bus;
    }
}
