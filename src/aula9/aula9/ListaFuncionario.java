package aula9;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionario {
	List<Funcionario> listaFun = new ArrayList<Funcionario>();
	
//	Variavél global	
	Funcionario fun;	
	
//	Variavél local	
	public void salvar (Funcionario funcionario) {
		listaFun.add(funcionario);
	}
	
//	Função de pesquisar	
	public Funcionario pesquisar (Integer x) {
		 fun = listaFun.get(x);
		 return fun;
	}
	
//	Função de alterar	
	public void alterar (Integer x, Funcionario funcionario) {
		listaFun.set(x, funcionario);
	}
	
//	Função de excluir	
	public Funcionario excluir (Integer x) {
		listaFun.remove(fun);
		return fun; 
	}

//	Função de exibir
	public List<Funcionario> ListAll() {
		return new ArrayList<>(listaFun);
	}
}
