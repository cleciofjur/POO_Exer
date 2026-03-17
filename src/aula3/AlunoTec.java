package aula3;

public class AlunoTec extends Aluno {
    Integer n3;

    void calcMedia() {
       media = (n1 + n2 + n3) / 3;

        if (media >= 5) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
    }
}
