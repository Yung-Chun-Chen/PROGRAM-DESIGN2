package application;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

//import g.Stack;

public class Operation {
	@FXML
    private static TextField display;
	public static String compute(String str)//將後置式進行運算
	{
		Stack s = new Stack(str.length());
		String [] data =transfer(str);//傳入轉換的方法得到後置式的分割陣列
		String ans = "";
		for(int i = 0 ; i < data.length ; i++)//讀出後置式的各個運算元運算子來做計算
		{
			if(data[i] == null)break;
//是運算子時
		if(data[i].equals("+")||data[i].equals("-")||data[i].equals("*")||data[i].equals("/")||data[i].equals("^"))
			{
				float b = Float.parseFloat(s.pop());//提出前面兩個儲存的值計算
				float a = Float.parseFloat(s.pop());
				if(data[i].equals("+"))
					s.push(""+(a+b));
				else if(data[i].equals("-"))
					s.push(""+(a-b));
				else if(data[i].equals("*"))
					s.push(""+(a*b));
				else if(data[i].equals("/"))
					
					s.push(""+(a/b));
				else if(data[i].equals("^"))
					s.push(""+(int)(Math.pow(a,b)));
			}
			else//是運算元時存入堆疊
				s.push(data[i]);

		}
		//display.setText(s.pop());
		return s.pop();
		//System.out.println("答案為 : "+s.pop());
	}
	public static String [] transfer(String data)//轉換成後置式
	{
		Stack s = new Stack(data.length());
		int index = 0;//為了將輸入的字串分割成陣列儲存用的索引值
		String [] ans = new String[data.length()];
		for(int i = 0 ; i < data.length() ;i++)
		{
			String opr = returnSplit(data,i);//傳入分割方法取得各個運算元或運算子
			if(opr.length() > 1)i+= (opr.length()-1);//避免傳出的是兩位數以上I未對應
//是運算子的話看其優先順序 是疊入還是取出
		if(opr.equals("+")||opr.equals("-")||opr.equals("*")||opr.equals("/")||opr.equals("^"))
			{
				while(s.index != -1 && priority(opr) <= priority(s.peep()))
				{
					ans[index++] = s.pop();
				}
				s.push(opr);
			}
			else if(opr.equals("("))
			{
				s.push(opr);
			}
			else if(opr.equals(")"))//取出運算子直到對應到"("以後
			{
				String tempS ="";
				while(s.index!= -1 &&!( (tempS = s.pop()).equals("(")) )
				{
					ans[index++] = tempS;
				}
			}
			else
			{
				ans[index++] =opr;
			}
		}
		while(s.index!=-1)ans[index++] = s.pop();
		return ans;
	}
	
	
	
	public static String returnSplit(String data,int index)//傳回分割後的值
	{
		String thisString ="";
		String s = String.valueOf(data.charAt(index));

		if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("(")||s.equals(")")||s.equals("^"))
		{
			return s;//直接傳回運算子
		}
		else
		{
			do{
				thisString += s;
				if(index+1 ==data.length())break;
				s = String.valueOf(data.charAt(++index));//後面的位數式運算元就累加
			}while(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")&&!s.equals("(")&&!s.equals(")")&&!s.equals("^"));
			return thisString;
		}
	}
	public static int priority(String opr)//運算子的優先順序
	{
		if(opr.equals("^"))return 3;
		else if(opr.equals("*")||opr.equals("/"))return 2;
		else if(opr.equals("+")||opr.equals("-"))return 1;
		else return 0;
	}
}
