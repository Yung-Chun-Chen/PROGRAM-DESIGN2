package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller {
	
	
	@FXML 
    TextField text1;
	@FXML 
    TextField text2;
	@FXML 
    TextField text3;
	@FXML 
    TextField text4;
	@FXML 
    TextField text5;
	@FXML 
    TextField text6;
	@FXML 
    TextField text7;
	@FXML 
    TextField text8;
	@FXML 
    TextField text9;
		
	@FXML
    Label order1 = new Label();
	@FXML
    Label order2 = new Label();
	@FXML
    Label order3 = new Label();
	@FXML
    Label order4 = new Label();
	@FXML
    Label order5 = new Label();
	@FXML
    Label order6 = new Label();
	@FXML
    Label order7 = new Label();
	@FXML
    Label order8 = new Label();
	@FXML
	Label order9 = new Label();

	
	@FXML
    TextField orderQ1 = new TextField();
	@FXML
	TextField orderQ2 = new TextField();
	@FXML
	TextField orderQ3 = new TextField();
	@FXML
	TextField orderQ4 = new TextField();
	@FXML
	TextField orderQ5 = new TextField();
	@FXML
	TextField orderQ6 = new TextField();
	@FXML
	TextField orderQ7 = new TextField();
	@FXML
	TextField orderQ8 = new TextField();
	@FXML
	TextField orderQ9 = new TextField();
	
	@FXML
	TextField totalPrice = new TextField();
	
	@FXML
    Label good1 = new Label();
	@FXML
    Label good2 = new Label();
	@FXML
    Label good3 = new Label();
	@FXML
    Label good4 = new Label();
	@FXML
    Label good5 = new Label();
	@FXML
    Label good6 = new Label();
	@FXML
    Label good7 = new Label();
	@FXML
    Label good8 = new Label();
	@FXML
    Label good9 = new Label();
	
	@FXML
	Label orderNumber = new Label();
	
	@FXML
	Button btn = new Button();
	
	@FXML
	Pane pane = new Pane();
	
	int o1 = 0;
	int o2 = 0;
	int o3 = 0;
	int o4 = 0;
	int o5 = 0;
	int o6 = 0;
	int o7 = 0;
	int o8 = 0;
	int o9 = 0;
	
	
    Main main = new Main();
    
	private Stage stage;
	private Scene scene;
	
	
	public static OrderInterface orderInterface = new OrderInterface();
	
	ArrayList<String> pieTartName = orderInterface.getPieTartName();
	ArrayList<String> cakeName = orderInterface.getCakeName();
	ArrayList<String> otherName = orderInterface.getOtherName();
	ArrayList<Integer> pieTartPrice = orderInterface.getPieTartPrice();
	ArrayList<Integer> cakePrice = orderInterface.getCakePrice();
	ArrayList<Integer> otherPrice = orderInterface.getOtherPrice();
	ArrayList<Integer> pieTartNum = orderInterface.getPieTartNum();
	ArrayList<Integer> cakeNum = orderInterface.getCakeNum();
	ArrayList<Integer> otherNum = orderInterface.getOtherNum();
	
	
	//==============================================
	//Scene : Front 
	//Button ActionEvent - minus & add 
	//TextField : set
	//==============================================
	
	
	public void add1(ActionEvent event){
		
		
		if(text1.getText()=="")
			text1.setText("1");
		else {
			int i = Integer.parseInt(text1.getText());
			i++;
			btn.getText();
			text1.setText(""+i);
			}
		o1 = orderAdding(good1,text1,o1);
		}
	
	public void minus1(ActionEvent event){
		
		if(text1.getText()=="")
			text1.setText("0");
		else {
			int i = Integer.parseInt(text1.getText());
			i--;
			text1.setText(""+i);
		}	
		o1 = orderAdding(good1,text1,o1);
	}
	
	
	public void add2(ActionEvent event){
		
		
		if(text2.getText()=="")
			text2.setText("1");
		else {
			int i = Integer.parseInt(text2.getText());
			i++;
			text2.setText(""+i);
			}
		o2 = orderAdding(good2,text2,o2);
		}
	
	public void minus2(ActionEvent event){
		
		if(text2.getText()=="")
			text2.setText("0");
		else {
			int i = Integer.parseInt(text2.getText());
			i--;
			text2.setText(""+i);
		}	
		o2 = orderAdding(good2,text2,o2);
	}
	
		
	public void add3(ActionEvent event){
		
		
		if(text3.getText()=="") {
			text3.setText("1");
		}
		else {
			int i = Integer.parseInt(text3.getText());
			i++;
			text3.setText(""+i);
			}
		o3 = orderAdding(good3,text3,o3);
		}
	
	public void minus3(ActionEvent event){
		
		if(text3.getText()=="")
			text3.setText("0");
		else {
			int i = Integer.parseInt(text3.getText());
			i--;
			text3.setText(""+i);
		}	
		o3 = orderAdding(good3,text3,o3);
		}
	
		

	public void add4(ActionEvent event){
		
		
		if(text4.getText()=="")
			text4.setText("1");
		else {
			int i = Integer.parseInt(text4.getText());
			i++;
			text4.setText(""+i);
			}
		o4 = orderAdding(good4,text4,o4);
		}
	
	public void minus4(ActionEvent event){
		
		if(text4.getText()=="")
			text4.setText("0");
		else {
			int i = Integer.parseInt(text4.getText());
			i--;
			text4.setText(""+i);
		}	
		o4 = orderAdding(good4,text4,o4);
	}
	
		

	public void add5(ActionEvent event){
		
		
		if(text5.getText()=="")
			text5.setText("1");
		else {
			int i = Integer.parseInt(text5.getText());
			i++;
			text5.setText(""+i);
			}
		o5 = orderAdding(good5,text5,o5);
		}
	
	public void minus5(ActionEvent event){
		
		if(text5.getText()=="")
			text5.setText("0");
		else {
			int i = Integer.parseInt(text5.getText());
			i--;
			text5.setText(""+i);
		}	
		o5 = orderAdding(good5,text5,o5);
	}
	
		

	public void add6(ActionEvent event){
		
		
		if(text6.getText()=="")
			text6.setText("1");
		else {
			int i = Integer.parseInt(text6.getText());
			i++;
			text6.setText(""+i);
			}
		o6 = orderAdding(good6,text6,o6);
		}
	
	public void minus6(ActionEvent event){
		
		if(text6.getText()=="")
			text6.setText("0");
		else {
			int i = Integer.parseInt(text6.getText());
			i--;
			text6.setText(""+i);
		}	
		o6 = orderAdding(good6,text6,o6);
	}
	
		

	public void add7(ActionEvent event){
		
		
		if(text7.getText()=="")
			text7.setText("1");
		else {
			int i = Integer.parseInt(text7.getText());
			i++;
			text7.setText(""+i);
			}
		o7 = orderAdding(good7,text7,o7);
		}
	
	public void minus7(ActionEvent event){
		
		if(text7.getText()=="")
			text7.setText("0");
		else {
			int i = Integer.parseInt(text7.getText());
			i--;
			text7.setText(""+i);
		}	
		o7 = orderAdding(good7,text7,o7);
	}
	
		

	public void add8(ActionEvent event){
		
		
		if(text8.getText()=="")
			text8.setText("1");
		else {
			int i = Integer.parseInt(text8.getText());
			i++;
			text8.setText(""+i);
			}
		o8 = orderAdding(good8,text8,o8);
		}
	
	public void minus8(ActionEvent event){
		
		if(text8.getText()=="")
			text8.setText("0");
		else {
			int i = Integer.parseInt(text8.getText());
			i--;
			text8.setText(""+i);
		}	
		o8 = orderAdding(good8,text8,o8);
	}
	
		

	public void add9(ActionEvent event){
		
		
		if(text9.getText()=="")
			text9.setText("1");
		else {
			int i = Integer.parseInt(text9.getText());
			i++;
			text9.setText(""+i);
			}
		o9 = orderAdding(good9,text9,o9);
		}
	
	public void minus9(ActionEvent event){
		
		if(text9.getText()=="")
			text9.setText("0");
		else {
			int i = Integer.parseInt(text9.getText());
			i--;
			text9.setText(""+i);
		}	
		o9 = orderAdding(good9,text9,o9);
	}
	
	
	
	//==========================================================
	//Scene : Front 
	//order Form (linked with add & minus buttons)
	//Label : set
	//TextField : set
	//==========================================================
	
	
	public int orderAdding(Label label, TextField textField, int i){
		
		String name = label.getText();
		String num = textField.getText();
		
		
		if(i == 0) {
			
			if(order1.getText().equalsIgnoreCase("-") && num!="0") {
				order1.setText(name);
				orderQ1.setText(num);
				return 1;
			}
			if(order2.getText().equalsIgnoreCase("-") && num!="0") {
				order2.setText(name);
				orderQ2.setText(num);
				return 2;
			}
			if(order3.getText().equalsIgnoreCase("-") && num!="0") {
				order3.setText(name);
				orderQ3.setText(num);
				return 3;
			}
			if(order4.getText().equalsIgnoreCase("-") && num!="0") {
				order4.setText(name);
				orderQ4.setText(num);
				return 4;
			}
			if(order5.getText().equalsIgnoreCase("-") && num!="0") {
				order5.setText(name);
				orderQ5.setText(num);
				return 5;
			}
			if(order6.getText().equalsIgnoreCase("-") && num!="0") {
				order6.setText(name);
				orderQ6.setText(num);
				return 6;
				
			}
			if(order7.getText().equalsIgnoreCase("-") && num!="0") {
				order7.setText(name);
				orderQ7.setText(num);
				return 7;
			}
			if(order8.getText().equalsIgnoreCase("-") && num!="0") {
				order8.setText(name);
				orderQ8.setText(num);
				return 8;
			}
			if(order9.getText().equalsIgnoreCase("-") && num!="0") {
				order9.setText(name);
				orderQ9.setText(num);
				return 9;
			}

		}	
		else {
			
			switch(i) {
			case 1 :
				orderQ1.setText(num);
				break;
			case 2 :
				orderQ2.setText(num);
				break;
			case 3 :
				orderQ3.setText(num);
				break;
			case 4 :
				orderQ4.setText(num);
				break;
			case 5 :
				orderQ5.setText(num);
				break;
			case 6 :
				orderQ6.setText(num);
				break;		
			case 7 :
				orderQ4.setText(num);
				break;
			case 8 :
				orderQ5.setText(num);
				break;
			case 9 :
				orderQ6.setText(num);
				break;	
					
							
			}		
		}
		
		return i;
		
	}
	
	
	
	//============================================================
	//Scene : Front 
	//order Form (clear)
	//button ActionEvent - orderUndo
	//============================================================
	
	
	public void orderUndo(ActionEvent event){
		
		orderNumber.setText("");
		
		order1.setText("-");
		order2.setText("-");
		order3.setText("-");
		order4.setText("-");
		order5.setText("-");
		order6.setText("-");
		order7.setText("-");
		order8.setText("-");
		order9.setText("-");
		
		orderQ1.setText("");
		orderQ2.setText("");
		orderQ3.setText("");
		orderQ4.setText("");
		orderQ5.setText("");
		orderQ6.setText("");
		orderQ7.setText("");
		orderQ8.setText("");
		orderQ9.setText("");
		
		o1 = 0;
		o2 = 0;
		o3 = 0;
		o4 = 0;
		o5 = 0;
		o6 = 0;
		o7 = 0;
		o8 = 0;
		o9 = 0;
		
		text1.setText("");
		text2.setText("");
		text3.setText("");
		text4.setText("");
		text5.setText("");
		text6.setText("");
		text7.setText("");
		text8.setText("");
		text9.setText("");
		
		totalPrice.setText("");
	}
	
	
	
	//======================================================================
	//function 1 
	//Scene : Front 
	//order Form 
	//button ActionEvent - order
	//======================================================================
	
	
	public void order(ActionEvent event) {
			
		orderNumber.setText(""+main.orderNum);
		main.orderNum++;
		
		for(int i=0; i<pieTartName.size(); i++)
		{
			
			if(order1.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ1.getText()));
			}
			else if(order2.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ2.getText()));
			}
			else if(order3.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ3.getText()));
			}
			else if(order4.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ4.getText()));
			}
			else if(order5.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ5.getText()));
			}
			else if(order6.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ6.getText()));
			}
			else if(order7.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ7.getText()));
			}
			else if(order8.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ8.getText()));
			}
			else if(order9.getText().equals(pieTartName.get(i))) {
				orderInterface.setPieTartNum(i, Integer.parseInt(orderQ9.getText()));
			}
			else {
				orderInterface.setPieTartNum(i, 0);
			}
			
		}
		
		for(int i=0; i<cakeName.size(); i++)
		{
			
			if(order1.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ1.getText()));
			}
			else if(order2.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ2.getText()));
			}
			else if(order3.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ3.getText()));
			}
			else if(order4.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ4.getText()));
			}
			else if(order5.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ5.getText()));
			}
			else if(order6.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ6.getText()));
			}
			else if(order7.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ7.getText()));
			}
			else if(order8.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ8.getText()));
			}
			else if(order9.getText().equals(cakeName.get(i))) {
				orderInterface.setCakeNum(i, Integer.parseInt(orderQ9.getText()));
			}
			else {
				orderInterface.setCakeNum(i, 0);
			}
			
		}
		
		for(int i=0; i<otherName.size(); i++)
		{
			
			if(order1.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ1.getText()));
			}
			else if(order2.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ2.getText()));
			}
			else if(order3.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ3.getText()));
			}
			else if(order4.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ4.getText()));
			}
			else if(order5.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ5.getText()));
			}
			else if(order6.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ6.getText()));
			}
			else if(order7.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ7.getText()));
			}
			else if(order8.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ8.getText()));
			}
			else if(order9.getText().equals(otherName.get(i))) {
				orderInterface.setOtherNum(i, Integer.parseInt(orderQ9.getText()));
			}
			else {
				orderInterface.setOtherNum(i, 0);
			}

		}
	
		
		//writer (in order.txt)
		//TextField - TotalPrice : set
		//console : print Latest and Total order
		
		int sum = 0;
		
		try {
			
			
			System.out.println("==============================");
			System.out.println("³Ì·s­q³æ:");
			
			for(int i=0; i<pieTartName.size(); i++)
			{
				PrintWriter writer = new PrintWriter(new FileOutputStream("d:\\order.txt",true));
				String order = pieTartName.get(i) + " " + pieTartNum.get(i) + " $" + pieTartPrice.get(i) * pieTartNum.get(i);
				orderInterface.addTotalOrder(order);
				writer.println(order);
				
				writer.flush();
				writer.close();
				System.out.println(order);
				
				sum += pieTartPrice.get(i) * pieTartNum.get(i);
			}
			for(int i=0; i<cakeName.size(); i++)
			{
				PrintWriter writer = new PrintWriter(new FileOutputStream("d:\\order.txt",true));
				String order = cakeName.get(i) + " " + cakeNum.get(i) + " $" + cakePrice.get(i) * cakeNum.get(i);
				orderInterface.addTotalOrder(order);
				writer.println(order);
				
				writer.flush();
				writer.close();
				System.out.println(order);
				
				sum += cakePrice.get(i) * cakeNum.get(i);
			}
			for(int i=0; i<otherName.size(); i++)
			{
				PrintWriter writer = new PrintWriter(new FileOutputStream("d:\\order.txt",true));
				String order = otherName.get(i) + " " + otherNum.get(i) + " $" + otherPrice.get(i) * otherNum.get(i);
				orderInterface.addTotalOrder(order);
				writer.println(order);
				
				writer.flush();
				writer.close();
				System.out.println(order);
				
				sum += otherPrice.get(i) * otherNum.get(i);
			}
			System.out.println("==============================");
			
			//set TextField
			totalPrice.setText(""+sum);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("==============================");
		System.out.println("Á`­q³æ:");
		
			for(String s : orderInterface.getTotalOrder())
			{		
				System.out.println(s);
			}
			
		System.out.println("==============================");
			
		
	}
	
	
	
	//====================================================================
	//Scene : Front 
	//order Form 
	//button ActionEvent - switch to backStage & switch to frontStage
	//====================================================================
	public void switchToLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToSceneBack(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Back.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	public void switchToSceneFront(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Front.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	//======================================================================
	//function 2
	//Scene : Back
	//button ActionEvent - statistic chart
	//======================================================================
	
	
	public void sales(ActionEvent e) {
		
		Button clickBtn = (Button)e.getSource();
		String food = clickBtn.getText();	
		
		int cnta=0,cntb=0,cntc=0,cntd=0,cnte=0,cntf=0,cntg=0,cnth=0,cnti=0;
		float suma[]=new float[100];
		float sumb[]=new float[100];
		float sumc[]=new float[100];
		float sumd[]=new float[100];
		float sume[]=new float[100];
		float sumf[]=new float[100];
		float sumg[]=new float[100];
		float sumh[]=new float[100];
		float sumi[]=new float[100];
		String aword,awordb,aworddd;
		String awordd;
		String awordc;
		String awordcc;
		
		HBox root=new HBox();
		
		
		
        Button btn = new Button();
        btn.setText("Back");
        btn.setPrefHeight(26);
        btn.setPrefWidth(28);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        root.getChildren().add(btn);
		
		Scene scene=new Scene(root,520,430);
		CategoryAxis xAxis=new CategoryAxis();
		xAxis.setLabel("«~¶µ");
		NumberAxis yAxis=new NumberAxis();
		yAxis.setLabel("¦U«~¶µ¾P°â¼Æ¶q¤ñ¸û¡A¥H¤p¼ÆÂI¤è¦¡§e²{");
		LineChart<String,Number> lineChart=new LineChart<String,Number>(xAxis,yAxis);
		lineChart.setTitle("¦U«~¶µªº¾P°â¼Æ¶q¤ñ¸û¡A¥H "+food+" ªº¾P°â¼Æ¶q¬°°ò·Ç");
		root.getChildren().add(lineChart);
		XYChart.Series<String, Number> data=new XYChart.Series<>();
		try {
			Scanner scanner=new Scanner(new FileInputStream("d:\\order.txt"));
			while(scanner.hasNextLine()){ 
				if(scanner.hasNext()==false) break;
				aword = scanner.next();
				awordb = scanner.next();
				//awordc = scanner.next();
				awordcc=scanner.next();
				if(aword.equals("Ä«ªG¬£")) {
					suma[cnta]+=Float.parseFloat(awordb);
					cnta++;
				}
				if(aword.equals("ÂfÂc¶ð")) {
					sumb[cntb]+=Float.parseFloat(awordb);
					cntb++;
				}
				if(aword.equals("°ê¤ý¬£")) {
					sumc[cntc]+=Float.parseFloat(awordb);
					cntc++;
				}
				if(aword.equals("¥¬®Ô¥§")) {
					sumd[cntd]+=Float.parseFloat(awordb);
					cntd++;
				}
				if(aword.equals("¤d¼h³J¿|")) {
					sume[cnte]+=Float.parseFloat(awordb);
					cnte++;
				}
				if(aword.equals("º¿¼w½¬")) {
					sumf[cntf]+=Float.parseFloat(awordb);
					cntf++;
				}
				if(aword.equals("°{¹qªwªÜ")) {
					sumg[cntg]+=Float.parseFloat(awordb);
					cntg++;
				}
				if(aword.equals("µÎªÜÁ¢")) {
					sumh[cnth]+=Float.parseFloat(awordb);
					cnth++;
				}
				if(aword.equals("¯N¥¬Á¢")) {
					sumi[cnti]+=Float.parseFloat(awordb);
					cnti++;
				}
					
			}
			if(food.equals("Ä«ªG¬£")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cnta;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum1+" ­Ó");
				if(sum1==0) {
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",0));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);
					
					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
					//stage = (Stage)((Node)e.getSource()).getScene().getWindow();
					
					//stage.setScene(scene);
					//stage.setTitle("Bakery.com");
					//stage.show();
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum1));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum1));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum1));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum1));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum1));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum1));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum1));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum1));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
					//stage = (Stage)((Node)e.getSource()).getScene().getWindow();
					
					//stage.setScene(scene);
					//stage.setTitle("Bakery.com");
					//stage.show();
				}
			}
			else if(food.equals("ÂfÂc¶ð")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cntb;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum2+" ­Ó");
				if(sum2==0) {
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum2));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum2));
					
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum2));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum2));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum2));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum2));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum2));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum2));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum2));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("°ê¤ý¬£")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cntc;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum3+" ­Ó");
				if(sum3==0) {
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else{
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum3));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum3));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum3));
					
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum3));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum3));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum3));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum3));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum3));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum3));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("¥¬®Ô¥§")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cntd;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum4+" ­Ó");
				if(sum4==0) {
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum4));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum4));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum4));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum4));
					
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum4));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum4));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum4));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum4));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum4));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("¤d¼h³J¿|")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cnte;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum5+" ­Ó");
				if(sum5==0) {
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum5));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum5));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum5));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum5));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum5));
					
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum5));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum5));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum5));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum5));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("º¿¼w½¬")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cntf;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum6+" ­Ó");
				if(sum6==0) {
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum6));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum6));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum6));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum6));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum6));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum6));
					
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum6));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum6));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum6));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("°{¹qªwªÜ")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cntg;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum7+" ­Ó");
				if(sum7==0) {
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum7));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum7));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum7));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum7));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum7));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum7));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum7));
					
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum7));
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum7));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("µÎªÜÁ¢")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cnth;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum8+" ­Ó");
				if(sum8==0) {
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum8));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum8));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum8));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum8));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum8));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum8));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum8));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum8));
					
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum8));
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			else if(food.equals("¯N¥¬Á¢")) {
				float sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0;
				for(int i=0;i<cnti;i++) {
					sum1+=suma[i];
					sum2+=sumb[i];
					sum3+=sumc[i];
					sum4+=sumd[i];
					sum5+=sume[i];
					sum6+=sumf[i];
					sum7+=sumg[i];
					sum8+=sumh[i];
					sum9+=sumi[i];
				}
				System.out.println(food+" Á`¦@½æ¤F "+sum9+" ­Ó");
				if(sum9==0) {
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",0));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8));
					
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				else {
					data.getData().add(new XYChart.Data<String,Number>("¯N¥¬Á¢",sum9/sum9));
					data.getData().add(new XYChart.Data<String,Number>("Ä«ªG¬£",sum1/sum9));
					data.getData().add(new XYChart.Data<String,Number>("ÂfÂc¶ð",sum2/sum9));
					data.getData().add(new XYChart.Data<String,Number>("°ê¤ý¬£",sum3/sum9));
					data.getData().add(new XYChart.Data<String,Number>("¥¬®Ô¥§",sum4/sum9));
					data.getData().add(new XYChart.Data<String,Number>("¤d¼h³J¿|",sum5/sum9));
					data.getData().add(new XYChart.Data<String,Number>("º¿¼w½¬",sum6/sum9));
					data.getData().add(new XYChart.Data<String,Number>("°{¹qªwªÜ",sum7/sum9));
					data.getData().add(new XYChart.Data<String,Number>("µÎªÜÁ¢",sum8/sum9));
					
					lineChart.getData().add(data);

					pane.setLayoutX(0);
					pane.setLayoutY(130);
					pane.getChildren().clear();
					pane.getChildren().add(lineChart);
					
				}
				
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
		
		}
		
	
		//======================================================================
		//function 3
		//Scene : Back
		//======================================================================
		
	
	public void gotoScenceOrder(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("applicationBackOrder.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	} 
		
		
		
		
	
	
	
	
	
	
	
}
	
	
	
		







	


