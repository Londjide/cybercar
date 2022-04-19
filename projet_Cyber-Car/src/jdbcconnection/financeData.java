package jdbcconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import admin.finance.controllerAchat;


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
		
		String query = "{ nbrComande() }";
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


		String query = "{ nbremployee() }";
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


		String query = "{ stockVoiture() }";
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


		String query = "{ stockVoiture() }";
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
	
	
	
}
	
	
	
	