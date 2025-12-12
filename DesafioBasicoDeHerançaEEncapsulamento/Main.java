/*
DESAFIO – HERANÇA E ENCAPSULAMENTO (RESUMIDO)

1) Criar a classe Pessoa:
   - Atributos privados: nome, idade
   - Getters e Setters para ambos

2) Criar a classe Aluno que herda de Pessoa:
   - Atributo privado: matricula
   - Getters e Setters

3) No metodo main:
   - Criar um objeto Aluno
   - Definir nome, idade e matricula usando setters
   - Exibir os valores usando getters

Objetivo:
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Random geradorDeMatriculas = new Random();

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        System.out.println("Digite a quantidade de alunos que você quer cadastrar: ");
        int qtdAlunosCadastrar = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= qtdAlunosCadastrar; i++) {
            Aluno aluno = new Aluno();
            System.out.println(String.format("Digite o nome do aluno %d: ", i));
            aluno.setNome(input.nextLine());
            System.out.println("Digite a idade do aluno: ");
            aluno.setIdade(input.nextByte());
            input.nextLine();
            int matriculaGerada = (int) (Math.random()*1000000);
            String matriculaEmString = String.valueOf(matriculaGerada);
            int tamanhoDaMatricula = matriculaEmString.length();
                while (tamanhoDaMatricula != 6){
                    matriculaGerada = (int) (Math.random()*1000000);
                    matriculaEmString = String.valueOf(matriculaGerada);
                    tamanhoDaMatricula = matriculaEmString.length();
                }
            aluno.setMatricula(matriculaGerada);
            alunos.add(aluno);
        }
        for (Aluno aluno : alunos){
            System.out.println(String.format("""
                    dados do aluno: 
                    Nome: %s
                    idade: %d
                    matrícula %d
                    """, aluno.getNome(), aluno.getIdade(), aluno.getMatricula()));
        }
    }
}