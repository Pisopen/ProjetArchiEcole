package Controler;
 
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
 
public class Controler implements Initializable {
 
   @FXML
   private Button addTeacher;
  
   @FXML
   private TextField inputName;
   
   @FXML
   private TextField inputSurname;
   
   @FXML
   private TextArea output;
  
   @Override
   public void initialize(URL location, ResourceBundle resources) { 
       // TODO (don't really need to do anything here).
   }
 
   // When user click on myButton
   // this method will be called.
   public void addTeacher(ActionEvent event) {
	   
        // Show in VIEW
        output.setText(inputName.getText() +" "+ inputSurname.getText());

   }
  
}