package aula3;

import java.util.Scanner;

public class Teste3 {
    public static void main (String [] args) {

        Veiculo veiculo = new Veiculo ();
        Moto moto = new Moto ();
        Caminhao caminhao = new Caminhao ();

        Scanner into = new Scanner (System.in);

        System.out.println("Digite o modelo do veículo: ");
        veiculo.modelo = into.next();

        System.out.println("Digite a marca do veículo: ");
        veiculo.marca = into.next();

        System.out.println("Digite o valor do veículo: ");
        veiculo.valor = into.nextDouble();

        System.out.println ("Digite\n1 - Calcular Imposto pelo valor\n2 - Calcular pela marca");
        int x = into.nextInt();

        if (x == 1) {
            veiculo.calcImposto();
        } else {
            veiculo.calcImposto(veiculo.marca);
        }

        veiculo.calcImposto();

        System.out.println("-----------------------------------------------------------");

        System.out.println("Digite o modelo da moto: ");
        moto.modelo = into.next();

        System.out.println("Digite a marca da moto: ");
        moto.marca = into.next();

        System.out.println("Digite o valor da moto: ");
        moto.valor = into.nextDouble();

        System.out.println("Digite as cilindradas da moto: ");
        moto.cilindradas = into.nextInt();

        moto.calcImposto();

        System.out.println("-----------------------------------------------------------");

        System.out.println("Digite o modelo do caminhão: ");
        caminhao.modelo = into.next();

        System.out.println("Digite a marca do caminhão: ");
        caminhao.marca = into.next();

        System.out.println("Digite o valor do caminhão: ");
        caminhao.valor = into.nextDouble();

        System.out.println("Digite a capacidade de carga do caminhão: ");
        caminhao.cap_carga = into.nextInt();

        caminhao.calcImposto();

        System.out.println("-----------------------------------------------------------");
        System.out.println("O modelo do veículo: " +veiculo.modelo);
        System.out.println("A marca do veículo: " +veiculo.marca);
        System.out.println("O valor do veículo: " +veiculo.valor);
        System.out.println("O imposto do veículo: " +veiculo.imposto);

        System.out.println("-----------------------------------------------------------");
        System.out.println("O modelo da moto: " +moto.modelo);
        System.out.println("A marca da moto: " +moto.marca);
        System.out.println("As cilindradas da moto: " +moto.cilindradas);
        System.out.println("O valor da moto: " +moto.valor);
        System.out.println("O imposto da moto: " +moto.imposto);

        System.out.println("-----------------------------------------------------------");
        System.out.println("O modelo do caminhão: " +caminhao.modelo);
        System.out.println("A marca do caminhão: " +caminhao.marca);
        System.out.println("A capacidade de carga: " +caminhao.cap_carga);
        System.out.println("O valor do aminhão: " +caminhao.valor);
        System.out.println("O imposto do caminhão: " +caminhao.imposto);
    }
}
