package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//Propriedades da classe
	private Connection objConexao = null;
	
	//Métodos de acesso da classe
	Connection getObjConexao() throws Exception {
		return objConexao;
		
	}
	
	//Métodos da classe
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:oracle:thin:@//fusca:1521/XE?user=auto&password=auto");
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
}
