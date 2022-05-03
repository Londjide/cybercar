package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import module.finance.adminController;
import module.finance.controllerAchat;


public class financeData
{
	
	
	public static void getAllVoitureRenault() throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call Renaultcar() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	controllerAchat.setRenaultid(ids);
	            	controllerAchat.setRenaultNom(nomCar);
	            	controllerAchat.setRenaultprice(prixCar);
	            	controllerAchat.setRenaultimg(imgCar);
	            	controllerAchat.setRenaultVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
			
			
	
	}

	public static void getallvoitureTestla()throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call TeslaCar() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	//System.out.print(ids);
	            	
	            	controllerAchat.setTeslaid(ids);
	            	controllerAchat.setTeslaNom(nomCar);
	            	controllerAchat.setTeslaprice(prixCar);
	            	controllerAchat.setTeslaimg(imgCar);
	            	controllerAchat.setTeslaVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
			
		
	}

	public static void getallvoitureChevrolet()throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call chevrolet_car() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	controllerAchat.setChevroletid(ids);
	            	controllerAchat.setChevroletNom(nomCar);
	            	controllerAchat.setChevroletprice(prixCar);
	            	controllerAchat.setChevroletimg(imgCar);
	            	controllerAchat.setChevroletVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
			
		
	}

	public static void getallvoitureToyota()throws SQLException
	{
		ArrayList<String> imgCar = new ArrayList<String>();
		ArrayList<String> prixCar = new ArrayList<String>();
		ArrayList<String> VitesseCar = new ArrayList<String>();
		ArrayList<String> nomCar = new ArrayList<String>();
		ArrayList<String> ids = new ArrayList<String>();
		ArrayList<String> all = new ArrayList<String>();
		
		
		   String query = "{ call Toyota() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	imgCar.add(rs.getString("img"));
	            	prixCar.add(rs.getString("prix"));
	            	VitesseCar.add(rs.getString("vitesse"));
	            	nomCar.add(rs.getString("nomVoiture"));
	            	ids.add(rs.getString("idCar_Shop"));
	            
	            	
	            	controllerAchat.setToyotaid(ids);
	            	controllerAchat.setToyotaNom(nomCar);
	            	controllerAchat.setToyotaprice(prixCar);
	            	controllerAchat.setToyotaimg(imgCar);
	            	controllerAchat.setToyotaVitesse(VitesseCar);
	   
	            	
	            
	            	
	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
			
		
	}
	
	public static int getChiffreDaffaire() throws SQLException
	{
		   String query = "{ call chiffreDaffaire() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            if(rs.next())
	            	return rs.getInt("ChifreDaffaire");
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
			return 0;
			
	
	}
	
	public static int getTotalVente() throws SQLException
	{
		String query = "{ call totalVente() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("total");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	public static  int nombrCommande() throws SQLException
	{
		
		String query = "{ call nbrComande() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("nbrComande");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	public static int totalEmployee() throws SQLException
	{


		String query = "{ call nbremployee() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("nbremployee");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	public static int getVoitureEnStock() throws SQLException
	{


		String query = "{ call stockVoiture() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("stockVoiture");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
		
	}
	
	public void getDateConnectLast() throws SQLException
	{

		
	}

	public ResultSet getEmplacementCommande(int nSuivi) throws SQLException
	{


		String query = "{ call stockVoiture() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return null;
		
	}
	
	public static void setUpdateStock(int id,int quantite,int entrepot)
	{
		String query = "{ call UpdateStock(?,?,?) }";
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setInt(1, id);
                stmt.setInt(2,quantite);
                stmt.setInt(3, entrepot);
                stmt.execute();
                
        
        	
        	}
        		
       catch (SQLException ex) {
    	   
    	Alert alert = new Alert(AlertType.INFORMATION);
   		alert.setWidth(600);
   		alert.setHeight(600);
   		alert.setTitle("LA COMMANDE");
   		alert.setHeaderText("etat de la commande");
   		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
   		alert.showAndWait();
            //System.out.println(ex.getMessage());
        }
		
	}

	public static int generateNsuivi()
	{
		String query = "{ call LastID() }";
        ResultSet rs;

        try (
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            if(rs.next())
            	return rs.getInt("Nsuivi")+1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
		return 0;
	}

	public static void setCommande(int idVoiture,String nameCar,int Quantite,int entrepot)
	{
		
		
		
		
		String query = "{ call Commander(?,?,?,?) }";
       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setInt(1, idVoiture);
                stmt.setString(2,nameCar);
                stmt.setInt(3, Quantite);
                stmt.setInt(4, entrepot);
                stmt.execute();
                
				/*
				 * Alert alert = new Alert(AlertType.INFORMATION); alert.setWidth(600);
				 * alert.setHeight(600); alert.setTitle("LA COMMANDE");
				 * alert.setHeaderText("etat de la commande");
				 * alert.setContentText("Votre à vien été envoyer voici le Numero de suivi : "
				 * +generateNsuivi()); alert.showAndWait();
				 */
        		
                
                		
        	
        	}
        		
       catch (SQLException ex) {
    	   
    	Alert alert = new Alert(AlertType.INFORMATION);
   		alert.setWidth(600);
   		alert.setHeight(600);
   		alert.setTitle("LA COMMANDE");
   		alert.setHeaderText("etat de la commande");
   		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
   		alert.showAndWait();
            //System.out.println(ex.getMessage());
        }
		
	}
	
	public static void getDataRapport()
	{
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Integer> nbrVente = new ArrayList<Integer>();
		ArrayList<Number> chiffre = new ArrayList<Number>();
		
		
		
		   String query = "{ call graphique() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	date.add(rs.getString("dateDachat"));
	            	nbrVente.add(rs.getInt("nbrVente"));
	            	chiffre.add(rs.getDouble("chiffre"));
	            	
	            
	            	
	            	adminController.DateR = date;
	            	adminController.nbrVenteR = nbrVente;
	            	adminController.chiffreR = chiffre;

	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
		
	}

	public static void getDepVente()
	{
		
		ArrayList<Integer> transaction = new ArrayList<Integer>();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Double> montant = new ArrayList<Double>();
		ArrayList<Double> remise = new ArrayList<Double>();
		
		
		
		   String query = "{ call depVente() }";
	        ResultSet rs;

	        try (Connection conn = ConnectoDataBase.getConnection();
	                CallableStatement stmt = conn.prepareCall(query))
	        {
	            rs = stmt.executeQuery();
	            while(rs.next())
	            {
	            	
	            	transaction.add(rs.getInt("idclients"));
	            	date.add(rs.getString("dateDachat"));
	            	montant.add(rs.getDouble("montant"));
	            	remise.add(rs.getDouble("ramise"));
	            
	            	
	            	
	            	
	            	adminController.Transaction = transaction;
	            	adminController.Date = date;
	            	adminController.Montant = montant;
	            	adminController.Remise = remise;

	        
	            }
	            
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }
		

		
	}

	public static void UpdateRemiseClient(int Transaction,Double Remise)
	{
		
		String query = "{ call RemiseUpdate(?,?) }";
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setInt(1, Transaction);
                stmt.setDouble(2,Remise);
             
                stmt.execute();
                
                
    	}
		
        catch (SQLException ex) {
     	   
     	Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setWidth(600);
    		alert.setHeight(600);
    		alert.setTitle("Remise ");
    		alert.setHeaderText("Le probleme");
    		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
    		alert.showAndWait();
             //System.out.println(ex.getMessage());
         }
		
	}
	
	public static void getRapportByDate(String du,String au)
	
	{

		ArrayList<Integer> transaction = new ArrayList<Integer>();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Double> montant = new ArrayList<Double>();
		ArrayList<Double> remise = new ArrayList<Double>();
		
		String query = "{ call RapportPeriodique(?,?) }";
		ResultSet rs;
	       

        try {
        	
        		Connection conn = ConnectoDataBase.getConnection();
                CallableStatement stmt = conn.prepareCall(query);
                stmt.setString(1, du);
                stmt.setString(2,au);
                rs = stmt.executeQuery();
                
                while(rs.next())
                {
                	transaction.add(rs.getInt("idclients"));
	            	date.add(rs.getString("dateDachat"));
	            	montant.add(rs.getDouble("montant"));
	            	remise.add(rs.getDouble("ramise"));
	            
	            
	        
	            	
	            	
	            	adminController.Transaction = transaction;
	            	adminController.Date = date;
	            	adminController.Montant = montant;
	            	adminController.Remise = remise;
                	
                }
                
        
        	
        	}
        		
       catch (SQLException ex) {
    	   
    	Alert alert = new Alert(AlertType.INFORMATION);
   		alert.setWidth(600);
   		alert.setHeight(600);
   		alert.setTitle("LA COMMANDE");
   		alert.setHeaderText("etat de la commande");
   		alert.setContentText("une Erreur s'est produite =>>>"+ex.getMessage());
   		alert.showAndWait();
            //System.out.println(ex.getMessage());
        }
		
	}
		
	public static void getEmmployeeData()
	{
		
		String query = "{ call GetEmployee() }";
        ResultSet rs;

        try (Connection conn = ConnectoDataBase.getConnection();
             CallableStatement stmt = conn.prepareCall(query))
        {
            rs = stmt.executeQuery();
            while(rs.next())
            {
            	adminController.Nom.add(rs.getString("nom"));
            	adminController.Prenom.add(rs.getString("prenom"));
            	adminController.nJeuneFille.add(rs.getString("nomDeJeuneFille"));
            	adminController.Civilite.add(rs.getString("civilite"));
            	adminController.NbrEnfant.add(rs.getString("nbr enfant"));
            	adminController.Fonction.add(rs.getString("fonction"));
            	adminController.Dembauche.add(rs.getString("date_embauche"));
            	adminController.CongRestant.add(rs.getString("nbr_de_conge_restant"));
            	adminController.Fcontrat.add(rs.getString("date_fin_de_contrat"));
            	adminController.Adresse.add(rs.getString("adresse"));
            	adminController.Ntel.add(rs.getString("tel"));
            	adminController.Email.add(rs.getString("email"));
            	
            	
        
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
	
		
	}
	

}
	
	
	
	