package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import negocio.Pessoa;

public class PessoaDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//Métodos da classe
	private int getProximoId() throws Exception {
		int retorno = 0;
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT MAX(PES_ID) FROM PES_PESSOA");
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			retorno = objCursor.getInt(1);
		}
		retorno++;
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	public void persistir(Pessoa objPessoa) throws Exception {
		objPessoa.setId(getProximoId());
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO PES_PESSOA " + "(PES_ID, PES_NOME, PES_ENDERECO, PES_TELEFONE) " + "VALUES " + "(?, ?, ?, ?)");
		objExecucao.setInt(1, objPessoa.getId());
		objExecucao.setString(2, objPessoa.getNome());
		objExecucao.setString(3, objPessoa.getEndereco());
		objExecucao.setString(4, objPessoa.getTelefone());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
