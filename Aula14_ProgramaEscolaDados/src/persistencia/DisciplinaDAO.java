package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import negocio.Disciplina;

public class DisciplinaDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//Métodos da classe
	public Collection<Disciplina> getTodos() throws Exception {
		LinkedList<Disciplina> colecao = new LinkedList<Disciplina>();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM DIS_DISCIPLINA_PHAP ORDER BY DIS_ID");
		
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			colecao.add(new Disciplina(objCursor.getInt("DIS_ID"), objCursor.getString("DIS_NOME")));
			
		}
		
		objBanco.desconectar();
		
		return colecao;
	}
}
