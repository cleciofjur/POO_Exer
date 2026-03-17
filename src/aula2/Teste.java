package aula2;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Funcionario fun = new Funcionario();
        Gerente ger = new Gerente();

        Scanner into = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        fun.nome = into.next();

        System.out.println("Digite a idade do funcionário: ");
        fun.idade = into.nextInt();

        System.out.println("Digite o salário do funcionário: ");
        fun.salario = into.nextDouble();

        System.out.println("\n");

        System.out.println("Digite o nome do gerente: ");
        ger.nome = into.next();

        System.out.println("Digite a idade do gerente: ");
        ger.idade = into.nextInt();

        System.out.println("Digite o salário do gerente: ");
        ger.salario = into.nextDouble();

        System.out.println("Digite a comissão do gerente: ");
        ger.comissao = into.nextDouble();

        System.out.println("Digite o endereço do gerente: ");
        ger.endereco = into.next();
        System.out.println("\n------------------------------------------------");
        System.out.println("Nome do funcionário: " +fun.nome);
        System.out.println("Idade do funcionário: " +fun.idade);
        System.out.println("Salário do funcionário: " +fun.salario);
        System.out.println("\n------------------------------------------------");
        System.out.println("Nome do gerente: " +ger.nome);
        System.out.println("Idade do gerente: " +ger.idade);
        System.out.println("Salário do gerente: " +ger.salario);
        System.out.println("Comissão do gerente: " +ger.comissao);
        System.out.println("O salário final do gerente: " +(ger.comissao + ger.salario));
        System.out.println("Endereço do gerente: " +ger.endereco);

    }

}
