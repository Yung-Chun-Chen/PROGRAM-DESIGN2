package application;
import java.util.ArrayList;

public class OrderInterface {
	
	private ArrayList<String> totalOrder;
	
   private ArrayList<String> pieTartName;
   private ArrayList<String> cakeName;
   private ArrayList<String> otherName;
   private ArrayList<Integer> pieTartPrice;
   private ArrayList<Integer> cakePrice;
   private ArrayList<Integer> otherPrice;
   private ArrayList<Integer> pieTartNum;
   private ArrayList<Integer> cakeNum;
   private ArrayList<Integer> otherNum;

   public OrderInterface()
   {
	   totalOrder = new ArrayList<String>();
	   
	   pieTartName = new ArrayList<String>();
	   pieTartName.add("Ä«ªG¬£");
	   pieTartName.add("ÂfÂc¶ð");
	   pieTartName.add("°ê¤ý¬£");
	   pieTartPrice = new ArrayList<Integer>();
	   pieTartPrice.add(50);
	   pieTartPrice.add(100);
	   pieTartPrice.add(150);
	   pieTartNum = new ArrayList<Integer>();
	   pieTartNum.add(0);
	   pieTartNum.add(0);
	   pieTartNum.add(0);
	  
	   cakeName = new ArrayList<String>();
	   cakeName.add("¥¬®Ô¥§");
	   cakeName.add("¤d¼h³J¿|");
	   cakeName.add("º¿¼w½¬");
	   cakePrice = new ArrayList<Integer>();
	   cakePrice.add(200);
	   cakePrice.add(250);
	   cakePrice.add(300);
	   cakeNum = new ArrayList<Integer>();
	   cakeNum.add(0);
	   cakeNum.add(0);
	   cakeNum.add(0);
	  
	   otherName = new ArrayList<String>();
	   otherName.add("°{¹qªwªÜ");
	   otherName.add("µÎªÜÁ¢");
	   otherName.add("¯N¥¬Á¢");
	   otherPrice = new ArrayList<Integer>();
	   otherPrice.add(350);
	   otherPrice.add(400);
	   otherPrice.add(450);
	   otherNum = new ArrayList<Integer>();
	   otherNum.add(0);
	   otherNum.add(0);
	   otherNum.add(0);
   }
   
   public ArrayList<String> getTotalOrder()
   {
	   return totalOrder;
   }
   
   public void addTotalOrder(String order)
   {
	   totalOrder.add(order);
   }

   public ArrayList<String> getPieTartName()
   {
       return pieTartName;
   }

   public ArrayList<String> getCakeName()
   {
       return cakeName;
   }

   public ArrayList<String> getOtherName()
   {
       return otherName;
   }
   
   public ArrayList<Integer> getPieTartPrice()
   {
	   return pieTartPrice;
   }
   
   public ArrayList<Integer> getCakePrice()
   {
	   return cakePrice;
   }
   
   public ArrayList<Integer> getOtherPrice()
   {
	   return otherPrice;
   }
   
   public ArrayList<Integer> getPieTartNum()
   {
	   return pieTartNum;
   }
   
   public void setPieTartNum(int i, int num)
   {
	   pieTartNum.set(i, num);
   }
   
   public ArrayList<Integer> getCakeNum()
   {
	   return cakeNum;
   }
   
   public void setCakeNum(int i, int num)
   {
	   cakeNum.set(i, num);
   }
   
   public ArrayList<Integer> getOtherNum()
   {
	   return otherNum;
   }
   
   public void setOtherNum(int i, int num)
   {
	   otherNum.set(i, num);
   }

}
