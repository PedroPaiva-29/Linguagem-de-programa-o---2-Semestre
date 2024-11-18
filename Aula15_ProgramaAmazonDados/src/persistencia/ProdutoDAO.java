package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Produto;

public class ProdutoDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//Métodos da classe
	public Collection<Produto> getTodos() throws Exception {
		ArrayList<Produto> colecao = new ArrayList<Produto>();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRD_PRODUTO ORDER BY PRD_ID");
		
		objCursor = objExecucao.executeQuery();
		while(objCursor.next()) {
			colecao.add(new Produto(objCursor.getInt("PRD_ID"),objCursor.getString("PRD_NOME"),objCursor.getDouble("PRD_PRECO")));
		}
		
		objBanco.desconectar();
		
		return colecao;
		
	}
}
