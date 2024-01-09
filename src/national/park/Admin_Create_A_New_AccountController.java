/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package national.park;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Admin_Create_A_New_AccountController implements Initializable {

    @FXML
    private ComboBox comboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private DatePicker birthdateTextPicker;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField userIDTextField;
    @FXML
    private PasswordField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
     public void initialize(URL url, ResourceBundle rb) {
         comboBox.getItems().addAll("Admin","Caretaker","CCF","Veterinarian","Visitor");
    }    

    @FXML
    private void backBtnOnClick(ActionEvent event)  throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("AdminHomePage.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void saveBtnOnClick(ActionEvent event) throws IOException {
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin_Create_Account_Confirmation.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    
}
