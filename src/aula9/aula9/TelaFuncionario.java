package aula9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TelaFuncionario implements ActionListener {
	
	Funcionario fun;
	ListaFuncionario vetListFun = ListaFuncionario();
	int cod = 0;
	
	JFrame tela = new JFrame("Cadastrar funcionário");
	JPanel painel = new JPanel();
	JLabel lbcod = new JLabel("Código: "); 
	JLabel lbnome = new JLabel("Nome: "); 
	JLabel lbidade = new JLabel("Idade: "); 
	JLabel lbsal = new JLabel("Salário: ");
	
	JTextField txtcod = new JTextField();
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtsal = new JTextField();
	
	JButton btnsalvar = new JButton("Salvar");
	JButton btnlistar = new JButton("Listar");
	JButton btnpesquisar = new JButton("Pesquisar");
	JButton btnalterar = new JButton("Alterar");
	JButton btnexcluir = new JButton("Excluir");
	
	void criarTela () {
		tela.setSize(400, 400);
		painel.setLayout(null);
//		Centralizar o frame ao centro		
		tela.setLocationRelativeTo(null);
		
//		Exibir os campos de código		
		lbcod.setBounds(20, 10, 70, 30);
		txtcod.setBounds(130, 10, 140, 30);
		txtcod.disable();
		
		painel.add(lbcod);
		painel.add(txtcod);
		
//		Exibir os campos de nome		
		lbnome.setBounds(20, 60, 70, 30);
		txtnome.setBounds(130, 60, 140, 30);
		
		painel.add(lbnome);
		painel.add(txtnome);	
		
//		Exibir os campos de idade		
		lbidade.setBounds(20, 110, 70, 30);
		txtidade.setBounds(130, 110, 140, 30);
		
		painel.add(lbidade);
		painel.add(txtidade);			
		
//		Exibir os campos de salario		
		lbsal.setBounds(20, 160, 70, 30);
		txtsal.setBounds(130, 160, 140, 30);
		
		painel.add(lbsal);
		painel.add(txtsal);
		
//		Exibir botões		
		btnsalvar.setBounds(20, 210, 150, 30);
		btnlistar.setBounds(200, 210, 150, 30);
		btnpesquisar.setBounds(20, 260, 100, 30);
		btnalterar.setBounds(140, 260, 100, 30);
		btnexcluir.setBounds(260, 260, 100, 30);
		
		painel.add(btnsalvar);
		painel.add(btnlistar);
		painel.add(btnpesquisar);
		painel.add(btnalterar);
		painel.add(btnexcluir);
		
//		Ação nos botões		
		btnsalvar.addActionListener(this);
		btnlistar.addActionListener(this);
		btnpesquisar.addActionListener(this);
		btnalterar.addActionListener(this);
		btnexcluir.addActionListener(this);
		
//		Exibir a tela 		
		tela.getContentPane().add(painel);
		tela.setVisible(true);
	}
		
	private ListaFuncionario ListaFuncionario() {
		return null;
	}

	public static void main(String[] args) {
		TelaFuncionario tf = new TelaFuncionario();
		tf.criarTela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnsalvar) {
			String nome = txtnome.getText();
			int idade = Integer.parseInt(txtidade.getText());
			Double salario = Double.parseDouble(txtsal.getText());
			
			fun = new Funcionario(cod, nome, idade, salario);
			
			vetListFun.salvar(fun);
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
			cod++;
			
			txtcod.enable();
		}
		
		if(e.getSource() == btnlistar) {
			for(Funcionario f : vetListFun.ListAll()) {
				JOptionPane.showMessageDialog(null, "O código: " +f.getCodigo()+ "\nNome: " +f.getNome()+ "\nIdade: " +f.getIdade()+ "\nSalário: " +f.getSalario());
			}
		}
		
		if(e.getSource() == btnpesquisar) {
			Integer x = Integer.parseInt(txtcod.getText());
			
			fun = vetListFun.pesquisar(x);
			
			txtnome.setText(fun.getNome());
			txtidade.setText(String.valueOf((fun.getIdade())));
			txtsal.setText(String.valueOf((fun.getSalario())));
		}
		
		if (e.getSource() == btnalterar) {
			Integer x = Integer.parseInt(txtcod.getText());
			
			fun = vetListFun.pesquisar(x);
			
			
			String nome = txtnome.getText();
			int idade = Integer.parseInt(txtidade.getText());
			Double salario = Double.parseDouble(txtsal.getText());
			
			fun.setNome(nome);
			fun.setIdade(idade);
			fun.setSalario(salario);
			
			vetListFun.alterar(x, fun);
			JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
			
		}
		
		if (e.getSource() == btnexcluir) {
			Integer x = Integer.parseInt(txtcod.getText());
			
			fun = vetListFun.excluir(x);
			vetListFun.excluir(fun);
			JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
			txtnome.setText("");
			txtidade.setText("");
			txtsal.setText("");
			txtcod.setText("");
		}
	}
}
