package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import java.util.ArrayList;

public class BackSales extends Application {
	@Override
	
	public void start(Stage primaryStage) throws Exception{
		init(primaryStage);
	}
	private void init(Stage primaryStage) {
		
			
		
			Scanner input=new Scanner(System.in);
			System.out.print("�п�J�n�H��ث~������ǬݾP��ƶq��� (ex:�N����) :");
			
			String food=input.next();
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
			Scene scene=new Scene(root,520,430);
			CategoryAxis xAxis=new CategoryAxis();
			xAxis.setLabel("�~��");
			NumberAxis yAxis=new NumberAxis();
			yAxis.setLabel("�U�~���P��ƶq����A�H�p���I�覡�e�{");
			LineChart<String,Number> lineChart=new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("�U�~�����P��ƶq����A�H "+food+" ���P��ƶq�����");
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
					if(aword.equals("ī�G��")) {
						suma[cnta]+=Float.parseFloat(awordb);
						cnta++;
					}
					if(aword.equals("�f�c��")) {
						sumb[cntb]+=Float.parseFloat(awordb);
						cntb++;
					}
					if(aword.equals("�����")) {
						sumc[cntc]+=Float.parseFloat(awordb);
						cntc++;
					}
					if(aword.equals("���ԥ�")) {
						sumd[cntd]+=Float.parseFloat(awordb);
						cntd++;
					}
					if(aword.equals("�d�h�J�|")) {
						sume[cnte]+=Float.parseFloat(awordb);
						cnte++;
					}
					if(aword.equals("���w��")) {
						sumf[cntf]+=Float.parseFloat(awordb);
						cntf++;
					}
					if(aword.equals("�{�q�w��")) {
						sumg[cntg]+=Float.parseFloat(awordb);
						cntg++;
					}
					if(aword.equals("�Ϊ���")) {
						sumh[cnth]+=Float.parseFloat(awordb);
						cnth++;
					}
					if(aword.equals("�N����")) {
						sumi[cnti]+=Float.parseFloat(awordb);
						cnti++;
					}
						
				}
				if(food.equals("ī�G��")) {
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
					System.out.println(food+" �`�@��F "+sum1+" ��");
					if(sum1==0) {
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",0));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum1));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum1));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum1));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum1));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum1));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum1));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum1));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum1));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
				}
				else if(food.equals("�f�c��")) {
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
					System.out.println(food+" �`�@��F "+sum2+" ��");
					if(sum2==0) {
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum2));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum2));
						
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum2));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum2));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum2));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum2));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum2));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum2));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum2));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("�����")) {
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
					System.out.println(food+" �`�@��F "+sum3+" ��");
					if(sum3==0) {
						data.getData().add(new XYChart.Data<String,Number>("�����",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else{
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum3));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum3));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum3));
						
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum3));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum3));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum3));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum3));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum3));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum3));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("���ԥ�")) {
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
					System.out.println(food+" �`�@��F "+sum4+" ��");
					if(sum4==0) {
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum4));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum4));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum4));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum4));
						
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum4));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum4));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum4));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum4));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum4));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("�d�h�J�|")) {
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
					System.out.println(food+" �`�@��F "+sum5+" ��");
					if(sum5==0) {
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum5));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum5));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum5));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum5));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum5));
						
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum5));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum5));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum5));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum5));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("���w��")) {
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
					System.out.println(food+" �`�@��F "+sum6+" ��");
					if(sum6==0) {
						data.getData().add(new XYChart.Data<String,Number>("���w��",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum6));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum6));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum6));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum6));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum6));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum6));
						
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum6));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum6));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum6));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("�{�q�w��")) {
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
					System.out.println(food+" �`�@��F "+sum7+" ��");
					if(sum7==0) {
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum7));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum7));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum7));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum7));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum7));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum7));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum7));
						
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum7));
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum7));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("�Ϊ���")) {
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
					System.out.println(food+" �`�@��F "+sum8+" ��");
					if(sum8==0) {
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum8));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum8));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum8));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum8));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum8));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum8));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum8));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum8));
						
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum8));
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				else if(food.equals("�N����")) {
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
					System.out.println(food+" �`�@��F "+sum9+" ��");
					if(sum9==0) {
						data.getData().add(new XYChart.Data<String,Number>("�N����",0));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8));
						
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					else {
						data.getData().add(new XYChart.Data<String,Number>("�N����",sum9/sum9));
						data.getData().add(new XYChart.Data<String,Number>("ī�G��",sum1/sum9));
						data.getData().add(new XYChart.Data<String,Number>("�f�c��",sum2/sum9));
						data.getData().add(new XYChart.Data<String,Number>("�����",sum3/sum9));
						data.getData().add(new XYChart.Data<String,Number>("���ԥ�",sum4/sum9));
						data.getData().add(new XYChart.Data<String,Number>("�d�h�J�|",sum5/sum9));
						data.getData().add(new XYChart.Data<String,Number>("���w��",sum6/sum9));
						data.getData().add(new XYChart.Data<String,Number>("�{�q�w��",sum7/sum9));
						data.getData().add(new XYChart.Data<String,Number>("�Ϊ���",sum8/sum9));
						
						lineChart.getData().add(data);
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
					}
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		launch(args);
	}
}
	

