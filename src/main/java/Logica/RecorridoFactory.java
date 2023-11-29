package Logica;

import java.util.Random;

public class RecorridoFactory {
    private final EnumCiudades[] ciudades;
    private final EnumHorarios[] horarios;
    private final Random random;

    public RecorridoFactory() {
        this.ciudades = EnumCiudades.values();
        this.horarios = EnumHorarios.values();
        this.random = new Random();
    }

    public Recorrido crearRecorridoAleatorio() {
        EnumCiudades origen;
        EnumCiudades destino;
        do {
            origen = ciudades[random.nextInt(ciudades.length)];
            destino = ciudades[random.nextInt(ciudades.length)];
        } while(origen == destino);
        EnumHorarios horario = horarios[random.nextInt(horarios.length)];

        return new Recorrido(origen, destino, horario);
    }

}
