package aula08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaCarro implements ActionListener{
    
    JFrame tela = new JFrame ("Cadastrar carro");
    JPanel painel = new JPanel();
    JLabel lbmodelo = new JLabel("Modelo: ");
    JLabel lbplaca = new JLabel("Placa: ");
    JLabel lbano = new JLabel("Ano: ");
    JLabel lbvalor = new JLabel("Valor: ");
    JLabel lbobs = new JLabel("Observções: ");
    JTextArea txtobs = new JTextArea();
    
    JTextField txtmodelo = new JTextField();
    JTextField txtplaca = new JTextField();
    JTextField txtano = new JTextField();
    JTextField txtvalor = new JTextField();
    
    JButton btnsalvar = new JButton("Salvar");
    
    JButton btnexibir = new JButton("Exibir");
    
    void criarTela () {
        tela.setSize(350, 300); // Tamanho da tela
        tela.setLocation(650, 250); //Local que a tela ocupará
        painel.setLayout(null); // Painel se adaptar a tela
        
        lbmodelo.setBounds(20, 10, 80, 30);
        txtmodelo.setBounds(20, 40, 160, 30);

        lbplaca.setBounds(20, 80, 80, 30);
        txtplaca.setBounds(20, 110, 160, 30);

        lbano.setBounds(20, 150, 80, 30);
        txtano.setBounds(20, 180, 160, 30);

        lbvalor.setBounds(20, 220, 80, 30);
        txtvalor.setBounds(20, 250, 160, 30);

        lbobs.setBounds(20, 220, 80, 30);
        txtobs.setBounds(20, 300, 220, 100);
        
        btnsalvar.setBounds(50, 420, 80, 30);
        
        btnexibir.setBounds(180, 420, 80, 30);
        
        painel.add(lbmodelo);
        painel.add(txtmodelo);
        painel.add(lbplaca);
        painel.add(txtplaca);
        painel.add(lbano);
        painel.add(txtano);
        painel.add(lbvalor);
        painel.add(txtvalor);
        painel.add(lbobs);
        painel.add(txtobs);
        painel.add(btnsalvar);
        painel.add(btnexibir);
        
        tela.getContentPane().add(painel);
        tela.setVisible(true); // TorNar ela visivel
    }
    
    public static void main(String[] args) {
        TelaCarro telacarro = new TelaCarro();
        telacarro.criarTela();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnsalvar) {
            String modelo = txtmodelo.getText();
            String placa = txtplaca.getText();
            Integer ano = Integer.parseInt(txtmodelo.getText());
            Double valor = Double.parseDouble(txtmodelo.getText());
            String obs = txtobs.getText();
            
            Carro carro = new Carro (modelo, placa, ano, valor, obs);
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
            
            txtmodelo.setText("");
            txtplaca.setText(obs);
        }
        
        if (e.getSource() == btnexibir) {
            JOptionPane.showMessageDialog(null, "O modelo: " +carro.getModelo()+ "\nA placa: " +carro.getPlaca+ "\nO valor: " +carro.getAno+ "\nO valor: R$ " +carro.getDouble+ "\nObservações: " +carro.getObs);
        }
    }
}
