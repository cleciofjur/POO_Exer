package aula4_2;

public class AlunoSuperior extends Aluno {
    Double n3;

    @Override
    void calcMedia() {
        media = (n1 + n2 + n3) / 3;

        if (media >= 6.0) {
            status = "Aprovado";
        } else if (media >= 4 && media < 6){
            status = "Em exame";
        } else {
            status = "Reprovado";
        }
    }
}
