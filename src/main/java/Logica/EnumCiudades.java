package Logica;

public enum EnumCiudades {
    CIUDAD_1("CHILLAN",0),
    CIUDAD_2("CONCEPCION",1),
    CIUDAD_3("LOS ANGELES",1),
    CIUDAD_4("SANTIAGO", 5);

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
