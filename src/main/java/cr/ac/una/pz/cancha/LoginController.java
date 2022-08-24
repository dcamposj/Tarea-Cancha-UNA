/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cr.ac.una.pz.cancha;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author BiblioPZ UNA
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsuarioLogin;
    @FXML
    private TextField txtContraLogin;
    @FXML
    private Button btnLogin;
    @FXML
    private Hyperlink hypRegistro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionLogin() throws IOException{
        App.setRoot("menuprincipal");
    }

    @FXML
    private void onActionRegistrar() throws IOException {
        App.setRoot("registro");
    }
    
}
