package application;
import application.Operation;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.math.*;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable {
	Float data=0f;
	int operation=-1;
	@FXML
    private Button div;

    @FXML
    private Button ce;

    @FXML
    private Button backspace;

    @FXML
    private Button five;

    @FXML
    private Button one;

    @FXML
    private Button four;

    @FXML
    private Button mul;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button ac;

    @FXML
    private Button eq;
    
    @FXML
    private TextField secret;
    
    @FXML
    private Button dot;

    @FXML
    private Button zero;

    @FXML
    private Button add;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button sub;

    @FXML
    private Button six;

    @FXML
    private TextField display;
    @FXML
    private TextField display2;
	//private Node scene;
	@FXML
    void handleButtonAction(ActionEvent event) {
    	
		
    	if(event.getSource()==one) {
    		
    		//display.setText(display.getText()+"1");
    		display2.setText(display2.getText()+"1");
    	}
    	else if(event.getSource()==two) {
    		//display.setText(display.getText()+"2");
    		display2.setText(display2.getText()+"2");
    	}
    	else if(event.getSource()==three) {
    		//display.setText(display.getText()+"3");
    		display2.setText(display2.getText()+"3");
    	}
    	else if(event.getSource()==four) {
    		//display.setText(display.getText()+"4");
    		display2.setText(display2.getText()+"4");
    	}
    	else if(event.getSource()==five) {
    		//display.setText(display.getText()+"5");
    		display2.setText(display2.getText()+"5");
    	}
    	else if(event.getSource()==six) {
    		//display.setText(display.getText()+"6");
    		display2.setText(display2.getText()+"6");
    	}
    	else if(event.getSource()==seven) {
    		//display.setText(display.getText()+"7");
    		display2.setText(display2.getText()+"7");
    	}
    	else if(event.getSource()==eight) {
    		//display.setText(display.getText()+"8");
    		display2.setText(display2.getText()+"8");
    	}
    	else if(event.getSource()==nine) {
    		//display.setText(display.getText()+"9");
    		display2.setText(display2.getText()+"9");
    	}
    	else if(event.getSource()==zero) {
    		//display.setText(display.getText()+"0");
    		display2.setText(display2.getText()+"0");
    	}
    	
    	
    	
    	else if(event.getSource()==dot) {
    		//display.setText(display.getText()+".");
    		display2.setText(display2.getText()+".");
    	}
    	
    	
    	
    	else if(event.getSource()==ac) {
    		display.setText("");
    		display2.setText("");
    	}
    	else if(event.getSource()==ce) {
    		if(display2.getText().lastIndexOf("+")!=display2.getText().length()-1&&display2.getText().lastIndexOf("-")!=display2.getText().length()-1&&
    	    		   display2.getText().lastIndexOf("*")!=display2.getText().length()-1&&display2.getText().lastIndexOf("/")!=display2.getText().length()-1)
    	    		   if(display2.getText().lastIndexOf("+")>display2.getText().lastIndexOf("-")&&display2.getText().lastIndexOf("+")>display2.getText().lastIndexOf("*")&&
    	    				   display2.getText().lastIndexOf("+")>display2.getText().lastIndexOf("/"))
    	    			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("+")+1));
    	    		if(display2.getText().lastIndexOf("-")>display2.getText().lastIndexOf("+")&&display2.getText().lastIndexOf("-")>display2.getText().lastIndexOf("*")&&
    	 				   display2.getText().lastIndexOf("-")>display2.getText().lastIndexOf("/"))
    	 			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("-")+1));
    	    		if(display2.getText().lastIndexOf("*")>display2.getText().lastIndexOf("-")&&display2.getText().lastIndexOf("*")>display2.getText().lastIndexOf("+")&&
    	 				   display2.getText().lastIndexOf("*")>display2.getText().lastIndexOf("/"))
    	 			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("*")+1));
    	    		if(display2.getText().lastIndexOf("/")>display2.getText().lastIndexOf("-")&&display2.getText().lastIndexOf("/")>display2.getText().lastIndexOf("*")&&
    	 				   display2.getText().lastIndexOf("/")>display2.getText().lastIndexOf("+"))
    	 			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("/")+1));
    	}
    	else if(event.getSource()==backspace) {
    		
    		
    		display2.setText(display2.getText(0, display2.getText().length()-1));
    		display.setText(display.getText(0, display.getText().length()-1));
    	}
    	else if(event.getSource()==add) {
    		//data=Float.parseFloat(display.getText());
    		operation=1;
    		display.setText("");
    		display2.setText(display2.getText()+"+");
    	}
    	else if(event.getSource()==sub) {
    		
    			//data=Float.parseFloat(display.getText());
        		operation=2;
        		display.setText("");
        		display2.setText(display2.getText()+"-");
    			//display.setText(display.getText()+"-");
        		//display2.setText(display2.getText()+"-");
    	}
    	else if(event.getSource()==mul) {
    		//data=Float.parseFloat(display.getText());
    		operation=3;
    		display.setText("");
    		display2.setText(display2.getText()+"*");
    	}
    	else if(event.getSource()==div) {
    		//data=Float.parseFloat(display.getText());
    		operation=4;
    		display.setText("");
    		display2.setText(display2.getText()+"/");
    	}
    	
    	//Integer secondOperand=Integer.parseInt(display.getText());
    	else if(event.getSource()==eq) {
    		//display2.setText(display.getText());
    		//Float ans=0f;
    		//display.setText(display.getText(display.getText().length()-1,display.getText().length() ));
    		Float secondOperand=Float.parseFloat(display2.getText(display2.getText().length()-1,display2.getText().length() ));
    		//int b=(int)secondOperand;
    		if(operation==4) {
    			//System.out.printf("%d",secondOperand);
    			
    			if(secondOperand==0) {
    				display.setText("Error");
    				//display2.setText("");
    			}
    			else {
    				String ans=Operation.compute(display2.getText());
    	    		float a=Float.parseFloat(ans);
    	    		DecimalFormat   fnum   =   new   DecimalFormat("##0.0");
    	    		String   dd=fnum.format(a);      
    	    		//a=Math.round(a*100)/100;
    	    		display.setText(dd);
    	    		//display2.setText("dd");
    			}
    			//
    			/*else {
    				String ans=Operation.compute(display2.getText());
    	    		float a=Float.parseFloat(ans);
    	    		display.setText(String.valueOf(ans)); 
    			}*/
    		}
    		else
    		{String ans=Operation.compute(display2.getText());
    		float a=Float.parseFloat(ans);
    		DecimalFormat   fnum   =   new   DecimalFormat("##0.0");
    		String   dd=fnum.format(a);      
    		//a=Math.round(a*100)/100;
    		display.setText(dd);
    		//display.setText(String.valueOf(ans));
    		//display2.setText("dd");
    		}	
    		//display.setText(.pop());
   
    	}}/*
    	    /*else if(event.getSource()==eq) {
    	    
    		Float secondOperand=Float.parseFloat(display.getText());
    		switch(operation) {
    		case 1:
    			Float ans=data+secondOperand;
    			
    			display.setText(String.valueOf(ans));break;
    		case 2:
    			
    			ans=data-secondOperand;
    			display.setText(String.valueOf(ans));break;
    		case 3:
    			
    			ans=data*secondOperand;
    			display.setText(String.valueOf(ans));break;
    		case 4:
    			ans=0f;
    			try {
    			ans=data/secondOperand;
    		}catch(Exception e) {display.setText("Error");}
    			display.setText(String.valueOf(ans));break;}
    		//display2.setText("");
    		}*/
    public void shownum(KeyEvent event) {
    	if(event.getCode()==KeyCode.NUMPAD1) {
    		
    		//display.setText(display.getText()+"1");
    		display2.setText(display2.getText()+"1");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD2) {
    		//display.setText(display.getText()+"2");
    		display2.setText(display2.getText()+"2");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD3) {
    		//display.setText(display.getText()+"3");
    		display2.setText(display2.getText()+"3");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD4) {
    		//display.setText(display.getText()+"4");
    		display2.setText(display2.getText()+"4");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD5) {
    		//display.setText(display.getText()+"5");
    		display2.setText(display2.getText()+"5");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD6) {
    		//display.setText(display.getText()+"6");
    		display2.setText(display2.getText()+"6");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD7) {
    		//display.setText(display.getText()+"7");
    		display2.setText(display2.getText()+"7");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD8) {
    		//display.setText(display.getText()+"8");
    		display2.setText(display2.getText()+"8");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD9) {
    		//display.setText(display.getText()+"9");
    		display2.setText(display2.getText()+"9");
    	}
    	else if(event.getCode()==KeyCode.NUMPAD0) {
    		//display.setText(display.getText()+"0");
    		display2.setText(display2.getText()+"0");
    	}
    	else if(event.getCode()==KeyCode.DECIMAL) {
    		//display.setText(display.getText()+".");
    		display2.setText(display2.getText()+".");
    	}
    	else if(event.getCode()==KeyCode.BACK_SPACE) {
    		
    		
    		display2.setText(display2.getText(0, display2.getText().length()-1));
    		display.setText(display.getText(0, display.getText().length()-1));
    	}
    	else if(event.getCode()==KeyCode.ADD) {
    		//data=Float.parseFloat(display.getText());
    		operation=1;
    		display.setText("");
    		display2.setText(display2.getText()+"+");
    	}
    	else if(event.getCode()==KeyCode.SUBTRACT) {
        		operation=2;
        		display.setText("");
        		display2.setText(display2.getText()+"-"); 			
    	}
    	else if(event.getCode()==KeyCode.MULTIPLY) {
    		//data=Float.parseFloat(display.getText());
    		operation=3;
    		display.setText("");
    		display2.setText(display2.getText()+"*");
    	}
    	else if(event.getCode()==KeyCode.DIVIDE) {
    		//data=Float.parseFloat(display.getText());
    		operation=4;
    		display.setText("");
    		display2.setText(display2.getText()+"/");
    	}
    		if(event.getCode()==KeyCode.A)
    		{
    		
    		display.setText("");
    		display2.setText("");
    		
    		}
    	if(event.getCode()==KeyCode.C) {
    		
    		if(display2.getText().lastIndexOf("+")!=display2.getText().length()-1&&display2.getText().lastIndexOf("-")!=display2.getText().length()-1&&
    		   display2.getText().lastIndexOf("*")!=display2.getText().length()-1&&display2.getText().lastIndexOf("/")!=display2.getText().length()-1)
    		   if(display2.getText().lastIndexOf("+")>display2.getText().lastIndexOf("-")&&display2.getText().lastIndexOf("+")>display2.getText().lastIndexOf("*")&&
    				   display2.getText().lastIndexOf("+")>display2.getText().lastIndexOf("/"))
    			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("+")+1));
    		if(display2.getText().lastIndexOf("-")>display2.getText().lastIndexOf("+")&&display2.getText().lastIndexOf("-")>display2.getText().lastIndexOf("*")&&
 				   display2.getText().lastIndexOf("-")>display2.getText().lastIndexOf("/"))
 			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("-")+1));
    		if(display2.getText().lastIndexOf("*")>display2.getText().lastIndexOf("-")&&display2.getText().lastIndexOf("*")>display2.getText().lastIndexOf("+")&&
 				   display2.getText().lastIndexOf("*")>display2.getText().lastIndexOf("/"))
 			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("*")+1));
    		if(display2.getText().lastIndexOf("/")>display2.getText().lastIndexOf("-")&&display2.getText().lastIndexOf("/")>display2.getText().lastIndexOf("*")&&
 				   display2.getText().lastIndexOf("/")>display2.getText().lastIndexOf("+"))
 			   display2.setText(display2.getText(0,display2.getText().lastIndexOf("/")+1));
    		//event.consume();
    	}
    	//operation=4;
    	if(event.getCode().equals(KeyCode.ENTER)) {
    		
    		
    		if(display2.getText(display2.getText().length()-2,display2.getText().length()-1).equals("/")) {
    			
    			Float secondoperand=Float.parseFloat(display2.getText(display2.getText().lastIndexOf("/")+1,display2.getText().length() ));
    			if(secondoperand==0) {
    				display.setText("Error");
    			}
    			else {
    				String ans=Operation.compute(display2.getText());
    	    		float a=Float.parseFloat(ans);
    	    		DecimalFormat   fnum   =   new   DecimalFormat("##0.0");
    	    		String   dd=fnum.format(a);      
    	    		//a=Math.round(a*100)/100;
    	    		display.setText(dd);
    	    		//display2.setText("dd");
    			}    			
    		}
    		
    		else
    		{
    			String ans=Operation.compute(display2.getText());
    			float a=Float.parseFloat(ans);
    			DecimalFormat   fnum   =   new   DecimalFormat("##0.0");
    			String   dd=fnum.format(a);      
    		//a=Math.round(a*100)/100;
    			display.setText(dd);
    		
    		}
    	}
    	}

	
	public void initialize(URL url,ResourceBundle rb) {
		
	}
}
