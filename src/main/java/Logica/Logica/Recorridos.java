package Logica;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;


public enum Recorridos {
    RECORRIDO_1("Concepcion-Chillan", 4000, (ArrayList<Horarios>) asList(Horarios.HORA_1, Horarios.HORA_2,Horarios.HORA_5,Horarios.HORA_6,Horarios.HORA_7,Horarios.HORA_8)),
    RECORRIDO_2("Chillan-Concepcion", 4000,(ArrayList<Horarios>) asList(Horarios.HORA_1, Horarios.HORA_2,Horarios.HORA_5,Horarios.HORA_6,Horarios.HORA_7,Horarios.HORA_8)),
    RECORRIDO_3("Concepcion-Los Angeles", 5500,(ArrayList<Horarios>) asList(Horarios.HORA_3, Horarios.HORA_4,Horarios.HORA_5,Horarios.HORA_6,Horarios.HORA_10)),
    RECORRIDO_4("Los Angeles-Concepcion", 5500,(ArrayList<Horarios>) asList(Horarios.HORA_3, Horarios.HORA_4,Horarios.HORA_5,Horarios.HORA_6,Horarios.HORA_10)),
    RECORRIDO_5("Chillan-Los Angeles", 7000,(ArrayList<Horarios>) asList(Horarios.HORA_2, Horarios.HORA_2,Horarios.HORA_4,Horarios.HORA_5,Horarios.HORA_7,Horarios.HORA_9)),
    RECORRIDO_6("Los Angeles-Chillan", 7000,(ArrayList<Horarios>) asList(Horarios.HORA_2, Horarios.HORA_2,Horarios.HORA_4,Horarios.HORA_5,Horarios.HORA_7,Horarios.HORA_9));

    private final String nombre;
    private final int precio;
    private ArrayList<Horarios> horariosDisponibles;

    Recorridos(String nombre, int precio, ArrayList<Horarios> horariosDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.horariosDisponibles = new ArrayList<>(horariosDisponibles);
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public List<Horarios> getHorariosDisponibles() {
        return new ArrayList<>(horariosDisponibles);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
