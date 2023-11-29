package Logica;

import GUI.VentanaPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaRecorridos sistema = new SistemaRecorridos(10);
            new VentanaPrincipal(sistema);
        });
    }
}