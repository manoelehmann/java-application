package com.mycompany.herancas;
// Extends é o comando de ligação de classe e superclasse.
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String sexo;

    public String getCpf(){
        
        return cpf;
    }

    public void setCpf(String cpf){
        
        this.cpf = cpf;
    }

    public String getSexo(){
        
        return sexo;
    }

    public void setSexo(String sexo){
        
        this.sexo = sexo;
    }
    
    
}
