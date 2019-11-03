package Controler;
 
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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
public class AddTeacher implements Initializable {
 
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
   
   
   public void backToMenu(ActionEvent event) throws IOException {
	   Parent menuTeacherParent = FXMLLoader.load(getClass().getResource("/View/MenuIHM.fxml"));
	   Scene menuViewScene = new Scene(menuTeacherParent);
	   
	   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	   
	   window.setScene(menuViewScene);
	   window.show();
   }
   
   // When user click on myButton
   // this method will be called.
   public void addTeacher(ActionEvent event) {
	   
        // Show in VIEW
        output.setText(inputName.getText() +" "+ inputSurname.getText());

   }
  
}