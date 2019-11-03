package Controler;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class MyApplication  extends Application {
	
//	BorderPane layout;
	
    
  
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	
    	
    	//Menu
//    	Menu teacherMenu = new Menu("Enseignant");
    	
    	//Menu items
    	
//    	teacherMenu.getItems().add(new MenuItem("Créer Enseignant"));
//    	teacherMenu.getItems().add(new MenuItem("Supprimer Enseignant"));
//    	teacherMenu.getItems().add(new MenuItem("Affecter Enseignant"));
//    	
//    	//Main menu bar
//    	MenuBar menuBar = new MenuBar();
//    	menuBar.getMenus().add(teacherMenu);
//    	
//    	layout = new BorderPane();
//    	layout.setTop(menuBar);
    	
        // Read file fxml and draw interface.    	
        Parent root = FXMLLoader.load(getClass()
                .getResource("/View/TeacherIHM.fxml"));
 
        primaryStage.setTitle("My Application");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
    
