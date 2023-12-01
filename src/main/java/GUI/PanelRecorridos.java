package GUI;

import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelRecorridos extends JPanel {
    private JComboBox<String> recorridosComboBox; //combobox para seleccionar
    private ArrayList<Recorrido> recorridos;

    public PanelRecorridos(Color color, ArrayList<Recorrido> recorridos) {
        this.setBackground(color);
        this.recorridos = recorridos;

        //array de String con la representación de los recorridos
        String[] recorridosArray = new String[recorridos.size()];
        for (int i = 0; i < recorridos.size(); i++) {
            recorridosArray[i] = recorridos.get(i).toString();
        }
        //crear el JComboBox con el array de recorridos
        recorridosComboBox = new JComboBox<>(recorridosArray);
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
