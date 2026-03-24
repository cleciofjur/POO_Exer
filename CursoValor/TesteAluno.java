package aula4_2;

import java.util.Scanner;

public class TesteAluno {
    public static void main (String [] args) {

        Curso curso1 = new Curso ("Engenharia de Software", 1000.0);
        Curso curso2 = new Curso ("Engenharia de Computação", 700.0);
        Curso curso3 = new Curso ("Sistemas de Informação", 800.0);
        Curso curso4 = new Curso ("Analise e Desenvolvimento de Sistemas", 750.0);

        Aluno aluno = new Aluno ();

        Scanner into = new Scanner(System.in);

        System.out.print ("Digite o nome do aluno: ");
        aluno.nome = into.next();

        System.out.print ("Digite a 1ª nota do aluno: ");
        aluno.n1 = into.nextDouble();

        System.out.print ("Digite a 2ª nota do aluno: ");
        aluno.n2 = into.nextDouble();

        aluno.calcMedia();

        System.out.println ("---Cursos---");

        System.out.print ("Curso 1: " +curso1.nome+ "valor: R$ " +curso1.valor);
        System.out.print ("Curso 2: " +curso2.nome+ "valor: R$ " +curso2.valor);
        System.out.print ("Curso 3: " +curso3.nome+ "valor: R$ " +curso3.valor);
        System.out.print ("Curso 4: " +curso4.nome+ "valor: R$ " +curso4.valor);



    }
}
