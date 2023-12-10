package Logica;

import Buses.*;

import java.util.ArrayList;

public class SistemaAsientos {

    private Bus bus;
    private ArrayList<Asiento> asientos;
    private ArrayList<Asiento> asientos_seleccionados;
    private ArrayList<Asiento> asientos_ocupados;
    private int precio;

    public SistemaAsientos(Bus bus) {
        this.bus = bus;
        this.asientos = bus.getAsientosArray();
        this.asientos_seleccionados = new ArrayList<>();
        this.asientos_ocupados = new ArrayList<>();
    }
    public void elegirAsiento(int index) {
        Asiento aux = asientos.get(index);
        //Si el asiento a elegir esta ocupado lanza excepcion
        if (aux.isOcupado() == false) {
            asientos_seleccionados.add(aux);
            aux.setTemp_seleccionado(true);
            precio += aux.getPrecio() + bus.getTarifa();
        }
        else {
            //Excepcion
        }
    }
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
    public void confirmarAsientos() {
        for (Asiento asiento : asientos_seleccionados) {
            asiento.setOcupado(true);
            asientos_ocupados.add(asiento);
        }
        asientos_seleccionados.clear();
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
}
