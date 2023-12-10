package GUI;

import Logica.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRecorridos extends JPanel {
    private SistemaRecorridos sistemaRecorridos;
    private ArrayList<Recorrido> recorridos;
    private RecorridoComboBox recorridosComboBox; //combobox para seleccionar
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
        recorridosComboBox = new RecorridoComboBox(recorridos_String);
        this.add(recorridosComboBox);
    }
    private class RecorridoComboBox extends JComboBox implements ActionListener {
        public RecorridoComboBox(String[] recorridos) {
            super(recorridos);
            this.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Recorrido selectedRecorrido = recorridos.get(recorridosComboBox.getSelectedIndex());
            abrirVentanaAsientos(selectedRecorrido);
        }
    }
    public Recorrido getRecorridoSeleccionado() {
        int selectedIndex = recorridosComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            return recorridos.get(selectedIndex);
        }
        return null;
    }
    private void abrirVentanaAsientos(Recorrido recorrido) {
        VentanaAsientos ventanaAsientos = new VentanaAsientos(recorrido);
        ventanaAsientos.setVisible(true);
    }
}