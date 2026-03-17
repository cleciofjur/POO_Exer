package aula2;

public class Moto extends Veiculo{
    int cilindradas;

    void calcIpva() {
        if (cilindradas <= 160) {
            ipva = 0.0;
        } else if (ipva <= 400) {
            ipva = valor * 4 / 100;
        } else {
            ipva = valor * 5 / 100;
        }
    }
}
