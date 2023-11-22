package Logica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    private Sistema sistema;
    @BeforeEach
    void setUp() {
        sistema = new Sistema(10);
    }

    @Test
    @DisplayName("Test de Sistema y sus recorridos creados")
    public void testSistema() {
        assertNotNull(sistema);
        sistema.printRecorridos();
    }
}