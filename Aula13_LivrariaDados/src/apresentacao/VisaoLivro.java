package apresentacao;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;
import negocio.Livro;

public class VisaoLivro extends JFrame{
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblTitulo = new JLabel ("Título");
	private JTextField txtTitulo = new JTextField();
	
	private JLabel lblAutor = new JLabel("Autor");
	private JComboBox<String> cboAutor = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoLivro().setVisible(true);
	}
	
	//Método construtor da classe
	public VisaoLivro() {
		//Configuração da janela
		setTitle("Cadastro de Livros");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Título
		lblTitulo.setBounds(10, 10, 200, 20);
		add(lblTitulo);
		txtTitulo.setBounds(10, 30, 265, 20);
		add(txtTitulo);
		
		//Autor
		lblAutor.setBounds(10, 60, 200, 20);
		add(lblAutor);
		cboAutor.setBounds(10, 80, 265, 20);
		add(cboAutor);
		cboAutor.addItem("");
		try {
			for (Autor objAutor : Autor.getTodos()) {
				cboAutor.addItem(objAutor.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Botões
		btnGravar.setBounds(10, 110, 80, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro objLivro = new Livro();
				objLivro.setTitulo(txtTitulo.getText());
				objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), ""));
				
				try {
					objLivro.persistir();
					JOptionPane .showMessageDialog(null, "Gravação realizada com sucesso !");
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro);
				}
			}
		});
		
		
		btnLimpar.setBounds(102, 110, 80, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTitulo.setText("");
				cboAutor.setSelectedIndex(0);
			}
		});
		

		btnSair.setBounds(196, 110, 80, 30);
		add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
		}
	});
		
	}
}
