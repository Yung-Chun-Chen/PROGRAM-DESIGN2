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
			System.out.print("½Ð¿é¤J­n¥H¦óºØ«~¶µ¬°°ò·Ç¬Ý¾P°â¼Æ¶q¤ñ¸û (ex:¯N¥¬Á¢) :");
			
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
						primaryStage.setScene(scene);
						primaryStage.setTitle("Bakery.com");
						primaryStage.show();
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
	

