package module.rh;

import com.gluonhq.charm.glisten.control.AutoCompleteTextField;
import com.gluonhq.charm.glisten.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.text.Text;

public class Recrutement {

    @FXML
    private RadioButton Madame;

    @FXML
    private RadioButton Monsieur;

    @FXML
    private RadioButton celibataire;

    @FXML
    private AutoCompleteTextField<?> email;

    @FXML
    private DatePicker embaucheDate;

    @FXML
    private MenuButton entrepots;

    @FXML
    private TextField indicatif;

    @FXML
    private Text lastConnexion;

    @FXML
    private AutoCompleteTextField<?> lastname;

    @FXML
    private RadioButton mariee;

    @FXML
    private AutoCompleteTextField<?> name;

    @FXML
    private AutoCompleteTextField<?> nameGirl;

    @FXML
    private AutoCompleteTextField<?> newJob;

    @FXML
    private RadioButton noAllergie;

    @FXML
    private RadioButton noAssurance;

    @FXML
    private RadioButton noIntegre;

    @FXML
    private RadioButton noMedical;

    @FXML
    private Text nombreEmployes;

    @FXML
    private Spinner<?> nombreEnfant;

    @FXML
    private AutoCompleteTextField<?> numeroSocial;

    @FXML
    private AutoCompleteTextField<?> oldJob;

    @FXML
    private AutoCompleteTextField<?> otherMedical;

    @FXML
    private AutoCompleteTextField<?> otherSituation;

    @FXML
    private Spinner<?> salaire;

    @FXML
    private MenuButton service;

    @FXML
    private Button submitDmUserCompte;

    @FXML
    private Button submitIntegre;

    @FXML
    private Button submitRdv;

    @FXML
    private TextField tel;

    @FXML
    private Text userName;

    @FXML
    private RadioButton yesAllergie;

    @FXML
    private RadioButton yesAssurance;

    @FXML
    private RadioButton yesIntegre;

    @FXML
    private RadioButton yesMedical;

    @FXML
    void BntMrSelected(ActionEvent event) {

    }

    @FXML
    void BtnMmeSelected(ActionEvent event) {

    }

    @FXML
    void SuiviMedicalNon(ActionEvent event) {

    }

    @FXML
    void SuiviMedicalOui(ActionEvent event) {

    }

}
