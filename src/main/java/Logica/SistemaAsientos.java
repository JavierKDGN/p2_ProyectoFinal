package Logica;

import Buses.*;

import java.util.ArrayList;

public class SistemaAsientos {

    private Bus bus;
    private static ArrayList<Asiento> asientos;
    private static ArrayList<Asiento> asientos_seleccionados;
    private static ArrayList<Asiento> asientos_ocupados;
    private int precio;


    public SistemaAsientos(Bus bus) {
        this.bus = bus;
        this.asientos = bus.getAsientosArray();
        this.asientos_seleccionados = new ArrayList<>();
        this.asientos_ocupados = new ArrayList<>();
    }

    /**
     *
     * @param index numero del asiento a elegir
     */
    public void elegirAsiento(int index) {
        Asiento aux = asientos.get(index);
        //Si el asiento a elegir esta ocupado lanza excepcion
        if (aux.isOcupado() == false) {
            asientos_seleccionados.add(aux);
            aux.setTemp_seleccionado(true);
            precio += aux.getPrecio() + bus.getTarifa();
        }
        else {
            //Excepcion no puedes elegir un asiento ocupado
        }
    }

    /**
     *
     * @param index numero del asiento a des-elegir
     */
    public void deselegirAsiento(int index) {
        Asiento aux = asientos.get(index);

        if (aux.getTemp_seleccionado() == true) {
            asientos_seleccionados.remove(aux);
            aux.setTemp_seleccionado(false);
            precio -= aux.getPrecio() + bus.getTarifa();

        }
        else {
            //No se puede deselegir asiento ocupado de antes
        }
    }

    /**
     * Confirma la compra de los asientos
     */
    public void confirmarAsientos() {
        for (Asiento asiento : asientos_seleccionados) {
            asiento.setOcupado(true);
            asientos_ocupados.add(asiento);
        }
        asientos_seleccionados.clear();
    }

    /**
     * Cancela la compra de los asientos
     */
    public void cancelarCompra() {
        for (Asiento asiento : asientos_seleccionados) {
            asiento.setTemp_seleccionado(false);
        }
        asientos_seleccionados.clear();
        precio = 0;
    }
    public ArrayList<Asiento> getAsientosTotalesArray() {
        return asientos;
    }
    public ArrayList<Asiento> getAsientosSeleccionadosArray() {
        return asientos_seleccionados;
    }
    public ArrayList<Asiento> getAsientosOcupadosArray() {
        return asientos_ocupados;
    }
    public int getAsientosTotalInt() {
        return bus.getAsientosTotalInt();
    }
    public int getPrecioInt() {
        return precio;
    }

    @Override
    public String toString() {
        return "Sistema del bus: " + System.identityHashCode(bus) + "\n" +
                "Asientos totales: " + getAsientosTotalInt() + "\n" +
                "Asientos ocupados: " + getAsientosOcupadosArray().size() + "\n" +
                "Asientos seleccionados: " + getAsientosSeleccionadosArray().size() + "\n" +
                "Precio total: $" + getPrecioInt() + "\n";
    }
}
