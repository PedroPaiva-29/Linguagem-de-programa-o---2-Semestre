package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VisaoPessoa extends JFrame {
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblTelefone = new JLabel("Telefone");
	private JTextField txtTelefone = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoPessoa().setVisible(true);
	}
	
	//Método construtor da classe
	public VisaoPessoa() {
		//Configuração da janela
		setTitle("Cadastro de Pessoas");
		setSize(300, 240);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 265, 20);
		add(txtNome);
		
		//Endereço
		lblEndereco.setBounds(10, 60, 200, 20);
		add(lblEndereco);
		txtEndereco.setBounds(10, 80, 265, 20);
		add(txtEndereco);
		
		//Telefone
		lblTelefone.setBounds(10, 110, 200, 20);
		add(lblTelefone);
		txtTelefone.setBounds(10, 130, 100, 20);
		add(txtTelefone);
		
		//Botões
		btnGravar.setBounds(15, 160, 80, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtEndereco, txtTelefone));
		
		btnLimpar.setBounds(100, 160, 80, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtEndereco, txtTelefone));

		btnSair.setBounds(190, 160, 80, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		
		
	}
}
