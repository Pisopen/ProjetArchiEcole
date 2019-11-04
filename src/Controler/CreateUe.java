package Controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.UniteEnseignement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateUe implements Initializable{
	
	@FXML
	private Button backToMenu;
	
	@FXML
	private Button addUe;
	
	@FXML
	private TextField inputId;
	
	@FXML
	private TextField inputName;
	
	@FXML
	private TextField inputCode;
	
	@FXML
	private TextField inputCours;
	
	@FXML
	private TextField inputTd;

	@FXML
	private TextField inputTp;
	
	@FXML
	private TextField inputValue;
	
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
	
	public void addUe(ActionEvent event) {
		UniteEnseignement unite = new UniteEnseignement(inputId.getText(), inputCode.getText(), inputName.getText(), 
				Float.valueOf(inputCours.getText()), Float.valueOf(inputTd.getText()), Float.valueOf(inputTp.getText()), Float.valueOf(inputValue.getText()));
		System.out.println(unite.getId()+" "+unite.getCode()+" "+unite.getIntitule());
	}
}
