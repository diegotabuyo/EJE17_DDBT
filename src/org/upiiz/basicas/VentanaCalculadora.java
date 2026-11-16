package org.upiiz.basicas;

import javax.swing.*;

public class VentanaCalculadora extends JFrame {
    private Calculadora calculadora;

    // Constructor principal original
    public VentanaCalculadora(String titulo) {
        calculadora = new Calculadora();
        setContentPane(calculadora.obtenerPanel());
        setTitle(titulo);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Constructor sobrecargado para cumplir con la rúbrica
    public VentanaCalculadora() {
        this("Calculadora Básica");
    }
}