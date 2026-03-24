package aula4_2;

public class Aluno {

    String nome;
    String status;
    Double n1, n2;
    Double media;

    Curso curso;

    void calcMedia () {
        media = (n1 + n2) / 2;

        if (media >= 6.0) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
    }
}
