package com.mycompany.jaava;

public class Retangulo {
    //at
    private float base;
    private float altura;
    private float area;
    
    //met
    Retangulo(float b, float a){
        this.base = b;
        this.altura = a;
    }
    
    public float CalculaArea(){
        this.area = this.base * this.altura;
        return this.area;
    }
}
    