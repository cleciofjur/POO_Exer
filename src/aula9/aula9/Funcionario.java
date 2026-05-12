package aula9;

public class Funcionario {
	private String codigo;
	private String nome;
	private Integer idade;
	private Double salario;
	
//	Construtor sem parametro
	Funcionario (int cod, String nome2, int idade2, Double salario2){}
	
//	Construtor com parametro
	Funcionario (String codigo, String nome, Integer idade, Double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo (String codigo) {
		
	}
}
