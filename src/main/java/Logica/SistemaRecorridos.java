package Logica;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaRecorridos {
    private ArrayList<Recorrido> recorridos;
    private RecorridoFactory recorrido_Factory;
    private int cantidad_recorridos;
    public SistemaRecorridos(int cantidad_recorridos) {
        this.recorridos = new ArrayList<Recorrido>();
        this.recorrido_Factory = new RecorridoFactory();
        this.cantidad_recorridos = cantidad_recorridos;

        crearRecorridos();
        printRecorridos();
    }
    public void crearRecorridos() {
        //Crea los recorridos aleatoriamente mediante el Factory
        for (int i = 0; i < cantidad_recorridos; i++) {
            Recorrido rec = recorrido_Factory.crearRecorridoAleatorio();
            recorridos.add(rec);
        }
        //Ordena los recorridos por hora de salida
        Collections.sort(recorridos);
    }
    public void printRecorridos() {
        for (Recorrido recorrido : recorridos) {
            System.out.println(recorrido.toString());
        }
    }
}
