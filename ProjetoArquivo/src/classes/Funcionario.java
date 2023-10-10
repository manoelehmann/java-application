package classes;

// IMPORT PARA MANIPULAR ARQUIVOS
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

// IMPORT PARA TRATAR DE EXCEÇÕES
import java.io.IOException;

// IMPORT JOPTIONPANE
import javax.swing.JOptionPane;

public class Funcionario {
    
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //  *******SALVAR********* //
    
    public void salvarEmArquivo(){
     try{   
         File arquivo = new File("funcionario.txt");// CRIA O ARQUIVO
         FileWriter fw = new FileWriter(arquivo,true); // ABRE O ARQUIVO PARA ESCRITA
         BufferedWriter bw = new BufferedWriter(fw); // CONTROLAR A FILA DE ESCRITA NO ARQUIVO
         
         // ESCREVENDO OS DADOS NO ARQUIVO
         
         bw.write(this.id+","+this.nome); // JUNTANDO DADOS
         bw.newLine(); // CRIANDO UMA NOVA LINHA
         bw.close(); // FECHANDO O ARQUIVO
     } catch(IOException e){
         e.printStackTrace();
     }
     }
    }
    
    

