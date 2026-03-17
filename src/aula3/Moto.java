package aula3;

public class Moto extends Veiculo {
    Integer cilindradas;

    void calcImposto (){
        if (cilindradas <= 160) {
            imposto = valor * 1 / 100;
        } else if (cilindradas <= 400) {
            imposto = valor * 3 / 100;
        } else {
            imposto = valor * 5 / 100;
        }
    }

}
