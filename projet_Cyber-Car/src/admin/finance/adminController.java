package admin.finance;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdbcconnection.financeData;

public class adminController implements Initializable {
	

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
    private TableColumn<?, ?> date;

    @FXML
    private Tab depRh;

    @FXML
    private StackedBarChart<?, ?> diagram;

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
    private TableColumn<?, ?> mpayer;

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
    private TableColumn<?, ?> remiseA;

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
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tel;

    @FXML
    private Text totalVente;

    @FXML
    private TableColumn<?, ?> transaction;

    @FXML
    private Tab ventte;
    
   
    @FXML
    void onCommande(ActionEvent event) {
    	
    	selection.getSelectionModel().select(shop);

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
    void onSeoumetV(ActionEvent event) {

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
		this.acceuils.setClosable(false);
		
		try {
			this.credit.setText(String.valueOf(financeData.getChiffreDaffaire())+" "+"rs");
			this.commendeEncours.setText(String.valueOf(financeData.nombrCommande())+" ");
			this.nbEmployee.setText(String.valueOf(financeData.totalEmployee()));
			this.stock.setText(String.valueOf(financeData.getVoitureEnStock()));
			this.totalVente.setText(String.valueOf(financeData.getTotalVente()));
			this.chiffreAffaire.setText(String.valueOf(financeData.getChiffreDaffaire()));
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
