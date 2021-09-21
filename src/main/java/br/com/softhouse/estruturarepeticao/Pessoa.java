package br.com.softhouse.estruturarepeticao;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    
    //método construtor da classe
    public Pessoa(String nome, String cpf, Date dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){
        return nome;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}
