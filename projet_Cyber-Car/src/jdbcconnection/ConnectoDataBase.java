package jdbcconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Random;


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
		conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/Cybercar","root","root");
		System.out.print("vous etes connectez ");
		return conn;

	}
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}


	public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static String createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
    }

	public static void m(String args[]) throws SQLException{
		
		
		
		
		
		 // creates a file object
	    File fileChevrolet = new File("src/admin/finance/projet Fxml/voiture/CHEVROLET");

	    // returns an array of all files
	    String[] voiturechevrolet = fileChevrolet.list();

	    for(String str : voiturechevrolet) {
	      System.out.println(str);
	    }
	    
	    
	    System.out.println();
	    // creates a file object
	    File fileRenault = new File("src/admin/finance/projet Fxml/voiture/Renault");

	    // returns an array of all files
	    String[] voitureRenault = fileRenault.list();

	    for(String str : voitureRenault) {
	      System.out.println(str);
	    }
	    
	    System.out.println();
	    File fileToyota = new File("src/admin/finance/projet Fxml/voiture/Toyota");

	    // returns an array of all files
	    String[] voitureToyota = fileToyota.list();

	    for(String str : voitureToyota) {
	      System.out.println(str);
	    }
	    
	    System.out.println();
	    File fileTesla = new File("src/admin/finance/projet Fxml/voiture/Tesla");

	    // returns an array of all files
	    String[] voitureTesla = fileTesla.list();

	    for(String str : voitureTesla) {
	      System.out.println(str);
	    }
	    
	    
	    Connection connect = null;
	    
	    
	    for(int i =0 ; i<(voitureRenault.length);i++)
	    {
	    	
	    	
	    	connect  = getConnection();
	    	 
	    	PreparedStatement stmt = connect.prepareStatement("INSERT INTO Facture_clients(nom,prenom,dateDachat,nomVoiture,dateLivraison,montant,ramise,vendeur) VALUES (?, ?, ?,?, ?, ?,?,?)");
	    	
	    	stmt.setString(1,"John"+i);
	    	stmt.setString(2,"Smith"+i);
	    	stmt.setString(3, createRandomDate(2021,2022));
	    	stmt.setString(4, voitureTesla[i]);
	    	stmt.setString(5, createRandomDate(2022,2023));
	    	stmt.setString(6, String.valueOf(getRandomNumberInRange(10000,40000)));
	    	stmt.setString(7,null);
	    	stmt.setString(8, "vendeur"+i);
	    	stmt.executeUpdate();
	    
	    	
	    }
	    
	    
		/*
		 * for(int i =0 ; i<(voiturechevrolet.length);i++) {
		 * 
		 * 
		 * Connection connect = null ; PreparedStatement stmt = connect.
		 * prepareStatement("INSERT INTO Voiture(nomVoiture,vitesse,sourceImg,prix,total_Disponible,Categorie_idCategorie,pays,entrepot_identrepot) VALUES (?, ?, ?,?, ?, ?,?, ?)"
		 * ); stmt.setString(1, ); stmt.setString(2, password); stmt.setDate(3, new
		 * Date()); stmt.setString(1, email); stmt.setString(2, password);
		 * stmt.setDate(3, new Date()); stmt.setString(1, email); stmt.setString(2,
		 * password); stmt.executeUpdate();
		 * 
		 * 
		 * }
		 * 
		 * 
		 * for(int i =0 ; i<(voiturechevrolet.length);i++) {
		 * 
		 * 
		 * Connection connect = null ; PreparedStatement stmt = connect.
		 * prepareStatement("INSERT INTO Voiture(nomVoiture,vitesse,sourceImg,prix,total_Disponible,Categorie_idCategorie,pays,entrepot_identrepot) VALUES (?, ?, ?,?, ?, ?,?, ?)"
		 * ); stmt.setString(1, ); stmt.setString(2, password); stmt.setDate(3, new
		 * Date()); stmt.setString(1, email); stmt.setString(2, password);
		 * stmt.setDate(3, new Date()); stmt.setString(1, email); stmt.setString(2,
		 * password); stmt.executeUpdate();
		 * 
		 * 
		 * }
		 */
	    
	  }
		

	
	 
	 
	}

	


	

