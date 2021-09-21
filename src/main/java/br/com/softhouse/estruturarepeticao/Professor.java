package br.com.softhouse.estruturarepeticao;

import java.util.Date;

public class Professor  extends Pessoa{
    private double salario;
    private String disciplina;
    
    //método construtor da classe
    public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina){
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getDisciplina(){
        return disciplina;
    }
    
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
}
