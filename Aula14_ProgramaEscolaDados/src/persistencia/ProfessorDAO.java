package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import negocio.Professor;

public class ProfessorDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//Métodos da classe
	public Collection<Professor> getTodos() throws Exception {
		LinkedList<Professor> colecao = new LinkedList<Professor>();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRF_PROFESSOR ORDER BY PRF_ID");
		
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			colecao.add(new Professor(objCursor.getInt("PRF_ID"), objCursor.getString("PRF_NOME"), objCursor.getString("PRF_TITULACAO")));
			
		}
		
		objBanco.desconectar();
		
		return colecao;
	}
}
