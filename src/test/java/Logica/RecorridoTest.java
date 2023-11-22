package Logica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecorridoTest {

    private Recorrido rec;
    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test de recorridos Chillan-Conce y vuelta")
    public void testRecorridoCreacion() {

        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_1,EnumCiudades.CIUDAD_2, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_2,EnumCiudades.CIUDAD_1, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }
    }

    @Test
    @DisplayName("Test de recorridos Los Angeles")
    public void testRecorridoLosAngeles() {
        //Chillan a Los Angeles
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_1,EnumCiudades.CIUDAD_3, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Los Angeles a Chillan
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_3,EnumCiudades.CIUDAD_1, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Concepcion a Los Angeles
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_2,EnumCiudades.CIUDAD_3, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Los Angeles a Concepcion
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_3,EnumCiudades.CIUDAD_2, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Santiago a Los Angeles
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_4,EnumCiudades.CIUDAD_3, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Los Angeles a Santiago
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_3,EnumCiudades.CIUDAD_4, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }
    }

    @Test
    @DisplayName("Test de recorridos Santiago")
    public void testRecorridoSantiago() {
        //Chillan a Santiago
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_1,EnumCiudades.CIUDAD_4, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Santiago a Chillan
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_4,EnumCiudades.CIUDAD_1, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Concepcion a Santiago
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_2,EnumCiudades.CIUDAD_4, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Santiago a Concepcion
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_4,EnumCiudades.CIUDAD_2, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Los Angeles a Santiago
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_3,EnumCiudades.CIUDAD_4, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }

        //Santiago a Los Angeles
        for (EnumHorarios hora : EnumHorarios.values()) {
            rec = new Recorrido(EnumCiudades.CIUDAD_4,EnumCiudades.CIUDAD_3, hora);
            assertNotNull(rec);
            System.out.println(rec.toString());
        }
    }
}