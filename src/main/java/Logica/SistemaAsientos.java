package Logica;

import Buses.*;

import java.util.ArrayList;

public class SistemaAsientos {

    private Recorrido recorrido;
    private Bus bus;
    private ArrayList<Asiento> asientos;
    private ArrayList<Asiento> asientos_pedidos;
    private int precio;

    public SistemaAsientos(Recorrido recorrido) {
        this.recorrido = recorrido;
        this.bus = recorrido.getBus();
        this.asientos = bus.getAsientosArray();
        this.asientos_pedidos = new ArrayList<>();
    }
    public void elegirAsiento(int index) {
        Asiento aux = asientos.get(index);
        //Si el asiento a elegir esta ocupado lanza excepcion
        if (aux.isOcupado()) {
            //Lanzar excepcion esta ocupado
        }
        else {
            //Agrega a la lista de asientos pedidos el seleccionado y le suma al precio
            asientos_pedidos.add(aux);
            aux.setOcupado(true);
            precio += aux.getPrecio() + bus.getTarifa();
        }
    }
    public void desElegirAsiento(int index) {
        Asiento aux = asientos.get(index);
        //Si el asiento fue pedido por la compra actual, le elimina la reserva
        if (aux.isOcupado() && asientos_pedidos.contains(aux)) {
            asientos_pedidos.remove(aux);
            aux.setOcupado(false);
            precio -= aux.getPrecio() + bus.getTarifa();
        }
        else {
            //Si el asiento fue pedido por otra compra o esta desocupado no hace nada
        }
    }
    public ArrayList<Asiento> getAsientosTotalesArray() {
        return asientos;
    }
    public ArrayList<Asiento> getAsientosPedidosArray() {
        return asientos_pedidos;
    }
    public int getAsientosTotalInt() {
        return bus.getAsientosTotal();
    }
}
