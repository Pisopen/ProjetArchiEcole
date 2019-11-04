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

public class Delete implements Initializable {
	
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
}
