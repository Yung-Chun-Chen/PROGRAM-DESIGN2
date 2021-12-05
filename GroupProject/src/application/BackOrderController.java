package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BackOrderController {
	private static OrderInterface orderInterface;
    @FXML
    private ListView oder;
    @FXML
    private TextField total;
    @FXML
    private TextField tf;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;
    @FXML
    private TextField tf8;
    @FXML
    private TextField tf9;
    public ArrayList<String> reservation_history = new ArrayList<>() ;

    @FXML
    
    int i=0;
	private Stage stage;
	private Scene scene;
    
    public void onMouseClick(MouseEvent mouseEvent){
    	
    	 
    	try {
            Scanner scanner = new Scanner(new FileInputStream("d:\\order.txt"));
            
           String order,order2,order3,order4,order5,order6,order7,order8,order9;
           
            while (scanner.hasNextLine()){
                if (scanner.hasNext()==false){break;}
                else{
                	if(i==14) {
                		for(int j=0;j<15;j++) {
                			 if (scanner.hasNext()==false){
     	                    	total.setText("已經沒有訂單");
         	                    tf.setText("");
         	                    tf2.setText("");
         	                    tf3.setText("");
         	                    tf4.setText("");
         	                    tf5.setText("");
         	                    tf6.setText("");
         	                    tf7.setText("");
         	                    tf8.setText("");
         	                    tf9.setText("");
     	                    	break;
     	                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    //order9 = scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第十五筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==13) {
                		for(int j=0;j<14;j++) {
                			 if (scanner.hasNext()==false){
     	                    	total.setText("已經沒有訂單");
         	                    tf.setText("");
         	                    tf2.setText("");
         	                    tf3.setText("");
         	                    tf4.setText("");
         	                    tf5.setText("");
         	                    tf6.setText("");
         	                    tf7.setText("");
         	                    tf8.setText("");
         	                    tf9.setText("");
     	                    	break;
     	                    }

                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    order9 = scanner.nextLine();
    	                       	                  //  order9 = scanner.nextLine();
    	                    total.setText("第十四筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==12) {
                		for(int j=0;j<13;j++) {
                			 if (scanner.hasNext()==false){
     	                    	total.setText("已經沒有訂單");
         	                    tf.setText("");
         	                    tf2.setText("");
         	                    tf3.setText("");
         	                    tf4.setText("");
         	                    tf5.setText("");
         	                    tf6.setText("");
         	                    tf7.setText("");
         	                    tf8.setText("");
         	                    tf9.setText("");
     	                    	break;
     	                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    //order9 = scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第十三筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==11) {
                		for(int j=0;j<12;j++) {
                			 if (scanner.hasNext()==false){
     	                    	total.setText("已經沒有訂單");
         	                    tf.setText("");
         	                    tf2.setText("");
         	                    tf3.setText("");
         	                    tf4.setText("");
         	                    tf5.setText("");
         	                    tf6.setText("");
         	                    tf7.setText("");
         	                    tf8.setText("");
         	                    tf9.setText("");
     	                    	break;
     	                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                   // order9 = scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第十二筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==10) {
                		//if (scanner.hasNext()==false){break;}
                		for(int j=0;j<11;j++) {
                			  if (scanner.hasNext()==false){
      	                    	total.setText("已經沒有訂單");
          	                    tf.setText("");
          	                    tf2.setText("");
          	                    tf3.setText("");
          	                    tf4.setText("");
          	                    tf5.setText("");
          	                    tf6.setText("");
          	                    tf7.setText("");
          	                    tf8.setText("");
          	                    tf9.setText("");
      	                    	break;
      	                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                   // order9 = scanner.nextLine();
    	                  
    	                    order9 = scanner.nextLine();
    	                    total.setText("第十一筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==9) {
                		for(int j=0;j<10;j++) {
                			if (scanner.hasNext()==false){
		                    	total.setText("已經沒有訂單");
	    	                    tf.setText("");
	    	                    tf2.setText("");
	    	                    tf3.setText("");
	    	                    tf4.setText("");
	    	                    tf5.setText("");
	    	                    tf6.setText("");
	    	                    tf7.setText("");
	    	                    tf8.setText("");
	    	                    tf9.setText("");
		                    	break;
		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    //order9 = scanner.nextLine();
    	                    
    	                    order9 = scanner.nextLine();
    	                    total.setText("第十筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==8) {
                		for(int j=0;j<9;j++) {
                			if (scanner.hasNext()==false){
		                    	total.setText("已經沒有訂單");
	    	                    tf.setText("");
	    	                    tf2.setText("");
	    	                    tf3.setText("");
	    	                    tf4.setText("");
	    	                    tf5.setText("");
	    	                    tf6.setText("");
	    	                    tf7.setText("");
	    	                    tf8.setText("");
	    	                    tf9.setText("");
		                    	break;
		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                   // order9 = scanner.nextLine();
    	                    
    	                    order9 = scanner.nextLine();
    	                    total.setText("第九筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==7) {
                		for(int j=0;j<8;j++) {
                			 if (scanner.hasNext()==false){
 		                    	total.setText("已經沒有訂單");
 	    	                    tf.setText("");
 	    	                    tf2.setText("");
 	    	                    tf3.setText("");
 	    	                    tf4.setText("");
 	    	                    tf5.setText("");
 	    	                    tf6.setText("");
 	    	                    tf7.setText("");
 	    	                    tf8.setText("");
 	    	                    tf9.setText("");
 		                    	break;
 		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    //order9 = scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第八筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==6) {
                		for(int j=0;j<7;j++) {
                			 if (scanner.hasNext()==false){
 		                    	total.setText("已經沒有訂單");
 	    	                    tf.setText("");
 	    	                    tf2.setText("");
 	    	                    tf3.setText("");
 	    	                    tf4.setText("");
 	    	                    tf5.setText("");
 	    	                    tf6.setText("");
 	    	                    tf7.setText("");
 	    	                    tf8.setText("");
 	    	                    tf9.setText("");
 		                    	break;
 		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    //order9 = scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第七筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==5) {
                		for(int j=0;j<6;j++) {
                			 if (scanner.hasNext()==false){
 		                    	total.setText("已經沒有訂單");
 	    	                    tf.setText("");
 	    	                    tf2.setText("");
 	    	                    tf3.setText("");
 	    	                    tf4.setText("");
 	    	                    tf5.setText("");
 	    	                    tf6.setText("");
 	    	                    tf7.setText("");
 	    	                    tf8.setText("");
 	    	                    tf9.setText("");
 		                    	break;
 		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                   // order9 = scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第六筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==4) {
                		for(int j=0;j<5;j++) {

    	                    if (scanner.hasNext()==false){
		                    	total.setText("已經沒有訂單");
	    	                    tf.setText("");
	    	                    tf2.setText("");
	    	                    tf3.setText("");
	    	                    tf4.setText("");
	    	                    tf5.setText("");
	    	                    tf6.setText("");
	    	                    tf7.setText("");
	    	                    tf8.setText("");
	    	                    tf9.setText("");
		                    	break;
		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第五筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==3) {
                		for(int j=0;j<4;j++) {
                			 if (scanner.hasNext()==false){
 		                    	total.setText("已經沒有訂單");
 	    	                    tf.setText("");
 	    	                    tf2.setText("");
 	    	                    tf3.setText("");
 	    	                    tf4.setText("");
 	    	                    tf5.setText("");
 	    	                    tf6.setText("");
 	    	                    tf7.setText("");
 	    	                    tf8.setText("");
 	    	                    tf9.setText("");
 		                    	break;
 		                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                    
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第四筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
                	if(i==2) {
                		for(int j=0;j<3;j++) {
                			 
    	                    if (scanner.hasNext()==false){
    	                    	total.setText("已經沒有訂單");
        	                    tf.setText("");
        	                    tf2.setText("");
        	                    tf3.setText("");
        	                    tf4.setText("");
        	                    tf5.setText("");
        	                    tf6.setText("");
        	                    tf7.setText("");
        	                    tf8.setText("");
        	                    tf9.setText("");
    	                    	break;
    	                    }
                			order = scanner.nextLine();
    	                    order2=scanner.nextLine();
    	                    order3 = scanner.nextLine();
    	                    order4=scanner.nextLine();
    	                    order5 = scanner.nextLine();
    	                    order6=scanner.nextLine();
    	                    order7 = scanner.nextLine();
    	                    order8=scanner.nextLine();
    	                   
    	                    order9 = scanner.nextLine();
    	                    total.setText("第三筆訂單");
    	                    tf.setText(order);
    	                    tf2.setText(order2);
    	                    tf3.setText(order3);
    	                    tf4.setText(order4);
    	                    tf5.setText(order5);
    	                    tf6.setText(order6);
    	                    tf7.setText(order7);
    	                    tf8.setText(order8);
    	                    tf9.setText(order9);
                		}
                		
                	}
	                if(i==1) {
	                	for(int j=0;j<2;j++) {
	                		if (scanner.hasNext()==false){
		                    	total.setText("已經沒有訂單");
	    	                    tf.setText("");
	    	                    tf2.setText("");
	    	                    tf3.setText("");
	    	                    tf4.setText("");
	    	                    tf5.setText("");
	    	                    tf6.setText("");
	    	                    tf7.setText("");
	    	                    tf8.setText("");
	    	                    tf9.setText("");
		                    	break;
		                    }
	                		order = scanner.nextLine();
		                    order2=scanner.nextLine();
		                    order3 = scanner.nextLine();
		                    order4=scanner.nextLine();
		                    order5 = scanner.nextLine();
		                    order6=scanner.nextLine();
		                    order7 = scanner.nextLine();
		                    order8=scanner.nextLine();
		                   
		                    order9 = scanner.nextLine();
		                    total.setText("第二筆訂單");
		                    tf.setText(order);
		                    tf2.setText(order2);
		                    tf3.setText(order3);
		                    tf4.setText(order4);
		                    tf5.setText(order5);
		                    tf6.setText(order6);
		                    tf7.setText(order7);
		                    tf8.setText(order8);
		                    tf9.setText(order9);
	                	}
	                	
	                    
	                }
	                if(i==0) {
	                	order = scanner.nextLine();
	                    order2=scanner.nextLine();
	                    order3 = scanner.nextLine();
	                    order4=scanner.nextLine();
	                    order5 = scanner.nextLine();
	                    order6=scanner.nextLine();
	                    order7 = scanner.nextLine();
	                    order8=scanner.nextLine();
	                    order9 = scanner.nextLine();
	                    total.setText("第一筆訂單");
	                    tf.setText(order);
	                    tf2.setText(order2);
	                    tf3.setText(order3);
	                    tf4.setText(order4);
	                    tf5.setText(order5);
	                    tf6.setText(order6);
	                    tf7.setText(order7);
	                    tf8.setText(order8);
	                    tf9.setText(order9); 
	                    
	                }
	                i++;
	                break;  
                } 
            }
            
        }catch (Exception e){e.printStackTrace();}
        
    }
    
    public ArrayList<String> getTotalOrder()
    {
 	   return reservation_history;
    }
    
    
    public void addHistory (String oder){
        this.reservation_history.add(oder); }
    @FXML
    public void completeDelete(){
    	total.setText("");
    	tf.setText("");
    	tf2.setText("");
    	tf3.setText("");
    	tf4.setText("");
    	tf5.setText("");
    	tf6.setText("");
    	tf7.setText("");
    	tf8.setText("");
    	tf9.setText("");
        //oder.getItems().removeAll(oder.getSelectionModel().getSelectedItem());
    }
    
    public void switchToSceneBack(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Back.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    
}
