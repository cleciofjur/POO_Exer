package tabeladecarros;

import java.util.Scanner;

public class TesteCarro {
    public static void main (String [] args) {
        Carro carro;
        ListaCarro lista;
        int a = 0, b, c;

        Scanner into = new Scanner (System.in);

        do {
            System.out.println ("--- SISTEMA DE CADASTRO DE CARROS ---");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - BUSCAR");
            System.out.println("4 - ALTERAR");
            System.out.println("5 - EXCLUIR");

            System.out.println ("--- ESCOLHA UMA OPÇÃO ---");
            b = into.nextInt();

            switch (b) {
                case 1:
                    System.out.println ("--- CADASTRAR ---");
                    carro = new Carro();

                    System.out.print("Digite o modelo: ");
                    String m = into.next();

                    System.out.print("Digite o ano: ");
                    int ano = into.nextInt();

                    System.out.print("Digite o valor do carro: ");
                    Double valor = into.nextDouble();

                    carro(m, ano, valor);

                    list.salvar(carro);
                    System.out.println ("Carro salvo com sucesso");

                    break;

                case 2:
                    System.out.println ("--- LISTAR ---");
                    for (Carro car : lista.listarTodos()) {
                        System.out.println ("O modelo -> " +car.getModelo());
                        System.out.println ("O ano -> " +car.getAno());
                        System.out.println ("O valor -> " +car.getValor());
                        System.out.println ("------------------------------");
                    }
                    break;

                case 3:
                    System.out.println ("--- PESQUISAR ---");
                    break;

                case 4:
                    System.out.println ("--- ALTERAR ---");
                    break;

                case 5:
                    System.out.println ("--- EXCLUIR ---");
                    break;

                default:
                    System.out.println ("Operação Inválida");
            }

            System.out.print("Digite 1 para continuar ou 0 para sair: ");
            a = into.nextInt();

        } while (a != 0);
    }
}
