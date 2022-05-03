package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectoDataBase
{


	public static Connection getConnection() throws SQLException 
	{

		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/Cybercar","root","root");
		System.out.print("vous etes connectez ");
		return conn;

	}
	
}

	


	

