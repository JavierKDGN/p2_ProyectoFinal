package Logica;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaRecorridos {
    private final int CANTIDAD_RECORRIDOS = 10;
    private RecorridoFactory recorrido_Factory;
    private ArrayList<Recorrido> recorridos;

    public SistemaRecorridos() {
        this.recorridos = new ArrayList<Recorrido>();
        this.recorrido_Factory = new RecorridoFactory();

        crearRecorridos();
    }

    /**
     * Crea los recorridos aleatoriamente mediante el Factory
     */
    private void crearRecorridos() {
        //Crea los recorridos aleatoriamente mediante el Factory
        for (int i = 0; i < CANTIDAD_RECORRIDOS; i++) {
            Recorrido rec = recorrido_Factory.crearRecorridoAleatorio();
            recorridos.add(rec);
            rec.calcularHoraLLegada();
        }
        //Ordena los recorridos por hora de salida
        Collections.sort(recorridos);
    }

    /**
     * Imprime los recorridos
     */
    public void printRecorridos() {
        for (Recorrido recorrido : recorridos) {
            System.out.println(recorrido.toString());
        }
    }
    public ArrayList<Recorrido> getRecorridos() {
        return recorridos;
    }
}
