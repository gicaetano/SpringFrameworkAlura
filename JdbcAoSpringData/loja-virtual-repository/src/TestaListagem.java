import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager
				.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root");
		
		Statement stm = con.createStatement();	
		stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		
		ResultSet rst = stm.getResultSet();
		
		
		
		con.close();
	}

}
