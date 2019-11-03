package Controler;
 
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
public class ControlerMenu implements Initializable {
 
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
   public void switchaddTeacherScene(ActionEvent event) throws IOException {
	   Parent deleteTeacherParent = FXMLLoader.load(getClass().getResource("/View/TeacherIHM.fxml"));
	   Scene deleteViewScene = new Scene(deleteTeacherParent);
	   
	   Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	   
	   window.setScene(deleteViewScene);
	   window.show();
   }
  
}