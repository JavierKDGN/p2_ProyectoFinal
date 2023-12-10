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
        int aux = 0, i, j;
        for (aux = 0; aux < 20; aux++) {
            asientos.add(factory.crearAsiento(TipoAsiento.NORMAL,aux));
        }
        for(i = aux; i < aux + 20; i++) {
            asientos.add(factory.crearAsiento(TipoAsiento.SEMICAMA, i));
        }
        for(j = i; j < i + 5; j++) {
            asientos.add(factory.crearAsiento(TipoAsiento.CAMA, j));
        }

        for (Asiento asiento: asientos) {
            System.out.println(asiento.getTipo() + " " + asiento.getPrecio());
        }
    }
}