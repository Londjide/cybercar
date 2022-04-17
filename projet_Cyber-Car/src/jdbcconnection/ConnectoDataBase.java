package jdbcconnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectoDataBase
{
	
	private static String nomDuSGBD;
	private static String lienVersLaBDD;
	private static String NomUtilisateur;
	private static String Mdp;
	
  

	
	private final static Properties dbProperties = new Properties();

	{
		
		
		try(InputStream input = new FileInputStream("src/dbconfig.properties"))   // file pour configurer le chemin vers la base de donnée 
		{
			dbProperties.load(input);

			nomDuSGBD = dbProperties.getProperty("SGBD");
			lienVersLaBDD = dbProperties.getProperty("lienBDD");
			NomUtilisateur = dbProperties.getProperty("utilisateur");
			Mdp = dbProperties.getProperty("mdp");

			System.out.println("\n la connection à été etablie ..... ");
		}
		catch(IOException ioex)
		{
			ioex.printStackTrace();
		}
	}


	public static Connection getConnection() throws SQLException 
	{

		Connection conn = null;
		conn = DriverManager.getConnection(lienVersLaBDD,NomUtilisateur, Mdp);
		System.out.print("vous etes connectez ");
		return conn;

	}


	

	

	
}
