package admin.finance;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class controllerAchat {

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
    void onPr1(ActionEvent event) {

    }

    @FXML
    void onPr2(ActionEvent event) {

    }

    @FXML
    void onPr3(ActionEvent event) {

    }

    @FXML
    void onPr4(ActionEvent event) {

    }

    @FXML
    void onRachat(ActionEvent event) {

    }

    @FXML
    void onSui1(ActionEvent event) throws FileNotFoundException {
    	
    	
    	InputStream stream = new FileInputStream("src/admin/finance/projet Fxml/voiture/Silver-Audi-SUV-PNG-Transparent-Image.png");
    	Image image = new Image(stream);
    	VRenault.setImage(image);

    }

    @FXML
    void onSui2(ActionEvent event) {

    }

    @FXML
    void onSui3(ActionEvent event) {

    }

    @FXML
    void onSui4(ActionEvent event) {

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

}
