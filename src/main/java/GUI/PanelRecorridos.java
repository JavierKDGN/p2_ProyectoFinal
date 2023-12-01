package GUI;

import Logica.Recorrido;
import Logica.SistemaRecorridos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelRecorridos extends JPanel {
    private JComboBox<String> recorridosComboBox; //combobox para seleccionar
    private SistemaRecorridos sistemaRecorridos;
    private ArrayList<Recorrido> recorridos;
    private String[] recorridos_String;

    public PanelRecorridos(Color color) {
        this.setBackground(color);
        sistemaRecorridos = new SistemaRecorridos();
        recorridos = sistemaRecorridos.getRecorridos();

        //array de String con la representación de los recorridos
        recorridos_String = new String[recorridos.size()];
        for (int i = 0; i < recorridos.size(); i++) {
            recorridos_String[i] = recorridos.get(i).toString();
        }
        //crear el JComboBox con el array de recorridos
        recorridosComboBox = new JComboBox<>(recorridos_String);
        this.add(recorridosComboBox);
    }

    public Recorrido getRecorridoSeleccionado() {
        int selectedIndex = recorridosComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            return recorridos.get(selectedIndex);
        }
        return null;
    }
}
