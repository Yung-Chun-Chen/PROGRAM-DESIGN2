package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner ;

public class BackOrder extends Application {
	
    private static Stage historyStage = null ;
   // ArrayList<String> reservation_history = new ArrayList<String>();
    @Override
    public void start(Stage historyStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        
        Scene scene=new Scene(root);
        scene.getStylesheets().add(getClass().getResource("applicationBackOrder.css").toExternalForm());
       
        historyStage.setTitle("Reservation History");
        //historyStage.setScene(new Scene(root));
        historyStage.setScene(scene);
        historyStage.show();
        historyStage.setAlwaysOnTop(true);
        historyStage.setResizable(false);
        getHistoryStage();
    }
    
    public static Stage getHistoryStage() {
    	
        return historyStage; }
    
    public static void main(String[] args) {
    	
    	try {
            Scanner scanner = new Scanner(new FileInputStream("d:\\order.txt"));
            while (scanner.hasNextLine()){
                if (scanner.hasNext()==false){break;}
                else{
                	
                    String order = scanner.nextLine();
                    //System.out.println(order);
                    ArrayList<String> reservation_history = new ArrayList<String>();
                    reservation_history.add(order);
                    //System.out.println(reservation_history);
                    //reservation_history.add(order);
                } }
            
        }catch (Exception e){e.printStackTrace();}
        launch(args);}
    
    public void  showWindow() throws Exception {
    	System.out.println("backorder");
		start(this.historyStage);
	}

   
}
