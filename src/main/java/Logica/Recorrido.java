package Logica;

public class Recorrido {
    private String origen;
    private String destino;
    private String hora_salida;
    private String hora_llegada;
    private int distancia;
    private int aux_indice;

    public Recorrido(EnumCiudades origen , EnumCiudades destino, Horarios hora_salida) {
        this.origen = origen.getNombre();
        this.destino = destino.getNombre();
        this.hora_salida = hora_salida.getHora();
        this.distancia = Math.abs(origen.getDistancia() - destino.getDistancia());

        switch (distancia) {
            case 0 -> aux_indice = 3;
            case 1 -> aux_indice = 10;
        }

        this.hora_llegada = Horarios.values()[hora_salida.getIndice() + aux_indice].getHora();
    }

    public String mostrarRecorrido() {
        return hora_salida + "-" + hora_llegada + " " + origen + "-" + destino;
    }


}
