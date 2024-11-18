package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import negocio.Compra;

public class CompraDAO {
	//Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	private int getProximoid() throws Exception {
		int proximoId = 0;
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT MAX(CMP_ID) FROM CMP_COMPRA");
		
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			proximoId = objCursor.getInt(1);
		}
		proximoId++;
		
		objBanco.desconectar();
		
		return proximoId;
	}
	
	public void persistir(Compra objCompra) throws Exception {
		objCompra.setId(getProximoid());
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CMP_COMPRA" + "(CMP_ID, CMP_IDPRODUTO, CMP_IDCLIENTE, CMP_DATA, CMP_QUANTIDADE)" + "VALUES " + "(?, ?, ?, ?, ?)");
		
		objExecucao.setInt(1, objCompra.getId());
		objExecucao.setInt(2, objCompra.getObjproduto().getId());
		objExecucao.setInt(3, objCompra.getObjCliente().getId());
		objExecucao.setString(4, objCompra.getData());
		objExecucao.setInt(5, objCompra.getQuantidade());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
