package Logica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecorridoTest {

    private Recorrido rec;
    @BeforeEach
    void setUp() {
        rec = new Recorrido(EnumCiudades.CIUDAD_1,EnumCiudades.CIUDAD_4,Horarios.HORA_1);
    }

    @Test
    @DisplayName("Test de recorrido")
    public void testRecorridoCreacion() {
        assertNotNull(rec);
        System.out.println(rec.mostrarRecorrido());
    }
}