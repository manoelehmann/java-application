package com.mycompany.cidades;

import javax.swing.JOptionPane;

public class Cidades {

    public static void main(String[] args) {
        
       // Mensagens de Boas Vindas.
      JOptionPane.showMessageDialog(null, "Cadastro de Cidades");
      
      // Construtor
      Cidade c = new Cidade();
      c.setNome(JOptionPane.showInputDialog("Digite o nome da cidade"));
      c.setPopulacao(Integer.parseInt (JOptionPane.showInputDialog("Informe a população de "+c.getNome())));
      c.setRenda(Float.parseFloat(JOptionPane.showInputDialog("Informe a renda de "+c.getNome())));
      c.setUf(JOptionPane.showInputDialog("Informe o Estado"));
      JOptionPane.showMessageDialog(null, "Você digitou\n"+c.getNome()+"\n"+c.getPopulacao()+"Pessoas\nR$ "+c.getRenda()+
              "\n"+c.getUf());
    }
}
