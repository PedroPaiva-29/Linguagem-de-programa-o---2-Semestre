package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;
import negocio.Turma;

public class VisaoTurma extends JFrame {
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblDisciplina = new JLabel("Disciplina");
	private JComboBox<String> cboDisciplina = new JComboBox<String>();
	
	private JLabel lblProfessor = new JLabel("Professor");
	private JComboBox<String> cboProfessor = new JComboBox<String>();
	
	private JLabel lblLetra = new JLabel("Letra");
	private JTextField txtLetra = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//Método principal de execuçãod a classe
	public static void main(String[] args) {
		new VisaoTurma().setVisible(true);
	}
	
	//Método construtor da classe
	public VisaoTurma() {
		//Configuração da janela
		setTitle("Cadastro de Turmas");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Disciplina
		lblDisciplina.setBounds(10, 10, 200, 20);
		add(lblDisciplina);
		cboDisciplina.setBounds(10, 30, 265, 20);
		add(cboDisciplina);
		cboDisciplina.addItem("");
		try {
			for (Disciplina objDisciplina : Disciplina.getTodos()) {
				cboDisciplina.addItem(objDisciplina.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Professor
		lblProfessor.setBounds(10, 60, 200, 20);
		add(lblProfessor);
		cboProfessor.setBounds(10, 80, 265, 20);
		add(cboProfessor);
		cboProfessor.addItem("");
		try {
			for (Professor objProfessor : Professor.getTodos()) {
				cboProfessor.addItem(objProfessor.getTitulacao() + " " + objProfessor.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//Letra 
		lblLetra.setBounds(10, 110, 200, 20);
		add(lblLetra);
		txtLetra.setBounds(10, 130, 20, 20);
		add(txtLetra);
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turma objTurma = new Turma();
				objTurma.setObjDisciplina(new Disciplina(cboDisciplina.getSelectedIndex(), ""));
				objTurma.setObjProfessor(new Professor(cboProfessor.getSelectedIndex(), "", ""));
				objTurma.setLetra(txtLetra.getText());
				try {
					objTurma.persistir();
					JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro);
				}
			}
		});
		
		//Botões
		btnGravar.setBounds(10, 160, 80, 30);
		add(btnGravar);
		
		btnLimpar.setBounds(102, 160, 80, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cboDisciplina.setSelectedIndex(0);
				cboProfessor.setSelectedIndex(0);
				txtLetra.setText("");
			}
		});
		
		btnSair.setBounds(196, 160, 80, 30);
		add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}