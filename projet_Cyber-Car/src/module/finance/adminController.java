package module.finance;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdbcconnection.financeData;

public class adminController implements Initializable {
	

	
	public static ArrayList<String> DateR = new ArrayList<String>();
	public static ArrayList<Integer> nbrVenteR = new ArrayList<Integer>();
	public static ArrayList<Number> chiffreR = new ArrayList<Number>();
	
	
	
	
	public static ArrayList<Integer> Transaction = new ArrayList<Integer>();
	public static ArrayList<String> Date = new ArrayList<String>();
	public static ArrayList<Double> Montant = new ArrayList<Double>();
	public static ArrayList<Double> Remise = new ArrayList<Double>();
	
	
	public static ArrayList<String> Nom = new ArrayList<String>();
	public static ArrayList<String> Prenom  = new ArrayList<String>();
	public static ArrayList<String> nJeuneFille = new ArrayList<String>();
	public static ArrayList<String> Civilite = new ArrayList<String>();
	public static ArrayList<String> NbrEnfant = new ArrayList<String>();
	public static ArrayList<String> Fonction = new ArrayList<String>();
	public static ArrayList<String> Dembauche = new ArrayList<String>();
	public static ArrayList<String> CongRestant = new ArrayList<String>();
	public static ArrayList<String> Fcontrat = new ArrayList<String>();
	public static ArrayList<String> Adresse = new ArrayList<String>();
	public static ArrayList<String> Ntel = new ArrayList<String>();
	public static ArrayList<String> Email = new ArrayList<String>();
	
	
	
	
	
	
	
	
	@FXML
	private Button lancerR;
	
    @FXML
    private Button logOut;

    @FXML
    private TextField Nsuivi;
    
    @FXML
    public static TabPane selection;

	@FXML
    private TextField Ntransaction;

    @FXML
    private TextField Resmise;

    @FXML
    public static Button Vm;

    @FXML
    private Tab acceuils;
    

	@FXML
    private CategoryAxis abs;
    
    @FXML
    private NumberAxis ordoo;
 

    @FXML
    private TableColumn<Profiles,String> adresse;

    @FXML
    private DatePicker auVente;

    @FXML
    private Text chiffreAffaire;

    @FXML
    private Text chifreVente;

    @FXML
    private TableColumn<Profiles,String> civilite;

    @FXML
    private Button commande;

    @FXML
    private Text commendeEncours;

    @FXML
    private TableColumn<Profiles,String> congRestant;

    @FXML
    private Text credit;

    @FXML
    private TableColumn<Profiles,String> dEmbauche;

    @FXML
    private TableColumn<Vente , String> date;

    @FXML
    private Tab depRh;

    @FXML
    private StackedBarChart<String, Number> diagram;

    @FXML
    private DatePicker duVente;

    @FXML
    private TableColumn<Profiles,String> email;

    @FXML
    private TableColumn<Profiles,String> finContrat;

    @FXML
    private TableColumn<Profiles,String> fonction;

    @FXML
    private Text logDate;

    @FXML
    private TableColumn<Vente , Number> mpayer;

    @FXML
    private Text nbEmployee;

    @FXML
    private TableColumn<Profiles,String> nbrEnfant;

    @FXML
    private Text nbrVente;

    @FXML
    private TableColumn<Profiles,String> ndf;

    @FXML
    private TableColumn<Profiles,String> nom;

    @FXML
    private TableColumn<Profiles,String> prenom;

    @FXML
    private Button rapport;

    @FXML
    private TableColumn<Vente , Number> remiseA;

    @FXML
    private JFXTextArea reponse;

    @FXML
    private Button rh;

    @FXML
    private Tab shop;

    @FXML
    private Button soumetrreV;

    @FXML
    private Text stock;

    @FXML
    private JFXButton submit;

    @FXML
    private Button suivi;

    @FXML
    private Tab suivreTab;

    @FXML
    private TableView<Vente> table;

    @FXML
    private TableColumn<Profiles,String> tel;

    @FXML
    private Text totalVente;

    @FXML
    private TableColumn<Vente , Number> transaction;
    
    @FXML
    private TableView<Profiles> tableRh;

    @FXML
    private static Tab ventte;
    
   
    @SuppressWarnings({ "rawtypes", "unchecked" })
	void graphiqueLauch() throws ParseException
    {
    	diagram.animatedProperty();
    	diagram.autosize();
    
    	
    	XYChart.Series series = new XYChart.Series();
    	
    	
    	
    	for(int i = 0;i<DateR.size();i++)
    	{
    
    		series.getData().add(new XYChart.Data(DateR.get(i), chiffreR.get(i)));
    	}
    	diagram.lookup(".chart-plot-background").setStyle("-fx-background-color:transparent");
 
    	diagram.getData().add(series);
    	
   }
    
    
    @FXML
    void onCommande(ActionEvent event) {
    	
    	selection.getSelectionModel().select(shop);

    }
    
    /**
     * 
     */
    void tableRhLaunch()
    {
		
		  ObservableList<Profiles>data = FXCollections.observableArrayList();
		  
		  

		
			 
		  data.add(new Profiles(
				  Nom.get(0),
				  Prenom.get(0),
				  nJeuneFille.get(0),
				  Civilite.get(0),
				  NbrEnfant.get(0),
				  Fonction.get(0),
				  Dembauche.get(0),
				  CongRestant.get(0),
				  Fcontrat.get(0),
				  Adresse.get(0),
				  Ntel.get(0),
				  Email.get(0))); 
		  
		 
		  System.out.println(data);
		  
		  
		  nom.setCellValueFactory(new PropertyValueFactory<Profiles, String>("nom"));
		  prenom.setCellValueFactory(new PropertyValueFactory<Profiles,String>("prenom"));
		  ndf.setCellValueFactory(new PropertyValueFactory<Profiles, String>("NjeuneFille"));
		  civilite.setCellValueFactory(new PropertyValueFactory<Profiles,String>("civilite"));
		  nbrEnfant.setCellValueFactory(new PropertyValueFactory<Profiles, String>("nbrEnfant"));
		  fonction.setCellValueFactory(new PropertyValueFactory<Profiles, String>("fonction"));
		  dEmbauche.setCellValueFactory(new PropertyValueFactory<Profiles,String>("Dembauche"));
		  congRestant.setCellValueFactory(new PropertyValueFactory<Profiles, String>("ConRestant"));
		  finContrat.setCellValueFactory(new PropertyValueFactory<Profiles,String>("Fcontrat")); 
		  adresse.setCellValueFactory(new PropertyValueFactory<Profiles, String>("Adresse"));
		  tel.setCellValueFactory(new PropertyValueFactory<Profiles, String>("Ntel"));
		  email.setCellValueFactory(new PropertyValueFactory<Profiles,String>("email"));
		  
		  tableRh.setItems(data);
		  
		 
    }
    
    
    void tableVenteLaunch()
    {
    	
    	ObservableList<Vente>data = FXCollections.observableArrayList();
    	
    	for(int i=0;i<Transaction.size();i++)
    	{
    		data.add(new Vente(Transaction.get(i),Date.get(i),Montant.get(i),Remise.get(i)));
    	}
    	
    	transaction.setCellValueFactory(new PropertyValueFactory<Vente,Number>("reference"));
    	date.setCellValueFactory(new PropertyValueFactory<Vente,String>("date"));
    	mpayer.setCellValueFactory(new PropertyValueFactory<Vente,Number>("montant"));
    	remiseA.setCellValueFactory(new PropertyValueFactory<Vente,Number>("remise"));
    	table.setItems(data);
    	
    	
    }
    
    @FXML
    void selectedd(MouseEvent event)
    {
    	try	{
    		System.out.println(table.getSelectionModel().getSelectedItem().getReference());
    		Ntransaction.setText(String.valueOf(table.getSelectionModel().getSelectedItem().getReference()));
    	
    	}catch(Exception e)
    	{
    		
    	}
    	
    }

   

    @FXML
    void onRh(ActionEvent event) {
    	
    	
    	selection.getSelectionModel().select(depRh);

    }

    @FXML
    void onSeoumetV(ActionEvent event)
    {
    	try {
    		
    		if(table.getSelectionModel().getSelectedItem().getMontant()<Double.valueOf(Resmise.getText()))
        	{
    			System.out.println(table.getSelectionModel().getSelectedItem().getMontant()<Double.valueOf(Resmise.getText()));
        		Alert alert = new Alert(AlertType.WARNING);
        		alert.setWidth(600);
        		alert.setHeight(600);
        		alert.setTitle("La Remise ");
        		alert.setHeaderText("Attention");
        		alert.setContentText("La remise est trop élevé par rapport à la Remise verrifier votre saisi");
        		alert.showAndWait();
        		Resmise.setText("");
        		
        	}
    		else
    		{
    			do {
            		
            		
    				
            		financeData.UpdateRemiseClient(Integer.valueOf(Ntransaction.getText()),Double.valueOf(Resmise.getText()));
            		financeData.getDepVente();
            		tableVenteLaunch();
            		
            		
            		}
            	while(table.getSelectionModel().getSelectedItem().getMontant()>Double.valueOf(Resmise.getText()));

    			
        		
        	}
    		  
    	}catch(Exception e) {}
    	

    }
    
    @FXML
    void onTouchAction(KeyEvent event) 
    {
    	

    }


    @FXML
    void onSubmit(ActionEvent event) {

    }

    @FXML
    void onSuivi(ActionEvent event)
    {
    
    

    }
    
    @FXML
    void onLogout(ActionEvent event) throws IOException {
    	
    	Stage thisFenetre = (Stage) logOut.getScene().getWindow();
    	thisFenetre.close();
    	Parent authentification = FXMLLoader.load(getClass().getResource("projet Fxml/connexion.fxml"));
    	Scene fenetre0 = new Scene(authentification);
    	thisFenetre.setScene(fenetre0);
    	thisFenetre.setTitle("AUTHENTIFICATION");
    	thisFenetre.setResizable(false);
    	thisFenetre.centerOnScreen();
    	thisFenetre.show();

    }


    @FXML
	 void onVm(ActionEvent event)
    {
    	
    	selection.getSelectionModel().select(ventte);
    	System.out.println(selection.getSelectionModel().getSelectedItem());
    	
    }
    @FXML
    void onLanceR(ActionEvent event) 
    {
    	//System.out.println(duVente.getValue().toString());
    	
    	financeData.getRapportByDate(duVente.getValue().toString(),auVente.getValue().toString());
    	tableVenteLaunch();

    }
   
    



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
		
		try
		{
			financeData.getDataRapport();
			financeData.getDepVente();
			financeData.getEmmployeeData();
			
			
			graphiqueLauch();
			tableVenteLaunch();
			tableRhLaunch();
			
			
			
			
			
			this.acceuils.setClosable(false);
			this.credit.setText(String.valueOf(financeData.getChiffreDaffaire())+" "+"rs");
			this.commendeEncours.setText(String.valueOf(financeData.nombrCommande())+" ");
			this.nbEmployee.setText(String.valueOf(financeData.totalEmployee()));
			this.stock.setText(String.valueOf(financeData.getVoitureEnStock()));
			this.totalVente.setText(String.valueOf(financeData.getTotalVente()));
			this.nbrVente.setText(String.valueOf(financeData.getTotalVente()));
			this.chiffreAffaire.setText(String.valueOf(financeData.getChiffreDaffaire()));
			this.chifreVente.setText(String.valueOf(financeData.getChiffreDaffaire()));
			
			
			
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
