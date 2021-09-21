package br.com.softhouse.estruturarepeticao;

import java.util.Date;

public class Aluno extends Pessoa{
    private String matricula;
    
    //método construtor da classe
    public Aluno(String nome, String cpf, Date dataNascimento, String matricula){
       super(nome, cpf, dataNascimento);
       this.matricula = matricula; 
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
