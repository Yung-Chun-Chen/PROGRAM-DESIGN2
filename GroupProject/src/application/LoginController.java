package application;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

   @FXML
   private Button btnLogin;
   
   @FXML
   private Button btnCancel;

   @FXML
   private TextField  myTextField;
   
   @FXML
   private PasswordField  myTextField2;
   
   @FXML
   private Label  message;

   @Override
   public void initialize(URL location, ResourceBundle resources) {

       // TODO (don't really need to do anything here).

   }

   // When user click on myButton
   // this method will be called.
   
   public void cancelBtn(ActionEvent event) {
       myTextField.setText("");
       myTextField2.setText("");
       message.setText("");
   }
   public void loginBtn(ActionEvent event) throws Exception {
	   	   
	 Controller ctrlr = new Controller();
	   		
     String acnt = "";
     String pswd = "";
     acnt = (String)myTextField.getText();
     pswd = (String)myTextField2.getText();
     if(acnt.equals("test")&&pswd.equals("111")) {
    	 ctrlr.switchToSceneFront(event);
     }else if(acnt.equals("test2")&&pswd.equals("222")){
    	 ctrlr.switchToSceneBack(event);
     }else {
    	 System.out.println("fail");
    	 message.setText("±b¸¹±K½X¿ù»~");
     }
   }
 
}