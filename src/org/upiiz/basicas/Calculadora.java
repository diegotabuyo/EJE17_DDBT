package org.upiiz.basicas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField textNumero2;
    private JTextField textNumero1;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JLabel labelResult;
    private JPanel panelPrincipal;
    private JLabel labelNumero1;
    private JLabel labelNumero2;

    public Calculadora() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumar();
            }
        });

        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restar();
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicar();
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dividir();
            }
        });
    }

    public void sumar() {
        try {
            double n1 = Double.parseDouble(textNumero1.getText());
            double n2 = Double.parseDouble(textNumero2.getText());
            double suma = n1 + n2;
            labelResult.setText("Resultado: " + suma);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelPrincipal, "Ingrese numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void restar() {
        try {
            double n1 = Double.parseDouble(textNumero1.getText());
            double n2 = Double.parseDouble(textNumero2.getText());
            double resta = n1 - n2;
            labelResult.setText("Resultado: " + resta);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelPrincipal, "Ingrese numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void multiplicar() {
        try {
            double n1 = Double.parseDouble(textNumero1.getText());
            double n2 = Double.parseDouble(textNumero2.getText());
            double mult = n1 * n2;
            labelResult.setText("Resultado: " + mult);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelPrincipal, "Ingrese numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void dividir() {
        try {
            double n1 = Double.parseDouble(textNumero1.getText());
            double n2 = Double.parseDouble(textNumero2.getText());

            if (n2 == 0) {
                JOptionPane.showMessageDialog(panelPrincipal, "No se puede dividir entre cero", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                double div = n1 / n2;
                labelResult.setText("Resultado: " + div);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelPrincipal, "Ingrese numeros validos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JPanel obtenerPanel() {
        return panelPrincipal;
    }
}