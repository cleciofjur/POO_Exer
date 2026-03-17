package aula3;

public class AlunoSup extends AlunoTec{
    Double n4;
    Double tcc;

    void calcMedia () {
        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            status = "Aprovado";
        } else if (media >= 5) {
            status = "Em exame";
        } else {
            status = "Reprovado";
        }
    }

    void calcMedia(Double tcc) {

    }
}
