package Logica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecorridoFactoryTest {
    private RecorridoFactory recorridoFactory;
    private final int CANTIDAD_RECORRIDOS = 20;

    @BeforeEach
    void setUp() {
        recorridoFactory = new RecorridoFactory();
    }

    @Test
    @DisplayName("Crear recorridos")
    public void testCrearRecorridos() {
        for (int i = 0; i < CANTIDAD_RECORRIDOS; i++) {
            Recorrido recorrido = recorridoFactory.crearRecorridoAleatorio();
            assertNotNull(recorrido);
            System.out.println(recorrido.toString());
        }
    }
}