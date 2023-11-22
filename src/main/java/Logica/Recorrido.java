package Logica;

public class Recorrido {
    private final EnumHorarios horario_salida;
    private final String origen;
    private final String destino;
    private final String hora_salida;
    private final int distancia;
    private String hora_llegada;
    private boolean fdr = false; //Viaje fuera de rango

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
        final String FUERA_DE_RANGO = "FDR     ";
        final int UNA_HORA_Y_MEDIA = 3;
        final int CUATRO_HORAS_Y_MEDIA = 9;
        final int CINCO_HORAS = 10;
        int indice_aux;

        switch (distancia) {
            case 0, 1 -> indice_aux = UNA_HORA_Y_MEDIA; //Chillan-Concepcion-LosAngeles
            case 4 -> indice_aux = CINCO_HORAS;//LosAngeles/Concepcion - Santiago
            case 5 -> indice_aux = CUATRO_HORAS_Y_MEDIA;//Chillan-Santiago
            default -> indice_aux = 0;
        }

        int indice_horario = horario_salida.ordinal();
        if (indice_horario + indice_aux > EnumHorarios.values().length - 1) {
            //El viaje dura fuera del rango de horarios
            hora_llegada = FUERA_DE_RANGO;
            fdr = true;
        }
        else {
            hora_llegada = EnumHorarios.values()[indice_horario + indice_aux].getHora();
        }
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
    public String getHora_salida() {
        return hora_salida;
    }
    public int getDistancia() {
        return distancia;
    }
    public String getHora_llegada() {
        return hora_llegada;
    }
    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    //Revisa si el recorrido esta fuera de rango de horarios
    public boolean isFueraDeRango() {
        return fdr;
    }

    public String toString() {
        return hora_salida + "-" + hora_llegada + " " + origen + "-" + destino;
    }

}
