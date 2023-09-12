package com.mycompany.javaaa.java;
import java.util.Scanner;
public class OrientandoTriangulo {
    
        public static void main(String[] args) {
        System.out.println("Projeto de Classes");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor da base: ");
        
        float base = entrada.nextFloat();
        System.out.println("Informe o valor da altura: ");
        
        float altura = entrada.nextFloat();
        Triangulo r = new Triangulo(base,altura);
        System.out.println ("o Valor da area e: "+r.CalculaArea()+ " cm2");
        
        }
    
}
