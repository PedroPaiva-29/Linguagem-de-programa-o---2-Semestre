package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	//Propriedades da classe
	private JTextField txtNome = null;
	private JTextField txtEndereco = null;
	private JTextField txtTelefone = null;
	
	//Método construtor cheio da classe
	public ControladorLimpar(JTextField txtNome, JTextField txtEndereco, JTextField txtTelefone) {
		super();
		this.txtNome = txtNome;
		this.txtEndereco = txtEndereco;
		this.txtTelefone = txtTelefone;
	}

	
	//Métood implementado da interface
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		txtEndereco.setText("");
		txtTelefone.setText("");
		

	}

	
}
