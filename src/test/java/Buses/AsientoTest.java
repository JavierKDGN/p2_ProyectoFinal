package Buses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AsientoTest {
    private AsientoFactory factory;
    private ArrayList<Asiento> asientos;

    @BeforeEach
    void setUp() {
        factory = new AsientoFactory();
        asientos = new ArrayList<Asiento>();
    }

    @Test
    public void testAsientos() {
        for (int i = 0; i < 20; i++) {
            asientos.add(factory.crearAsiento(TipoAsiento.NORMAL));
        }
        for(int i = 0; i < 10; i++) {
            asientos.add(factory.crearAsiento(TipoAsiento.SEMICAMA));
        }
        for(int i = 0; i < 5; i++) {
            asientos.add(factory.crearAsiento(TipoAsiento.CAMA));
        }

        for (Asiento asiento: asientos) {
            System.out.println(asiento.getTipo() + " " + asiento.getPrecio());
        }
    }
}