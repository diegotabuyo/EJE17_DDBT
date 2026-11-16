package org.upiiz.basicas;
import javax.swing.UIManager;

//Diego Daniel Becerra Tabuyo 3IM1


public class Main {
    public static void main(String[] args) {
        // Cambiar el look de nuestra aplicación
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e);
        }

        new VentanaCalculadora("Calculadora Basica");
    }
}