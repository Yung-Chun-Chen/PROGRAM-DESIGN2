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
	public static String compute(String str)//�N��m���i��B��
	{
		Stack s = new Stack(str.length());
		String [] data =transfer(str);//�ǤJ�ഫ����k�o���m�������ΰ}�C
		String ans = "";
		for(int i = 0 ; i < data.length ; i++)//Ū�X��m�����U�ӹB�⤸�B��l�Ӱ��p��
		{
			if(data[i] == null)break;
//�O�B��l��
		if(data[i].equals("+")||data[i].equals("-")||data[i].equals("*")||data[i].equals("/")||data[i].equals("^"))
			{
				float b = Float.parseFloat(s.pop());//���X�e������x�s���ȭp��
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
			else//�O�B�⤸�ɦs�J���|
				s.push(data[i]);

		}
		//display.setText(s.pop());
		return s.pop();
		//System.out.println("���׬� : "+s.pop());
	}
	public static String [] transfer(String data)//�ഫ����m��
	{
		Stack s = new Stack(data.length());
		int index = 0;//���F�N��J���r����Φ��}�C�x�s�Ϊ����ޭ�
		String [] ans = new String[data.length()];
		for(int i = 0 ; i < data.length() ;i++)
		{
			String opr = returnSplit(data,i);//�ǤJ���Τ�k���o�U�ӹB�⤸�ιB��l
			if(opr.length() > 1)i+= (opr.length()-1);//�קK�ǥX���O���ƥH�WI������
//�O�B��l���ܬݨ��u������ �O�|�J�٬O���X
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
			else if(opr.equals(")"))//���X�B��l���������"("�H��
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
	
	
	
	public static String returnSplit(String data,int index)//�Ǧ^���Ϋ᪺��
	{
		String thisString ="";
		String s = String.valueOf(data.charAt(index));

		if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("(")||s.equals(")")||s.equals("^"))
		{
			return s;//�����Ǧ^�B��l
		}
		else
		{
			do{
				thisString += s;
				if(index+1 ==data.length())break;
				s = String.valueOf(data.charAt(++index));//�᭱����Ʀ��B�⤸�N�֥[
			}while(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")&&!s.equals("(")&&!s.equals(")")&&!s.equals("^"));
			return thisString;
		}
	}
	public static int priority(String opr)//�B��l���u������
	{
		if(opr.equals("^"))return 3;
		else if(opr.equals("*")||opr.equals("/"))return 2;
		else if(opr.equals("+")||opr.equals("-"))return 1;
		else return 0;
	}
}
