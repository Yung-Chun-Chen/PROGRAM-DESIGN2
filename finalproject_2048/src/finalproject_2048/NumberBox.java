package finalproject_2048;

import java.awt.Color;

public class NumberBox {
	int value;

    Color numberBoxColor;
    
    public NumberBox() {
    	value=0;
    }
    public void setValue(int value) {
    	this.value = value;
    }
    public NumberBox(int number) {
    	value=number;
    }
    public String toString(){
    	// TODO Auto-generated method stub
        return "" + value;
    }

	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	public void setColor() {
		if(this.getValue()==2){
            numberBoxColor=new Color(238,228,218);
        }
        else if(this.getValue()==4){
            numberBoxColor=new Color(237,224,200);
        }
        else if(this.getValue()==8){
            numberBoxColor=new Color(242,177,121);
        }
        else if(this.getValue()==16){
            numberBoxColor=new Color(245,149,99);
        }
        else if(this.getValue()==32){
            numberBoxColor=new Color(246,124,95);
        }
        else if(this.getValue()==64){
            numberBoxColor=new Color(246,94,59);
        }
        else if(this.getValue()==128){
            numberBoxColor=new Color(237,207,114);
        }
        else if(this.getValue()==256){
            numberBoxColor=new Color(237,204,97);
        }
        else if(this.getValue()==512){
            numberBoxColor=new Color(237,200,80);
        }
        else if ( this.getValue()==1024){
            numberBoxColor=new Color(237,197,63);
        }
        else{
            numberBoxColor=new Color(237,194,46);
        }
    }
	public Color getColor(){
		// TODO Auto-generated method stub
		this.setColor();
        return numberBoxColor;
	}

}
