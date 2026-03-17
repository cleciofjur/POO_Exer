package aula2;

public class Aluno {
    String nome;
    String curso;
    Double n1, n2;
    Double media;
    String status;

    void calcMedia() {
        media = (n1 + n2)/2;

        if (media >= 6) {
            status = "Aprovado";
        } else if (media >= 4.0) {
            status = "Em exame";
        } else {
            status = "Reprovado";
        }
    }
}
