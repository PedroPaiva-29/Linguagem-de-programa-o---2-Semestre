package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import negocio.Livro;

public class LivroDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//Métodos da classe
	private int getProximoId() throws Exception {
		int proximoId = 0;
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT MAX(LIV_ID) FROM LIV_LIVRO");
		
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			proximoId = objCursor.getInt(1);
		}
		proximoId++;
		
		objBanco.desconectar();
		
		return proximoId;
		
		}
	
	public void persistir(Livro objLivro) throws Exception {
		objLivro.setId(getProximoId());
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO LIV_LIVRO " + "(LIV_ID, LIV_IDAUTOR, LIV_TITULO) " + "VALUES " + "(?, ?, ?)");
		
		objExecucao.setInt(1, objLivro.getId());
		objExecucao.setInt(2, objLivro.getObjAutor().getId());
		objExecucao.setString(3, objLivro.getTitulo());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
	}
	

