package Controler;
 
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Model.Personne;
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
	
	public Utils utils = new Utils();
 
   @FXML
   private Button addTeacher;
  
   @FXML
   private TextField inputName;
   
   @FXML
   private TextField inputSurname;
   
   @FXML
   private TextField inputId;
   
   @FXML
   private TextField inputMail;

  
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
   
//    When user click on myButton
//    this method will be called.
   public void addTeacher(ActionEvent event) {	   
	   
//         Show in VIEW
	   Personne personne = new Personne(inputId.getText(), inputName.getText(), inputSurname.getText(),inputMail.getText(), null);
	   jaxbObjectToXMLTeacher(personne);
	   
        
	   System.out.println(personne.getId()+" "+personne.getMail()+" "+personne.getPrenom()+" "+personne.getNom()+" "+personne.getStatut());
   }
   
   public void jaxbObjectToXMLTeacher(Personne personne) {
		try
       {
           //Create JAXB Context
           JAXBContext jaxbContext = JAXBContext.newInstance(Personne.class);
            
           //Create Marshaller
           Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

           //Required formatting??
           jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

          //Store XML to File
           File file = new File("/File/Teacher.xml");
            
           //Writes XML file to file-system
           jaxbMarshaller.marshal(personne, file); 
       } 
       catch (JAXBException e) 
       {
           e.printStackTrace();
       }
	}
  
}