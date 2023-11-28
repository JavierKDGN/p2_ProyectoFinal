package Logica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaRecorridosTest {
    private SistemaRecorridos sistemaRecorridos;
    @BeforeEach
    void setUp() {
        sistemaRecorridos = new SistemaRecorridos(10);
    }

    @Test
    @DisplayName("Test de Sistema y sus recorridos creados")
    public void testSistema() {
        assertNotNull(sistemaRecorridos);
        sistemaRecorridos.printRecorridos();
    }
}