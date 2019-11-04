package Controler;
 
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Menu implements Initializable {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { 
		// TODO (don't really need to do anything here).
	}

	// When user click on myButton
	// this method will be called.
	public void switchaddTeacherScene(ActionEvent event) throws IOException {	
		String filePath = "/View/TeacherIHM.fxml";		
		switchScene(event, filePath);
	}
	
	public void switchCreateUeScene(ActionEvent event) throws IOException {
		String filePath ="/View/CreateUeIHM.fxml";
		switchScene(event, filePath);
	}
	
	public void switchDeleteTeacherScene(ActionEvent event) throws IOException {
		String filePath ="/View/DeleteTeacher.fxml";
		switchScene(event, filePath);
	}
	
	public void switchDeleteAEScene(ActionEvent event) throws IOException {
		String filePath ="/View/DeleteAE.fxml";
		switchScene(event, filePath);
	}
	
	public void switchDeleteUEScene(ActionEvent event) throws IOException {
		String filePath ="/View/DeleteUE.fxml";
		switchScene(event, filePath);
	}
	
	
	public void switchScene(ActionEvent event, String filePath) throws IOException {		
		Parent addTeacherParent = FXMLLoader.load(getClass().getResource(filePath));
		Scene addViewScene = new Scene(addTeacherParent);

		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

		window.setScene(addViewScene);
		window.show();
	}  
}