package jdbcconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class financeData
{
	

	private double chiffredDaffaire;
	PreparedStatement stmt;
	Connection connect;
	ResultSet resultat;
	
	
	public void getChiffreDaffaire() throws SQLException
	{
		
		connect = ConnectoDataBase.getConnection();
		String query = "call chiffreDaffaire()";
		stmt = connect.prepareStatement(query);
		resultat = stmt.executeQuery();
		while(resultat.next())
		{
			this.chiffredDaffaire = resultat.getDouble("chiffre");
		}
		

	}

}
	
	
	
	