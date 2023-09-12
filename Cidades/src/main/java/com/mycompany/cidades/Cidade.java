package com.mycompany.cidades;

public class Cidade {
    // Atributos
    
    private String nome;
    private int populacao;
    private float renda;
    private String uf; // UF - Unidade de Federação.
    
    // Métodos
    // Métodos set inserem informação em um atributo de classe.
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // Métodos "get" recuperam informação de um atributo de classe.
    public String getNome(){
        return this.nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
}
