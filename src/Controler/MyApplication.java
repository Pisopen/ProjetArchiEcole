package Controler;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class MyApplication  extends Application {
	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
        // Read file fxml and draw interface.    	
        Parent root = FXMLLoader.load(getClass()
                .getResource("/View/MenuIHM.fxml"));
 
        primaryStage.setTitle("My Application");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
    
