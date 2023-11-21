package Logica;

public enum EnumCiudades {
    CIUDAD_1("CHILLAN",0),
    CIUDAD_2("CONCEPCION",0),
    CIUDAD_3("LOS ANGELES",0),
    CIUDAD_4("SANTIAGO", 1);

    private final String nombre;
    private final int distancia;

    EnumCiudades(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getDistancia() {
        return this.distancia;
    }
}
