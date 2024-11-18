package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cliente;
import negocio.Compra;
import negocio.Produto;

public class VisaoCompra extends JFrame {
	//propriedades da classe
	private static final long serialVersionUID = 1L;

	private JLabel lblProduto = new JLabel("Produto");
	private JComboBox<String> cboProduto = new JComboBox<String>();
	
	private JLabel lblCliente = new JLabel("Cliente");
	private JComboBox<String> cboCliente = new JComboBox<String>();
	
	private JLabel lblData = new JLabel("Data");
	private JTextField txtData = new JTextField();
	
	private JLabel lblQuantidade = new JLabel("Quantidade");
	private JTextField txtQuantidade = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoCompra().setVisible(true);
	}
	
	//Método construtor da classe
	public VisaoCompra() {
		//Configuração da janela
		setTitle("Sistema de Compras Amazon");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Produto
		lblProduto.setBounds(10, 10, 200, 20);
		add(lblProduto);
		cboProduto.setBounds(10, 30, 365, 20);
		add(cboProduto);
		cboProduto.addItem("--- Selecione o Produto ---");
		try {
			for (Produto objProduto : Produto.getTodos()) {
				cboProduto.addItem(objProduto.getNome() + " (R$ " + objProduto.getPreco() + ")");
				
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Cliente
				lblCliente.setBounds(10, 60, 200, 20);
				add(lblCliente);
				cboCliente.setBounds(10, 80, 365, 20);
				add(cboCliente);
				cboCliente.addItem("--- Selecione o Produto ---");
				try {
					for (Cliente objCliente : Cliente.getTodos()) {
						cboCliente.addItem(objCliente.getNome());
						
					}
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro);
				}
				
		//Data
		lblData.setBounds(10, 110, 200, 20);
		add(lblData);
		txtData.setBounds(10, 130, 100, 20);
		add(txtData);
		
		//Quantidade
		lblQuantidade.setBounds(10, 160, 200, 20);
		add(lblQuantidade);
		txtQuantidade.setBounds(10, 180, 50, 20);
		add(txtQuantidade);
		
		//Botões
		btnGravar.setBounds(20, 210, 100, 30);;
		add(btnGravar);
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Compra objCompra = new Compra();
					objCompra.setObjproduto(new Produto(cboProduto.getSelectedIndex(), "", 0));
					objCompra.setObjCliente(new Cliente(cboCliente.getSelectedIndex(), "", ""));
					objCompra.setData(txtData.getText());
					objCompra.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
					JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro);
				}
			}
		});
		
		btnLimpar.setBounds(140, 210, 100, 30);;
		add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				cboProduto.setSelectedIndex(0);
				cboCliente.setSelectedIndex(0);
				txtData.setText("");
				txtQuantidade.setText("");
				}
		});
		
		btnSair.setBounds(260, 210, 100, 30);;
		add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
