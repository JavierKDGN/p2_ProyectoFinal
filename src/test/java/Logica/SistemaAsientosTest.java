package Logica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaAsientosTest {
    private SistemaAsientos sistema_asientos;
    private Recorrido recorrido;
    @BeforeEach
    void setUp() {
        recorrido = new Recorrido(EnumCiudades.CIUDAD_1, EnumCiudades.CIUDAD_2, EnumHorarios.HORA_1);
        recorrido.debugAsignarBus(1);
        sistema_asientos = new SistemaAsientos(recorrido.getBus());
    }

    @Test
    @DisplayName("Test de SistemaAsientos y su estado al crearse")
    public void testSistemaAsientos() {
        assertNotNull(sistema_asientos);
        System.out.println(sistema_asientos.toString());
    }

    @Test
    @DisplayName("Test de elegirAsiento")
    public void testElegirAsiento() {
        for (int i = 0; i < 20;i++) {
            sistema_asientos.elegirAsiento(i);
        }
        assertEquals(20, sistema_asientos.getAsientosSeleccionadosArray().size());
    }

    @Test
    @DisplayName("Test de confirmacion asientos")
    public void testConfirmacion() {
        testElegirAsiento();
        sistema_asientos.confirmarAsientos();
        assertEquals(20, sistema_asientos.getAsientosOcupadosArray().size());
        assertEquals(0, sistema_asientos.getAsientosSeleccionadosArray().size());
    }

    @Test
    @DisplayName("Test de deselegir asiento")
    public void testDeselegirAsiento() {
        testElegirAsiento();
        sistema_asientos.deselegirAsiento(0);
        assertEquals(19, sistema_asientos.getAsientosSeleccionadosArray().size());
    }
}