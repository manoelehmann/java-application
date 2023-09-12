package com.mycompany.jaava;

import javax.swing.JOptionPane; // BIBLIOTECA DE INTERFACE GRÁFICA E MENSAGENS

public class Jaava {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá Mundo!");
        float base = Float.parseFloat(JOptionPane.showInputDialog("" + "Informe o valor da base do Retangulo"));
        
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a " + "altura do Retangulo"));
        
        Retangulo r = new Retangulo(base,altura);
        
        JOptionPane.showMessageDialog(null, "O valor da área é: " + r.CalculaArea()+"cm2");
        
    }
}
