package admin.finance;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ResourceBundle;

import com.gluonhq.charm.glisten.control.TextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
	double PrixTotal = 0 ;
	int identifiantRenault;
	int identifiantTesla;
	int identifiantToyota;
	int identifiantChevrolet;
	
	
	
	int compteurR =0;
	
	
	
	
	
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

	
	
	
	private void informationCredit() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("credit insufisant ");
		alert.setHeaderText("information:");
		alert.setContentText("le credit disponible ne permet pas d'ajouter une nouvelle voiture !");
		alert.showAndWait();
		
	}
	
	
	@SuppressWarnings({ "unchecked", "static-access" })
	private void ShowPanier() {
		
		
		TableView<panierData> table = new TableView<panierData>();
		TableColumn<panierData,String> nameCar = new TableColumn<panierData,String>("Nom de la voiture");
        TableColumn<panierData,String> quantity = new TableColumn<panierData,String>("Quantité");
        
        System.out.println(quantite.get(0));
        System.out.println(Renaultid.indexOf(String.valueOf(quantite.get(0))));
        System.out.println("id:"+Renaultid);
        
        HashSet<Integer> uniqueValue = new HashSet<Integer>(quantite);
        
        int comtpteur = 0;
       
        ObservableList<panierData>data = FXCollections.observableArrayList();
        for(int i = 0;i<quantite.size();i++)
        {
        	if(Renaultid.contains(String.valueOf(quantite.get(i))))
        	{
        		
        		  for(int j=0 ;j<quantite.size();j++)
        		  {
        			  
        			  if(quantite.get(j)==quantite.get(i))
        			  {
        				  
        				  comtpteur++;
        				  
        				   
        				  
        				 
        				  
        			  }
        				  
        			 
        		  }
        		  System.out.println("id : "+quantite.get(i) + " nombre  ==== > "+comtpteur);
        		  
        		
					/*
					 * System.out.print(true ); System.out.print(RenaultNom.get(i));
					 */
        		  
        		
        	}
        	
        	comtpteur = 0;
        	
        	//data.add(new panierData ("1","222"));
        	
        }
 
  
        table.setColumnResizePolicy(table.CONSTRAINED_RESIZE_POLICY);
        table.getColumns().addAll(nameCar,quantity);
        nameCar.setCellValueFactory(new PropertyValueFactory<panierData,String>("nomVoiture"));
        quantity.setCellValueFactory(new PropertyValueFactory<panierData,String>("quantityVoiture"));
        table.setItems(data);
        
        
 
        
        table.autosize();
        table.setPrefWidth(400);
        table.setPrefHeight(400);
        
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setResizable(true);
		alert.setTitle("RECAPITULATIF PANIER ");
		alert.setGraphic(table);
		alert.showAndWait();
		
		
	}
	
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
    void onDashboard(ActionEvent event) {

    }

    @FXML
    void onPr1(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	
    	
    		
    	if(compteurRenault>=1 && compteurRenault<=Renaultimg.size()-1)	
    	{
    		compteurRenault--;
    		sui1.setDisable(false);
    		
    		
    	}
    	if(compteurRenault==0)
    	{
    		pr1.setDisable(true);
    	}
 
    	
    	  int nbrVoitureID =0;
		  InputStream stream = new FileInputStream(Renaultimg.get(compteurRenault)); 
		  Image image = new Image(stream); VRenault.setImage(image);
		  RPrix.setText(Renaultprice.get(compteurRenault));
		  MarqueR.setText(RenaultNom.get(compteurRenault));
		  VitesseR.setText(RenaultVitesse.get(compteurRenault));
		  identifiantRenault = Integer.valueOf(Renaultid.get(compteurRenault));
		  
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantRenault)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantRenault+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrR.setText(String.valueOf(nbrVoitureID));
		  }
		  
		 
		  

    }

    @FXML
    void onPr2(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	if(compteurTesla>=1 && compteurTesla<=Teslaimg.size()-1)	
    	{
    		compteurTesla--;
    		sui2.setDisable(false);
    		
    		
    	}
    	if(compteurTesla==0)
    	{
    		pr2.setDisable(true);
    	}
    	
  
    		
    	
    	
    	  int nbrVoitureID = 0;
		  InputStream stream = new FileInputStream(Teslaimg.get(compteurTesla)); 
		  Image image = new Image(stream); VTesla.setImage(image);
		  TPrix.setText(Teslatprice.get(compteurTesla));
		  MarqueT.setText(TeslaNom.get(compteurTesla));
		  VitesseT.setText(TeslaVitesse.get(compteurTesla));
		  identifiantTesla = Integer.valueOf(Teslaid.get(compteurTesla));
		  
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantTesla)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantTesla+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrT.setText(String.valueOf(nbrVoitureID));
		  }
		  
		  
		  
		  
		  

    }

    @FXML
    void onPr3(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	if(compteurChevrolet>=1 && compteurChevrolet<=chevroletimg.size()-1)	
    	{
    		compteurChevrolet--;
    		sui3.setDisable(false);
    		
    		
    	}
    	if(compteurChevrolet==0)
    	{
    		pr3.setDisable(true);
    	}
    	
    	
    
    	
    	
    	
    	  int nbrVoitureID = 0;
		  InputStream stream = new FileInputStream(chevroletimg.get(compteurChevrolet)); 
		  Image image = new Image(stream); VChevrolet.setImage(image);
		  CPrix.setText(chevroletprice.get(compteurChevrolet));
		  MarqueC.setText(chevroletNom.get(compteurChevrolet));
		  VitesseC.setText(chevroletVitesse.get(compteurChevrolet));
		  identifiantChevrolet = Integer.valueOf(chevroletid.get(compteurChevrolet));
		  
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)== identifiantChevrolet)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantChevrolet+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrC.setText(String.valueOf(nbrVoitureID));
		  }
		  
		  


    }
    
    @FXML
    void onPr4(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	if(compteurToyota>=1 && compteurToyota<=9)	
    	{
    		compteurToyota--;
    		sui4.setDisable(false);
    		
    		
    	}
    	if(compteurToyota==0)
    	{
    		pr4.setDisable(true);
    	}
    	
    	
    	
    		
    
    	
    	  int  nbrVoitureID =0 ;
		  InputStream stream = new FileInputStream(Toyotaimg.get(compteurToyota)); 
		  Image image = new Image(stream); VToyota.setImage(image);
		  ToPrix.setText(Toyotaprice.get(compteurToyota));
		  MarqueTo.setText(ToyotaNom.get(compteurToyota));
		  VitesseTo.setText(ToyotaVitesse.get(compteurToyota));
		  identifiantToyota = Integer.valueOf(Toyotaid.get(compteurToyota));
		  
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantToyota)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantToyota+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrC.setText(String.valueOf(nbrVoitureID));
		  }
		  
		  
		  
		  


    }

    @FXML
    void onSui1(ActionEvent event) throws FileNotFoundException, SQLException {
    	
    	if(compteurRenault<=Renaultimg.size() && compteurRenault>=0)
    	{
    		compteurRenault++;
    	}
    		
    	
    	if( compteurRenault>=Renaultimg.size()-1)
    	{
    		sui1.setDisable(true);
    		
    		
    	}
    	
    	if(compteurRenault>0)
    	{
    		pr1.setDisable(false);
    	}
    	
    		
    
    		
    	  
    	  int nbrVoitureID = 0;
		  InputStream stream = new FileInputStream(Renaultimg.get(compteurRenault)); 
		  Image image = new Image(stream); VRenault.setImage(image);
		  RPrix.setText(Renaultprice.get(compteurRenault));
		  MarqueR.setText(RenaultNom.get(compteurRenault));
		  VitesseR.setText(RenaultVitesse.get(compteurRenault));
		  identifiantRenault = Integer.valueOf(Renaultid.get(compteurRenault));
		  
		 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantRenault)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantRenault+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrR.setText(String.valueOf(nbrVoitureID));
		  }
    	
    	
		  
		  
		  
		  
		  
		  
		  
		 
    	

    }

    @FXML
    void onSui2(ActionEvent event) throws SQLException, FileNotFoundException {
    	
    	
    	
    	if(compteurTesla<=Teslaimg.size() && compteurTesla>=0)
    	{
    		compteurTesla++;
    	}
    		
    	
    	if( compteurTesla>=Teslaimg.size()-1)
    	{
    		sui2.setDisable(true);
    		
    		
    	}
    	
    	if(compteurTesla>0)
    	{
    		pr2.setDisable(false);
    	}
    	
    	
    	
    	
    	
    	
  
    	
    	  int nbrVoitureID = 0;
		  InputStream stream = new FileInputStream(Teslaimg.get(compteurTesla)); 
		  Image image = new Image(stream); VTesla.setImage(image);
		  TPrix.setText(Teslatprice.get(compteurTesla));
		  MarqueT.setText(TeslaNom.get(compteurTesla)); 
		  VitesseT.setText(TeslaVitesse.get(compteurTesla));
		  identifiantTesla = Integer.valueOf(Teslaid.get(compteurTesla));
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantTesla)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantTesla+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrT.setText(String.valueOf(nbrVoitureID));
		  }



    }

    @FXML
    void onSui3(ActionEvent event) throws SQLException, FileNotFoundException {

    	
    	
    	if(compteurChevrolet<=chevroletimg.size() && compteurChevrolet>=0)
    	{
    		compteurChevrolet++;
    	}
    		
    	
    	if( compteurChevrolet>=chevroletimg.size()-1)
    	{
    		sui3.setDisable(true);
    		
    		
    	}
    	
    	if(compteurChevrolet>0)
    	{
    		pr3.setDisable(false);
    	}
    	
    	

    	
    		
    
    	
    	  int nbrVoitureID =0;
		  InputStream stream = new FileInputStream(chevroletimg.get(compteurChevrolet)); 
		  Image image = new Image(stream); VChevrolet.setImage(image);
		  CPrix.setText(chevroletprice.get(compteurChevrolet));
		  MarqueC.setText(chevroletNom.get(compteurChevrolet));
		  VitesseC.setText(chevroletVitesse.get(compteurChevrolet));
		  identifiantChevrolet= Integer.valueOf(chevroletid.get(compteurChevrolet));
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantChevrolet)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantChevrolet+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrC.setText(String.valueOf(nbrVoitureID));
		  }
		  
		 
	    	
    }

    @FXML
    void onSui4(ActionEvent event) throws SQLException, FileNotFoundException {
    	

    	if(compteurToyota<=Toyotaimg.size() && compteurToyota>=0)
    	{
    		compteurToyota++;
    	}
    		
    	
    	if( compteurToyota>=Toyotaimg.size()-1)
    	{
    		sui4.setDisable(true);
    		
    		
    	}
    	
    	if(compteurToyota>0)
    	{
    		pr4.setDisable(false);
    	}
    	
    	
    		
    
    	
    	  int nbrVoitureID =0;
		  InputStream stream = new FileInputStream(Toyotaimg.get(compteurToyota)); 
		  Image image = new Image(stream); VToyota.setImage(image);
		  ToPrix.setText(Toyotaprice.get(compteurToyota));
		  MarqueTo.setText(ToyotaNom.get(compteurToyota));
		  VitesseTo.setText(ToyotaVitesse.get(compteurToyota));
		  identifiantToyota= Integer.valueOf(Toyotaid.get(compteurToyota));
			 
		  for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantToyota)
			  {
				  nbrVoitureID++;
				  
			  }
				  
			  System.out.println("valueur id : "+identifiantToyota+"  ===> valeur quantite : "+quantite.get(i)+"====> NB FOIS"+nbrVoitureID );
			  
			  nbrTo.setText(String.valueOf(nbrVoitureID));
		  }
		  
		  


    }
    
    void OnafficheAllImage() throws FileNotFoundException
    {
    	//renault 
    	InputStream stream = new FileInputStream(Renaultimg.get(compteurRenault)); 
    	Image image = new Image(stream);
    	VRenault.setImage(image);
    	RPrix.setText(Renaultprice.get(compteurRenault));
    	MarqueR.setText(RenaultNom.get(compteurRenault));
    	VitesseR.setText(RenaultVitesse.get(compteurRenault));
    	identifiantRenault = Integer.valueOf(Renaultid.get(compteurRenault));
    	pr1.setDisable(true);

    	//Tesla
    	InputStream stream1 = new FileInputStream(Teslaimg.get(compteurTesla)); 
    	Image image1 = new Image(stream1); VTesla.setImage(image1);
    	TPrix.setText(Teslatprice.get(compteurTesla));
    	MarqueT.setText(TeslaNom.get(compteurTesla)); 
    	VitesseT.setText(TeslaVitesse.get(compteurTesla));
    	identifiantTesla = Integer.valueOf(Teslaid.get(compteurTesla));
    	pr2.setDisable(true);


    	//chevrolet
    	InputStream stream2 = new FileInputStream(chevroletimg.get(compteurChevrolet)); 
    	Image image2 = new Image(stream2); VChevrolet.setImage(image2);
    	CPrix.setText(chevroletprice.get(compteurChevrolet));
    	MarqueC.setText(chevroletNom.get(compteurChevrolet));
    	VitesseC.setText(chevroletVitesse.get(compteurChevrolet));
    	identifiantChevrolet= Integer.valueOf(chevroletid.get(compteurChevrolet));
    	pr3.setDisable(true);

    	
    	InputStream stream3 = new FileInputStream(Toyotaimg.get(compteurToyota)); 
    	Image image3 = new Image(stream3); VToyota.setImage(image3);
    	ToPrix.setText(Toyotaprice.get(compteurToyota));
    	MarqueTo.setText(ToyotaNom.get(compteurToyota));
    	VitesseTo.setText(ToyotaVitesse.get(compteurToyota));
    	identifiantToyota= Integer.valueOf(Toyotaid.get(compteurToyota));
    	pr4.setDisable(true);
	
		
    }
    
    @FXML
    void onRachat(ActionEvent event)
    {
    	
    	 int  nbrCarValide = 0; 
    	
    	//System.out.println(quantite);
    	
    	
    	if(PrixTotal<Integer.valueOf(credit.getText()) && (PrixTotal+Integer.valueOf(RPrix.getText()))<Integer.valueOf(credit.getText()))
    	{
    	
    			
    		quantite.add(Integer.parseInt(Renaultid.get(compteurRenault)));
    		
    		PrixTotal += Integer.valueOf(RPrix.getText());
    		
    		total.setText(String.valueOf(PrixTotal));
    	}else
    	{
    		informationCredit();
    	}
    	
    	
    	 for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantRenault)
			  {
				  nbrCarValide++;
				  
			  }
				 
			  
			  nbrR.setText(String.valueOf(nbrCarValide));
		  }
		  
    
    	nbrVoiture.setText(String.valueOf(quantite.size()));
    
    	nbrVoiture.setDisable(true);
    	
    	
    	
    	
    		
    	
    	
    	
    	//System.out.print(Rprix.getText());
    	
    	
    	
    	
    	

    
    }
    

    @FXML
    void onTachat(ActionEvent event) {
    	
    	 int  nbrCarValide = 0; 
     	
     	//System.out.println(quantite);
     	
     	
     	if(PrixTotal<Integer.valueOf(credit.getText()) && (PrixTotal+Integer.valueOf(TPrix.getText()))<Integer.valueOf(credit.getText()))
     	{
     		quantite.add(Integer.parseInt(Teslaid.get(compteurTesla)));
     		
     		PrixTotal += Integer.valueOf(TPrix.getText());
     		
     		total.setText(String.valueOf(PrixTotal));
     	}else
    	{
    		informationCredit();
    	}
     	
     	
     	 for(int i=0 ;i<quantite.size();i++)
 		  {
 			  
 			  if(quantite.get(i)==identifiantTesla)
 			  {
 				  nbrCarValide++;
 				  
 			  }
 				 
 			  
 			  nbrT.setText(String.valueOf(nbrCarValide));
 		  }
 		  
     
     	nbrVoiture.setText(String.valueOf(quantite.size()));
     
     	nbrVoiture.setDisable(true);
     	

    }

    @FXML
    void onToachat(ActionEvent event) {
    	
    	 int  nbrCarValide = 0; 
     	
     	//System.out.println(quantite);
     	
     	
     	if(PrixTotal<Integer.valueOf(credit.getText()) && (PrixTotal+Integer.valueOf(ToPrix.getText()))<Integer.valueOf(credit.getText()))
     	{
     		quantite.add(Integer.parseInt(Toyotaid.get(compteurToyota)));
     		
     		PrixTotal += Integer.valueOf(ToPrix.getText());
     		
     		total.setText(String.valueOf(PrixTotal));
     	}else
    	{
    		informationCredit();
    	}
     	
     	
     	 for(int i=0 ;i<quantite.size();i++)
 		  {
 			  
 			  if(quantite.get(i)==identifiantToyota)
 			  {
 				  nbrCarValide++;
 				  
 			  }
 				 
 			  
 			  nbrTo.setText(String.valueOf(nbrCarValide));
 		  }
 		  
     
     	nbrVoiture.setText(String.valueOf(quantite.size()));
     
     	nbrVoiture.setDisable(true);
     	

    }

    @FXML
    void onCachat(ActionEvent event)
    {
    	
    	
   	 int  nbrCarValide = 0; 
    	
    	//System.out.println(quantite);
    	
    	
    	if(PrixTotal<Integer.valueOf(credit.getText()) && (PrixTotal+Integer.valueOf(CPrix.getText()))<Integer.valueOf(credit.getText()))
    	{
    		quantite.add(Integer.parseInt(chevroletid.get(compteurChevrolet)));
    		
    		PrixTotal += Integer.valueOf(CPrix.getText());
    		
    		total.setText(String.valueOf(PrixTotal));
    	}else
    	{
    		informationCredit();
    	}
    	
    	
    	 for(int i=0 ;i<quantite.size();i++)
		  {
			  
			  if(quantite.get(i)==identifiantChevrolet)
			  {
				  nbrCarValide++;
				  
			  }
				 
			  
			  nbrC.setText(String.valueOf(nbrCarValide));
		  }
		  
    
    	nbrVoiture.setText(String.valueOf(quantite.size()));
    
    	nbrVoiture.setDisable(true);
    	

    }
    @FXML
    void onValide(ActionEvent event) {
    	
    	
    	ShowPanier();

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
	
		
		
		
		credit.setText("60001121");
		
	try {
			
			financeData.getAllVoitureRenault();
			financeData.getallvoitureTestla();
			financeData.getallvoitureChevrolet();
			financeData.getallvoitureToyota();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	try {
		OnafficheAllImage();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	
		
		
	}




}
