package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import negocio.Turma;

public class TurmaDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	///Métodos da classe
	private int getProximoId() throws Exception {
		int proximoId = 0;
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT MAX(TUR_ID) FROM TUR_TURMA");
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			proximoId = objCursor.getInt(1);
		}
		proximoId++;
		
		objBanco.desconectar();
		
		return proximoId;		
	}
	
	public void persistir(Turma objTurma) throws Exception {
		objTurma.setId(getProximoId());
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO TUR_TURMA" + "(TUR_ID, TUR_IDDISCIPLINA, TUR_IDPROFESSOR,"+
																"TUR_LETRA) VALUES " + "(?, ?, ?, ?)");
		
		objExecucao.setInt(1, objTurma.getId());
		objExecucao.setInt(2, objTurma.getObjDisciplina().getId());
		objExecucao.setInt(3, objTurma.getObjProfessor().getId());
		objExecucao.setString(4, objTurma.getLetra());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
		
	}
	
}
