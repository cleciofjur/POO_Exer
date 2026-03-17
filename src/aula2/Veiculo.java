package aula2;

public class Veiculo {
    String modelo;
    String marca;
    String cor;
    Double valor;
    Double ipva;

    void calcIpva () {
        if (valor <= 4000.0) {
            ipva = valor * 2 / 100;
        } else if (valor <= 7000.0) {
            ipva = valor * 0.04;
        } else {
            ipva = valor * 0.05;
        }
    }
}
