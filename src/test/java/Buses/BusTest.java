package Buses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {
    private Bus bus1;
    private Bus bus2;
    private BusFactory bus_factory;
    @BeforeEach
    void setUp() {
        bus_factory = new BusFactory();
        bus1 = bus_factory.crearBus(1);
        bus2 = bus_factory.crearBus(2);
    }

    @Test
    @DisplayName("Test de creacion")
    public void crearBuses() {
        assertNotNull(bus1);
        assertNotNull(bus2);
    }

    @Test
    @DisplayName("Test de tipo de bus")
    public void tipoBus() {
        assertEquals(bus1.getTipo(), "Un Piso");
        assertEquals(bus2.getTipo(), "Dos Pisos");
    }

    @Test
    @DisplayName("Test de creacion de asientos")
    public void crearAsientos() {
        bus1.crearAsientos();
        bus2.crearAsientos();
        assertNotNull(bus1.getAsientosArray());
        assertNotNull(bus2.getAsientosArray());
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
    }
}