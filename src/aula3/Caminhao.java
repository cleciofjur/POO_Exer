package aula3;

public class Caminhao extends Veiculo{
    Integer cap_carga;

    void calcImposto () {
        if (cap_carga <= 10000) {
            imposto = valor * 0.02;
        } else if (cap_carga <= 300000) {
            imposto = valor * 0.03;
        } else {
            imposto = valor * 0.05;
        }
    }
}
