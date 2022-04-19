package admin.finance;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import jdbcconnection.financeData;

public class controllerAchat implements Initializable {
	
	
	private static ArrayList<Integer> quantite = new ArrayList<>();
	
	
	
	
	int compteurRenault= 0;
	int compteurTesla =0;
	int compteurChevrolet=0;
	int compteurToyota=0;
	
	
	
	int value;
	
	
	
	
	
	private static ArrayList<String> chevroletprice = new ArrayList<String>();
	private static ArrayList<String> chevroletVitesse = new ArrayList<String>();
	private static ArrayList<String> chevroletNom = new ArrayList<String>();
	private static ArrayList<String> chevroletid = new ArrayList<String>();


	private static ArrayList<String> Teslaimg = new ArrayList<String>();
	private static ArrayList<String> Teslatprice = new ArrayList<String>();
	private static ArrayList<String> TeslaVitesse = new ArrayList<String>();
	private static ArrayList<String> TeslaNom = new ArrayList<String>();
	private static ArrayList<String> Teslaid = new ArrayList<String>();
	
	
	private static ArrayList<String> Toyotaimg = new ArrayList<String>();
	private static ArrayList<String> Toyotaprice = new ArrayList<String>();
	private static ArrayList<String> ToyotaVitesse = new ArrayList<String>();
	private static ArrayList<String> ToyotaNom = new ArrayList<String>();
	private static ArrayList<String> Toyotaid = new ArrayList<String>();

	
	
	
	public static void setToyotaimg(ArrayList<String> toyotaimg) {
		Toyotaimg = toyotaimg;
	}

	public static void setToyotaprice(ArrayList<String> toyotaprice) {
		Toyotaprice = toyotaprice;
	}

	public static void setToyotaVitesse(ArrayList<String> toyotaVitesse) {
		ToyotaVitesse = toyotaVitesse;
	}

	public static void setToyotaNom(ArrayList<String> toyotaNom) {
		ToyotaNom = toyotaNom;
	}

	public static void setToyotaid(ArrayList<String> toyotaid) {
		Toyotaid = toyotaid;
	}

	public static void setRenaultimg(ArrayList<String> renaultimg) {
		Renaultimg = renaultimg;
	}

	public static void setRenaultprice(ArrayList<String> renaultprice) {
		Renaultprice = renaultprice;
	}



	public static void setRenaultVitesse(ArrayList<String> renaultVitesse) {
		RenaultVitesse = renaultVitesse;
	}



	public static void setRenaultNom(ArrayList<String> renaultNom) {
		RenaultNom = renaultNom;
	}


	public static void setRenaultid(ArrayList<String> renaultid) {
		Renaultid = renaultid;
	}


	private static ArrayList<String> Renaultimg = new ArrayList<String>();
	private static ArrayList<String> Renaultprice = new ArrayList<String>();
	private static ArrayList<String> RenaultVitesse = new ArrayList<String>();
	private static ArrayList<String> RenaultNom = new ArrayList<String>();
	private static ArrayList<String> Renaultid = new ArrayList<String>();
	
	private static ArrayList<String> chevroletimg = new ArrayList<String>();
	public static void setChevroletimg(ArrayList<String> chevroletimg) {
		controllerAchat.chevroletimg = chevroletimg;
	}

	public static void setChevroletprice(ArrayList<String> chevroletprice) {
		controllerAchat.chevroletprice = chevroletprice;
	}

	public static void setChevroletVitesse(ArrayList<String> chevroletVitesse) {
		controllerAchat.chevroletVitesse = chevroletVitesse;
	}

	public static void setChevroletNom(ArrayList<String> chevroletNom) {
		controllerAchat.chevroletNom = chevroletNom;
	}

	public static void setChevroletid(ArrayList<String> chevroletid) {
		controllerAchat.chevroletid = chevroletid;
	}

	public static void setTeslaimg(ArrayList<String> teslatimg) {
		Teslaimg = teslatimg;
	}

	public static void setTeslaprice(ArrayList<String> teslatprice) {
		Teslatprice = teslatprice;
	}

	public static void setTeslaVitesse(ArrayList<String> teslaVitesse) {
		TeslaVitesse = teslaVitesse;
	}

	public static void setTeslaNom(ArrayList<String> teslatNom) {
		TeslaNom = teslatNom;
	}

	public static void setTeslaid(ArrayList<String> teslaid) {
		Teslaid = teslaid;
	}
	
	

	


    @FXML
    private Text CPrix;

    @FXML
    private Button Cachat;

    @FXML
    private Text MarqueC;

    @FXML
    private Text MarqueR;

    @FXML
    private Text MarqueT;

    @FXML
    private Text MarqueTo;

    @FXML
    private Text RPrix;

    @FXML
    private Button Rachat;

    @FXML
    private Text TPrix;

    @FXML
    private Button Tachat;

    @FXML
    private Text ToPrix;

    @FXML
    private Button Toachat;

    @FXML
    private ImageView VChevrolet;

    @FXML
    private ImageView VRenault;

    @FXML
    private ImageView VTesla;

    @FXML
    private ImageView VToyota;

    @FXML
    private Text VitesseC;

    @FXML
    private Text VitesseR;

    @FXML
    private Text VitesseT;

    @FXML
    private Text VitesseTo;

    @FXML
    private Text credit;

    @FXML
    private Button dashboard;

    @FXML
    private Text nbrC;

    @FXML
    private Text nbrR;

    @FXML
    private Text nbrT;

    @FXML
    private Text nbrTo;

    @FXML
    private TextField nbrVoiture;

    @FXML
    private Button pr1;

    @FXML
    private Button pr2;

    @FXML
    private Button pr3;

    @FXML
    private Button pr4;

    @FXML
    private Button sui1;

    @FXML
    private Button sui2;

    @FXML
    private Button sui3;

    @FXML
    private Button sui4;

    @FXML
    private TextField total;

    @FXML
    private Button valide;

    @FXML
    void onCachat(ActionEvent event){

    }

    @FXML
    void onDashboard(ActionEvent event) {

    }

    @FXML
    void onPr1(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	
    	
    		
    	if(compteurRenault>=1 && compteurRenault<=9)	
    	{
    		compteurRenault--;
    		sui1.setDisable(false);
    		
    	}
 
    	
    	  int nbrVoitureID =0;
		  InputStream stream = new FileInputStream(Renaultimg.get(compteurRenault)); 
		  Image image = new Image(stream); VRenault.setImage(image);
		  RPrix.setText(Renaultprice.get(compteurRenault));
		  MarqueR.setText(RenaultNom.get(compteurRenault));
		  VitesseR.setText(RenaultVitesse.get(compteurRenault));
		 // System.out.print(Integer.valueOf(Renaultid.get(compteurRenault)));
		  
		  
		  value = Integer.valueOf(Renaultid.get(compteurRenault));
		  
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==value)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+value+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrR.setText(String.valueOf(nbrVoitureID));
		  }
		  
		 
		  

    }

    @FXML
    void onPr2(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	compteurTesla-=1;
    	
    	if (compteurTesla<0)
    	{
    		compteurTesla =0;
    	}
    		
    	
    	
    	
		  InputStream stream = new FileInputStream(Teslaimg.get(compteurTesla)); 
		  Image image = new Image(stream); VTesla.setImage(image);
		  TPrix.setText(Teslatprice.get(compteurTesla));
		  MarqueT.setText(TeslaNom.get(compteurTesla));
		  VitesseT.setText(TeslaVitesse.get(compteurTesla));

    }

    @FXML
    void onPr3(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	compteurChevrolet-=1;
    	
    	if (compteurChevrolet<0)
    	{
    		compteurChevrolet =0;
    	}
    		
    	
    	
    	
		  InputStream stream = new FileInputStream(chevroletimg.get(compteurChevrolet)); 
		  Image image = new Image(stream); VChevrolet.setImage(image);
		  CPrix.setText(chevroletprice.get(compteurChevrolet));
		  MarqueC.setText(chevroletNom.get(compteurChevrolet));
		  VitesseC.setText(chevroletVitesse.get(compteurChevrolet));
		  


    }
    
    

    @FXML
    void onPr4(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	compteurToyota-=1;
    	
    	if (compteurToyota<0)
    	{
    		compteurToyota =0;
    	}
    		
    
    	
    	
		  InputStream stream = new FileInputStream(Toyotaimg.get(compteurToyota)); 
		  Image image = new Image(stream); VToyota.setImage(image);
		  ToPrix.setText(Toyotaprice.get(compteurToyota));
		  MarqueTo.setText(ToyotaNom.get(compteurToyota));
		  VitesseTo.setText(ToyotaVitesse.get(compteurToyota));
		  
		  


    }

    @FXML
    void onRachat(ActionEvent event)
    {
    	
    	quantite.add(Integer.parseInt(Renaultid.get(compteurRenault)));
    	System.out.println(quantite);
    
    	

    
    }

    @FXML
    void onSui1(ActionEvent event) throws FileNotFoundException, SQLException {
    	
    	if(compteurRenault<=10 && compteurRenault>=0)
    	{
    		compteurRenault++;
    	}
    		
    	
    	if( compteurRenault>=9)
    	{
    		sui1.setDisable(true);
    		
    	}
    	
    		
    
    		
    	  
    	  int nbrVoitureID = 0;
		  InputStream stream = new FileInputStream(Renaultimg.get(compteurRenault)); 
		  Image image = new Image(stream); VRenault.setImage(image);
		  RPrix.setText(Renaultprice.get(compteurRenault));
		  MarqueR.setText(RenaultNom.get(compteurRenault));
		  VitesseR.setText(RenaultVitesse.get(compteurRenault));
		  value = Integer.valueOf(Renaultid.get(compteurRenault));
		  
		 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==value)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+value+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrR.setText(String.valueOf(nbrVoitureID));
		  }
    	
    	
		  
		  
		  
		  
		  
		  
		  
		 
    	

    }

    @FXML
    void onSui2(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	
    	if (compteurTesla>10)
    	{
    		compteurTesla =10;
    	}
    		
  
    	
    	
		  InputStream stream = new FileInputStream(Teslaimg.get(compteurTesla)); 
		  Image image = new Image(stream); VTesla.setImage(image);
		  TPrix.setText(Teslatprice.get(compteurTesla));
		  MarqueT.setText(TeslaNom.get(compteurTesla));
		  
		  VitesseT.setText(TeslaVitesse.get(compteurTesla));



		  compteurTesla+=1;
    }

    @FXML
    void onSui3(ActionEvent event) throws SQLException, FileNotFoundException {


    	if (compteurChevrolet>10)
    	{
    		compteurChevrolet =10;
    	}
    		
    
    	
    	
		  InputStream stream = new FileInputStream(chevroletimg.get(compteurChevrolet)); 
		  Image image = new Image(stream); VChevrolet.setImage(image);
		  CPrix.setText(chevroletprice.get(compteurChevrolet));
		  MarqueC.setText(chevroletNom.get(compteurChevrolet));
		  VitesseC.setText(chevroletVitesse.get(compteurChevrolet));
		  
		  compteurChevrolet+=1;
	    	
    }

    @FXML
    void onSui4(ActionEvent event) throws SQLException, FileNotFoundException {
    	

    	
    	if (compteurToyota>10)
    	{
    		compteurToyota =10;
    	}
    		
    
    	
    	
		  InputStream stream = new FileInputStream(Toyotaimg.get(compteurToyota)); 
		  Image image = new Image(stream); VToyota.setImage(image);
		  ToPrix.setText(Toyotaprice.get(compteurToyota));
		  MarqueTo.setText(ToyotaNom.get(compteurToyota));
		  VitesseTo.setText(ToyotaVitesse.get(compteurToyota));
		  compteurToyota+=1;
		  


    }

    @FXML
    void onTachat(ActionEvent event) {

    }

    @FXML
    void onToachat(ActionEvent event) {

    }

    @FXML
    void onValide(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		try {
			financeData.getAllVoitureRenault();
			financeData.getallvoitureTestla();
			financeData.getallvoitureChevrolet();
			financeData.getallvoitureToyota();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}




}
