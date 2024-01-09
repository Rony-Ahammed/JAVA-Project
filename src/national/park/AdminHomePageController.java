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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AdminHomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
 @FXML
    private void backBtnOnClick(ActionEvent event)  throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void CreateANewAccountBtnOnClick(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin_Create_A_New_Account.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void UpdatingAboutTheParkInFormationBtnOnClick(ActionEvent event)  throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin_Update_Park_Information.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void UpdateTheTicketInFormationBtnOnClick(ActionEvent event)  throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin_Update_Ticket_Information.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void CheckAndSendPaymentStatusOfVisitorsBtnOnClick(ActionEvent event)  throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin_Check_And_Send_Confirmation_Message_of_Payment.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void UpdateAndCreateTheAnimalInformationBtnOnClick(ActionEvent event)  throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin_Update_And_Create_The_Animal_Information.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    
}