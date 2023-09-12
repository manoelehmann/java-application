package com.mycompany.herancas;
import javax.swing.JOptionPane;
public class Herancas {

    public static void main(String[] args) {
        // PESSOA
        Pessoa p = new Pessoa();
        
        p.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Pessoa"))); // Cria uma Interface.
        // Integer serve para transforma a interface em Int.
        
        p.setNome(JOptionPane.showInputDialog("Informe o nome da Pessoa"));
        JOptionPane.showMessageDialog(null, "Pessoa "+p.getId()+ "\nNome: "+p.getNome()); // Informar para o usuario o que ele digitou.
        //PESSOA
        
        
        // PESSOA FISICA
        PessoaFisica pf = new PessoaFisica();
        
        pf.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Pessoa Fisica")));
        
        pf.setNome(JOptionPane.showInputDialog("Informe o nome da Pessoa Fisica"));
        
        pf.setCpf(JOptionPane.showInputDialog("Informe o CPF da Pessoa Fisica"));
        
        pf.setSexo(JOptionPane.showInputDialog("Informe o gênero da Pessoa Fisica"));
        
        JOptionPane.showMessageDialog(null, "Pessoa: "+pf.getId()+"\nNome:"+pf.getNome()+"\nGênero: "+pf.getSexo()+"\nCPF:"+pf.getNome());
        // PESSOA FISICA
        
        
        //PESSOA JURIDICA
        PessoJuridica pj = new PessoJuridica();
        
        pj.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Pessoa Juridica")));
        
        pj.setNome(JOptionPane.showInputDialog("Informe o nome da Pessoa Juridica"));
        
        pj.setCNPJ(JOptionPane.showInputDialog("Informe o CNPJ da Pessoa Juridica"));
        
        pj.setRazaoSocial(JOptionPane.showInputDialog("Informe a Razão Social da Pessoa Juridica"));
        
        pf.setCpf(JOptionPane.showInputDialog("Informe o CPF da Pessoa Juridica"));
        
        pf.setSexo(JOptionPane.showInputDialog("Informe o gênero da Pessoa Juridica"));
       
        JOptionPane.showMessageDialog(null, "Pessoa: "+pj.getId()+"\nNome:"+pj.getNome()+"\nGênero: "+pf.getSexo()+"\nCPF:"+pj.getNome()+"\nCNPJ: "+pj.getCNPJ()+ "\nRazão Social: "+pj.getRazaoSocial());
        // PESSOA JURIDICA
        
        
        // PROPRIETARIO
        
        Proprietario pp = new Proprietario();
        
        pp.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Pessoa Juridica")));
        
        pp.setNome(JOptionPane.showInputDialog("Informe o nome da Pessoa Juridica"));
        
        pp.setCNPJ(JOptionPane.showInputDialog("Informe o CNPJ da Pessoa Juridica"));
        
        pp.setRazaoSocial(JOptionPane.showInputDialog("Informe a Razão Social da Pessoa Juridica"));
        
        pf.setCpf(JOptionPane.showInputDialog("Informe o CPF da Pessoa Juridica"));
        
        pf.setSexo(JOptionPane.showInputDialog("Informe o gênero da Pessoa Juridica"));
       
        JOptionPane.showMessageDialog(null, "Pessoa: "+pj.getId()+"\nNome:"+pj.getNome()+"\nGênero: "+pf.getSexo()+"\nCPF:"+pj.getNome()+"\nCNPJ: "+pj.getCNPJ()+ "\nRazão Social: "+pj.getRazaoSocial());
        
        
        
        // PROPRIETARIO
        
        
        // FUNCIONARIO
        
        
        // FUNCIONARIO
        
        
        
        
        
        
        
    }
}
