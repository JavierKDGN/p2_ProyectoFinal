package GUI;

import Logica.Recorridos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRecorridos extends JPanel {
    private JComboBox<Recorridos> recorridosComboBox;

    public PanelRecorridos(Color color) {
        setLayout(new FlowLayout());
        this.setBackground(color);
        JButton seleccionarButton = new JButton("Recorridos disponibles");
        add(seleccionarButton);
        recorridosComboBox = new JComboBox<>(Recorridos.values());
        recorridosComboBox.setSelectedIndex(-1); // No seleccionar nada por defecto
        recorridosComboBox.setPreferredSize(new Dimension(200, 25));

        recorridosComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Acciones cuando se selecciona un recorrido
                Recorridos recorridoSeleccionado = (Recorridos) recorridosComboBox.getSelectedItem();
                if (recorridoSeleccionado != null) {
                    //aqui colocar que se actualice el panel de abajo y se muestren los horarios
                }
            }
        });
        add(recorridosComboBox);
        //Mantener el ComboBox siempre visible
        seleccionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recorridosComboBox.showPopup(); //Muestra el menú desplegable del ComboBox
            }
        });
    }
}
