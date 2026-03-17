package aula3;

public class Aluno {
    String nome;
    String curso;
    Integer n1, n2;
    String status;
    double media;

    void calcMedia() {
        media = (n1 + n2) / 2;

        if (media >= 6) {
            status = "Aprovado";
        } else if (media >= 4) {
            status = "Em exame";
        } else {
            status = "Reprovado";
        }
    }
}
