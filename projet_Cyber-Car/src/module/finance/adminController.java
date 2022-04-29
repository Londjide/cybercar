package module.finance;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import javafx.scene.input.TouchEvent;
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
	
	
    @FXML
    private Button logOut;

    @FXML
    private TextField Nsuivi;
    
    @FXML
    private TabPane selection;

    @FXML
    private TextField Ntransaction;

    @FXML
    private TextField Resmise;

    @FXML
    private Button Vm;

    @FXML
    private Tab acceuils;
    
    @FXML
    private CategoryAxis abs;
    
    @FXML
    private NumberAxis ordoo;
 

    @FXML
    private TableColumn<?, ?> adresse;

    @FXML
    private DatePicker auVente;

    @FXML
    private Text chiffreAffaire;

    @FXML
    private Text chifreVente;

    @FXML
    private TableColumn<?, ?> civilite;

    @FXML
    private Button commande;

    @FXML
    private Text commendeEncours;

    @FXML
    private TableColumn<?, ?> congRestant;

    @FXML
    private Text credit;

    @FXML
    private TableColumn<?, ?> dEmbauche;

    @FXML
    private TableColumn<Vente , String> date;

    @FXML
    private Tab depRh;

    @FXML
    private StackedBarChart<String, Number> diagram;

    @FXML
    private DatePicker duVente;

    @FXML
    private TableColumn<?, ?> email;

    @FXML
    private TableColumn<?, ?> finContrat;

    @FXML
    private TableColumn<?, ?> fonction;

    @FXML
    private Text logDate;

    @FXML
    private TableColumn<Vente , Number> mpayer;

    @FXML
    private Text nbEmployee;

    @FXML
    private TableColumn<?, ?> nbrEnfant;

    @FXML
    private Text nbrVente;

    @FXML
    private TableColumn<?, ?> ndf;

    @FXML
    private TableColumn<?, ?> nom;

    @FXML
    private TableColumn<?, ?> prenom;

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
    private TableColumn<?, ?> tel;

    @FXML
    private Text totalVente;

    @FXML
    private TableColumn<Vente , Number> transaction;

    @FXML
    private Tab ventte;
    
   
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
    void onRapport(ActionEvent event) {
    	
    	selection.getSelectionModel().select(shop);

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
    void onVm(ActionEvent event) {
    	selection.getSelectionModel().select(ventte);

    }



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
		
		try
		{
			financeData.getDataRapport();
			financeData.getDepVente();
			
			graphiqueLauch();
			tableVenteLaunch();
			
			
			
			
			
			this.acceuils.setClosable(false);
			this.credit.setText(String.valueOf(financeData.getChiffreDaffaire())+" "+"rs");
			this.commendeEncours.setText(String.valueOf(financeData.nombrCommande())+" ");
			this.nbEmployee.setText(String.valueOf(financeData.totalEmployee()));
			this.stock.setText(String.valueOf(financeData.getVoitureEnStock()));
			this.totalVente.setText(String.valueOf(financeData.getTotalVente()));
			this.chiffreAffaire.setText(String.valueOf(financeData.getChiffreDaffaire()));
			
			
			
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
