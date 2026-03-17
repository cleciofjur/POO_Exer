package aula2;
import java.util.Scanner;

public class TesteAluno {
    public static void main (String[] args) {
        Scanner into = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite seu nome: ");
        aluno.nome = into.next();

        System.out.print("Digite seu curso: ");
        aluno.curso = into.next();

        System.out.print("Digite a 1º nota: ");
        aluno.n1 = into.nextDouble();

        System.out.print("Digite a 2º nota: ");
        aluno.n2 = into.nextDouble();

        aluno.calcMedia();

        System.out.println("\n------------------------------------------------");

        System.out.println("Nome do aluno: " +aluno.nome);
        System.out.println("Curso: " +aluno.curso);
        System.out.println("1º nota: " +aluno.n1);
        System.out.println("2º nota: " +aluno.n2);
        System.out.println("Média de notas: " +aluno.media);
        System.out.println("Status: " +aluno.status);

    }
}
