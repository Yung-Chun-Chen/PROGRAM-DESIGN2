package application;
	
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	
	
	public void start(Stage primaryStage) throws Exception {
		
			
			Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scenTextField tf=scene.getadd(getClass().getResource("Calculator.fxml").toExternalForm());
		
		   	
		   /*scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				public void handle(KeyEvent event) {
					if(event.getCode()==KeyCode.A) {
						System.out.println(event.getCode());
						
					}
				}
			});
		    */
			
			
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
