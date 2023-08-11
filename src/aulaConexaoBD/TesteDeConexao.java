package aulaConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {

	public static void main(String [] args) {
		
		String URL_DE_CONEXAO = "jdbc:mysql://db4free.net:3306/caiorr1";
		String LOGIN = "caiorr1@localhost";
		String SENHA = "Caio2604!";
		
		try {
			Connection conexao = DriverManager.getConnection(URL_DE_CONEXAO, LOGIN, SENHA);
			System.out.println("Conectado!");
			conexao.close();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}	
}
