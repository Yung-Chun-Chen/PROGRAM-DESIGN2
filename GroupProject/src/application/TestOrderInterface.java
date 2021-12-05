package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class TestOrderInterface {

	private static OrderInterface orderInterface;

	public static void main(String[] args) {

		orderInterface = new OrderInterface();
		
		ArrayList<String> pieTartName = orderInterface.getPieTartName();
		ArrayList<String> cakeName = orderInterface.getCakeName();
		ArrayList<String> otherName = orderInterface.getOtherName();
		ArrayList<Integer> pieTartPrice = orderInterface.getPieTartPrice();
		ArrayList<Integer> cakePrice = orderInterface.getCakePrice();
		ArrayList<Integer> otherPrice = orderInterface.getOtherPrice();
		ArrayList<Integer> pieTartNum = orderInterface.getPieTartNum();
		ArrayList<Integer> cakeNum = orderInterface.getCakeNum();
		ArrayList<Integer> otherNum = orderInterface.getOtherNum();
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			for(int i=0; i<pieTartName.size(); i++)
			{
				System.out.print(pieTartName.get(i) + ": ");
				orderInterface.setPieTartNum(i, scan.nextInt());
			}
			for(int i=0; i<cakeName.size(); i++)
			{
				System.out.print(cakeName.get(i) + ": ");
				orderInterface.setCakeNum(i, scan.nextInt());
			}
			for(int i=0; i<otherName.size(); i++)
			{
				System.out.print(otherName.get(i) + ": ");
				orderInterface.setOtherNum(i, scan.nextInt());
			}
			
			System.out.print("確定點餐? (y/n) : ");
			String y_n = scan.next();
			if(y_n.equals("y"))
			{
				try {
					
					
					System.out.println("==============================");
					System.out.println("最新訂單:");
					for(int i=0; i<pieTartName.size(); i++)
					{
						PrintWriter writer = new PrintWriter(new FileOutputStream("d:\\order.txt",true));
						String order = pieTartName.get(i) + " " + pieTartNum.get(i) + " $" + pieTartPrice.get(i) * pieTartNum.get(i);
						orderInterface.addTotalOrder(order);
						writer.println(order);
						
						writer.flush();
						writer.close();
						System.out.println(order);
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
					}
					System.out.println("==============================");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
			}

			System.out.println("==============================");
			System.out.println("總訂單:");
			
			
				for(String s : orderInterface.getTotalOrder())
				{
					
							
					System.out.println(s);
				}
				
				
			
		
			
			System.out.println("==============================");
		}

	}

}
