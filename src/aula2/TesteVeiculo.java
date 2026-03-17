package aula2;
import java.util.Scanner;

public class TesteVeiculo {

    public static void main (String[] args) {
        Veiculo v = new Veiculo();
        Moto m = new Moto();

        Scanner into = new Scanner(System.in);

        System.out.println("Digite o modelo do carro: ");
        v.modelo = into.next();

        System.out.println("Digite a marca do carro: ");
        v.marca = into.next();

        System.out.println("Digite a cor do carro: ");
        v.cor = into.next();

        System.out.println("Digite o valor do carro: ");
        v.valor = into.nextDouble();

        v.calcIpva();

        System.out.println("\n------------------------------------------------");

        System.out.println("Digite o modelo da moto: ");
        m.modelo = into.next();

        System.out.println("Digite a marca da moto: ");
        m.marca = into.next();

        System.out.println("Digite a cor da moto: ");
        m.cor = into.next();

        System.out.println("Digite o valor da moto: ");
        m.valor = into.nextDouble();

        System.out.println("Digite as cilindradas da moto: ");
        m.cilindradas = into.nextInt();

        m.calcIpva();;

        System.out.println("\n------------------------------------------------");

        System.out.println("O carro: " +v.modelo);
        System.out.println("A marca carro: " +v.marca);
        System.out.println("A cor carro: " +v.cor);
        System.out.println("O valor do carro: R$ " +v.valor);
        System.out.println("O IPVA do carro: " +v.ipva);

        System.out.println("\n------------------------------------------------");

        System.out.println("A moto: " +m.modelo);
        System.out.println("A marca da moto: " +m.marca);
        System.out.println("A cor da moto: " +m.cor);
        System.out.println("O valor da moto: R$ " +m.valor);
        System.out.println("As cilindradas da moto: " +m.cilindradas);
        System.out.println("O IPVA da moto: " +m.ipva);


    }
}
