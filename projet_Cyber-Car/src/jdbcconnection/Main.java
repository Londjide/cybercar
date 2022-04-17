package jdbcconnection;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		 ConnectoDataBase conn = new ConnectoDataBase();
		  
		  conn.getConnection();

		
	}

}
