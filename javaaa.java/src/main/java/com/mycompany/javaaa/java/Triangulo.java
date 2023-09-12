
package com.mycompany.javaaa.java;
public class Triangulo {
    
        //at
    private float base;
    private float altura;
    private float area;
    
    //met
    Triangulo(float b, float a){
        this.base = b;
        this.altura = a;
    }
    
    public float CalculaArea(){
        this.area = (this.base * this.altura) / 2;
        return this.area;
    }
}
