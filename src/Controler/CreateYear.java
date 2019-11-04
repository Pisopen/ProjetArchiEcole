package Controler;

import java.io.IOException;

import Model.Annee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateYear {
	
	@FXML
	private TextField inputId;

	@FXML
	private TextField inputYear;
	
	public void backToMenu(ActionEvent event) throws IOException {
		Parent menuTeacherParent = FXMLLoader.load(getClass().getResource("/View/MenuIHM.fxml"));
		Scene menuViewScene = new Scene(menuTeacherParent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		   
		window.setScene(menuViewScene);
		window.show();
	}
	
	public void addYear(ActionEvent event) {
		Annee annee = new Annee(inputId.getText(), inputYear.getText());
		System.out.println(annee.getId()+" "+annee.getAnnee());
	}
}
