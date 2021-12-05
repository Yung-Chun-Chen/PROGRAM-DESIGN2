package application;

public class Stack {
	String [] stack;
	public int index;
	Stack(int max)
	{
		index = -1; //µL¤¸¯À
		stack = new String[max];
	}
	public void push(String data)
	{
		stack[++index] = data;
	}
	public String pop()
	{
		return stack[index--];
	}
	public String peep()
	{
		return stack[index];
	}
}
