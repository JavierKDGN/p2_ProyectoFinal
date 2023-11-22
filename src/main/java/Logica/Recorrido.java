package Logica;

import java.time.LocalTime;

public class Recorrido {
    private final EnumHorarios horario_salida;
    private final String origen;
    private final String destino;
    private final LocalTime hora_salida;
    private final int distancia;
    private LocalTime hora_llegada;

    public Recorrido(EnumCiudades origen , EnumCiudades destino, EnumHorarios horario_salida) {
        this.origen = origen.getNombre();
        this.destino = destino.getNombre();
        this.horario_salida = horario_salida;
        this.hora_salida = horario_salida.getHora();
        this.distancia = Math.abs(origen.getDistancia() - destino.getDistancia());

        calcularHoraLLegada();
    }
    private void calcularHoraLLegada() {
        //if distancia < 2 entonces el viaje dura 1 hora y media
        final int MEDIA_HORA = 30;
        int indice_aux;

        switch (distancia) {
            case 0, 1 -> indice_aux = MEDIA_HORA * 3; //Chillan-Concepcion-LosAngeles
            case 4 -> indice_aux = MEDIA_HORA * 10;//LosAngeles/Concepcion - Santiago
            case 5 -> indice_aux = MEDIA_HORA * 9;//Chillan-Santiago
            default -> indice_aux = 0;
        }

        hora_llegada = horario_salida.getHora().plusMinutes(indice_aux);
    }

    //Getters y Setters de los atributos internos
    public EnumHorarios getHorario_salida() {
        return horario_salida;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public LocalTime getHora_salida() {
        return hora_salida;
    }
    public int getDistancia() {
        return distancia;
    }
    public LocalTime getHora_llegada() {
        return hora_llegada;
    }

    public String toString() {
        return hora_salida + "-" + hora_llegada + " " + origen + "-" + destino;
    }

}
