package tabeladecarros;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCarro {
    ArrayList<Carro> lista = new ArrayList<Carro>();
    Scanner into = new Scanner(System.in);

    Carro carro;

    void salvar (Carro carro) {

    }

    void alterar (int a, Carro carro) {
        lista.set (a, carro);
    }

    Carro pesquisar (int a) {
        carro = lista.get(a);
        return carro;
    }

    void excluir (int a) {
        lista.remove(a);
    }

    List<Carro> listarTodos() {
        return new ArrayList<>(lista);
    }
}
