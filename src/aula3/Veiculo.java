package aula3;

public class Veiculo {
    String modelo;
    String marca;
    double valor;
    double imposto;

    void calcImposto () {
        if (valor <= 50000.0) {
            imposto = valor * 2 / 100;
        } else if (valor <= 80000.0) {
            imposto = valor * 0.03 / 100;
        } else {
            imposto = valor * 0.05 / 100;
        }
    }

    void calcImposto (String marca) {
        if (marca.equals("BYD")) {
            imposto = valor * 1 / 100;
        } else if ((marca.equals("HONDA")) || (marca.equals("TOYOTA"))) {
            imposto = valor * 0.03 / 100;
        } else {
            imposto = valor * 0.05;
        }
    }
}
