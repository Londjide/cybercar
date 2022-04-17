package admin.finance;
import java.io.IOException;
import java.sql.SQLException;

import com.gluonhq.charm.glisten.control.TextField;
import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import jdbcconnection.ConnectoDataBase;


public class connectController extends Application{

	public boolean fermePage = false;
	
	
	
	@Override
	public void start(Stage PageAuthentification) throws Exception {
		
		Parent authentification  = FXMLLoader.load(getClass().getResource("projet Fxml/connexion.fxml"));
		Scene fenetre1  = new Scene(authentification);
		PageAuthentification.setScene(fenetre1);
		PageAuthentification.setResizable(false);
		PageAuthentification.centerOnScreen();
		PageAuthentification.setTitle("page de Connexion");
		PageAuthentification.show();
		
		
	
	}
	
	public static void main(String[] args) throws SQLException { // TODO Auto-generated method stub
		  Application.launch(args);
		  
		 
	}
    @FXML
    private JFXButton connect;

    @FXML
    private TextField login;

    @FXML
    private TextField mdp;

    @FXML
    void OnConnect(ActionEvent event) throws IOException
    {
    
    	
     Stage fenetre1 = (Stage) connect.getScene().getWindow();
     fenetre1.close();
     Stage fenetre2 = new Stage();
     Parent page2  = FXMLLoader.load(getClass().getResource("projet Fxml/dash2.fxml"));
     Scene dashboard = new Scene(page2);
     fenetre2.setScene(dashboard);
     fenetre2.setTitle("Dasboard");
     fenetre2.show();
   
    }

    @FXML
    void loginValue(MouseEvent event) {

    }

    @FXML
    void mdpValue(MouseEvent event) {

    }

	}
