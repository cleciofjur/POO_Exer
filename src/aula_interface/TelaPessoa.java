package aula08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPessoa implements ActionListener{
    
    Pessoa pessoa;
    JFrame tela = new JFrame ("Cadastro de Pessoa: ");
    JPanel painel = new JPanel();
    JLabel lbnome = new JLabel("Nome: ");
    JLabel lbidade = new JLabel("Idade: ");
    
//    Campo de Digitação
    JTextField txtnome = new JTextField ();
    JTextField txtidade = new JTextField ();
    
//    Botões
    JButton btnsalvar = new JButton ("Salvar");
    JButton btnexibir = new JButton ("Exibir");
    
    void criarTela () {
        tela.setSize(350, 300); // Tamanho da tela
        tela.setLocation(650, 250); //Local que a tela ocupará
        painel.setLayout(null); // Painel se adaptar a tela
        
        lbnome.setBounds(20, 10, 80, 30);
        txtnome.setBounds(20, 40, 300, 30);
        lbidade.setBounds(20, 80, 80, 30);
        txtidade.setBounds(20, 110, 300, 30);
        
        btnsalvar.setBounds(20, 150, 80, 30);
        btnsalvar.addActionListener(this); // Ação do botão
        btnexibir.setBounds(120, 150, 80, 30);
        btnexibir.addActionListener(this); // Ação de exibir
        
        painel.add(lbnome);
        painel.add(txtnome);
        painel.add(lbidade);
        painel.add(txtidade);
        painel.add(btnsalvar);
        painel.add(btnexibir);
        
        tela.getContentPane().add(painel);
        tela.setVisible(true); // TorNar ela visivel
        
    }
    
    public static void main (String [] args) {
        TelaPessoa telapessoa = new TelaPessoa();
        telapessoa.criarTela();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnsalvar) {
            String nome = txtnome.getText();
            Integer idade = Integer.parseInt(txtidade.getText());
            
            pessoa = new Pessoa (nome, idade);
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        }
        
        if(e.getSource() == btnexibir) {
            JOptionPane.showMessageDialog(null, "O nome: " +pessoa.getNome()+ "\nA idade: " +pessoa.getIdade());
        }
    }
}
