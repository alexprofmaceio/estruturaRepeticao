package br.com.softhouse.estruturarepeticao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;

public class Principal {
    public static void main(String[] args) throws ParseException {

        String[] teste = {"1","5","4","7","9"};
        System.out.println(Arrays.toString(teste));
        String[] novo = ArrayUtils.insert(2, teste, "10");
   
        /*
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner dados = new Scanner(System.in);
        
        String nome;
        String cpf;
        String dataNascimento;
        String matricula;
        double salario;
        String disciplina;
        int opcao;
        
        do{
            System.out.println("MENU DE CADATRO");
            System.out.println("1 - Cadastro de Aluno\n");
            System.out.println("2 - Cadastro de Professor\n");
            System.out.println("3 - Sair do Cadastro\n");
            opcao = dados.nextInt();
            
            switch(opcao){
                case 1:
                System.out.println("CADASTRO DE ALUNO");    
                System.out.println("Informe o nome: ");
                nome = dados.nextLine();

                System.out.println("Informe o cpf: ");
                cpf = dados.nextLine();

                System.out.println("Informe a data de nascimento: ");
                dataNascimento = dados.nextLine();

                System.out.println("Informe a matrícula: ");
                matricula = dados.nextLine();

                Aluno aluno = new Aluno(nome, cpf, formato.parse(dataNascimento), matricula);
                System.out.println("Nome: " +aluno.getNome() + "\n" + 
                        "Cpf: " + aluno.getCpf() + "\n" + 
                        "Data de Nascimento" + aluno.getDataNascimento() + "\n" +
                        "Matrícula: " + aluno.getMatricula() + "\n");
                break;
                
                case 2:
                System.out.println("CADASTRO DE PROFESSOR");    
                System.out.println("Informe o nome: ");
                nome = dados.nextLine();

                System.out.println("Informe o cpf: ");
                cpf = dados.nextLine();

                System.out.println("Informe a data de nascimento: ");
                dataNascimento = dados.nextLine();

                System.out.println("Informe a salário: ");
                salario = dados.nextDouble();

                System.out.println("Informe a disciplina: ");
                disciplina = dados.nextLine();

                Professor professor = new Professor(nome, cpf, formato.parse(dataNascimento), salario, disciplina);
                System.out.println("Nome: " +professor.getNome() + "\n" + 
                        "Cpf: " + professor.getCpf() + "\n" + 
                        "Data de Nascimento" + professor.getDataNascimento() + "\n" +
                        "Salário: " + professor.getSalario() + "\n" +
                        "Disciplina: " + professor.getDisciplina() + "\n");
                break;
                
                default:
                    System.out.println("Opção inválida!! Saindo...");
                    System.exit(0);
                    break;
            }
        } while(opcao < 3);
        System.exit(0); */
    } 
}

