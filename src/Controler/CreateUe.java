package Controler;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreateUe {
	
	@FXML
	private Button backToMenu;
	
	public void backToMenu(ActionEvent event) throws IOException {
		Parent menuTeacherParent = FXMLLoader.load(getClass().getResource("/View/MenuIHM.fxml"));
		Scene menuViewScene = new Scene(menuTeacherParent);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(menuViewScene);
		window.show();
	}
}
