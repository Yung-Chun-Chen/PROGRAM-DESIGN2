package finalproject_2048;

import java.util.Random;




public class Board
{
    public NumberBox[][] board;
    
    
    int grids=4;

    int border=0;

    public int score=0;


    public Board(){
        board=new NumberBox[4][4];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=new NumberBox();
            }
        }
    }


   
    public Board(int grids){
        this.grids=grids;
        board=new NumberBox[grids][grids];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=new NumberBox();
            }
        }
    }


    
    public Board(int lose,int grids){
        this.grids=grids;
        board=new NumberBox[grids][grids];
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=new NumberBox((lose+i+j)*(i+j));
            }
        }
    }


   
    public NumberBox[][] getBoard(){
        return board;
    }


    
    public int getScore(){
        return score;
    }


    
    public int getHighestNumberBox(){
        int high=board[0][0].getValue();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j].getValue()>high){
                    high=board[i][j].getValue();
                }
            }
        }
        return high;
    }


    public void print(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                String str=board[i][j].toString()+" ";
                System.out.print(str);
            }
            System.out.println("");
        }
        System.out.println("Score: "+score);
    }


    public String toString(){
        String s="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                s+=board[i][j].toString()+" ";
            }
            s+="\n";
        }
        return s;
    }


    
    public void generate()
    {
    	Random random=new Random();
    	if(blackOut()==false){
    		 boolean empty=true;
    	        while (empty){
    	            int row=random.nextInt(4);
    	            int col=random.nextInt(4);
    	            double x=Math.random();
    	            if(board[row][col].getValue()==0){
    	                if(x<0.1){
    	                    board[row][col]=new NumberBox(4);
    	                    empty=false;
    	                }
    	                else{
    	                    board[row][col]=new NumberBox(2);
    	                    empty=false;
    	                }
    	            }

    	        }
    	}
    	else{
    		boolean empty;
    		empty=false;
    	}
    		
    		

    }


    
    public boolean blackOut()
    {
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j].getValue()>0){
                    count++;
                }
            }
        }
        if(count==16){
            return true;
        }
        return false;
    }


    
    public boolean gameOver(){
        int count=0;
        for(int i=0;i<board.length; i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j].getValue()>0){
                    if(i==0&&j==0){
                        if(board[i][j].getValue()!=board[i+1][j].getValue()&&board[i][j].getValue()!=board[i][j+1].getValue()){
                            count++;
                        }
                    }
                    else if(i==0&&j==3){
                        if(board[i][j].getValue()!=board[i+1][j].getValue()&&board[i][j].getValue()!=board[i][j-1].getValue()){
                            count++;
                        }
                    }
                    else if(i==3&&j==3){
                        if(board[i][j].getValue()!=board[i-1][j].getValue()&&board[i][j].getValue()!=board[i][j-1].getValue()){
                            count++;
                        }
                    }
                    else if (i==3&&j==0){
                        if(board[i][j].getValue()!=board[i-1][j].getValue()&&board[i][j].getValue()!=board[i][j+1].getValue()){
                            count++;
                        }
                    }
                    else if(i==0&&(j==1||j==2)){
                        if (board[i][j].getValue()!=board[i+1][j].getValue()&&board[i][j].getValue()!=board[i][j+1].getValue()&&board[i][j].getValue()!=board[i][j-1].getValue()){
                            count++;
                        }
                    }
                    else if(i==3&&(j==1||j==2)){
                    	if (board[i][j].getValue()!=board[i-1][j].getValue()&&board[i][j].getValue()!=board[i][j+1].getValue()&&board[i][j].getValue()!=board[i][j-1].getValue()){
                            count++;
                        }
                    }
                    else if(j==0&&(i==1||i==2)){
                        if (board[i][j].getValue()!=board[i][j+1].getValue()&&board[i][j].getValue()!=board[i-1][j].getValue()&&board[i][j].getValue()!=board[i+1][j].getValue()){
                            count++;
                        }
                    }
                    else if(j==3&&(i==1||i==2)){
                        if (board[i][j].getValue()!=board[i][j-1].getValue()&& board[i][j].getValue()!=board[i-1][j].getValue()&&board[i][j].getValue()!=board[i+1][j].getValue()){
                            count++;
                        }
                    }
                    else{
                        if(board[i][j].getValue()!=board[i][j-1].getValue()&&board[i][j].getValue()!=board[i][j+1].getValue()
                            &&board[i][j].getValue()!=board[i-1][j].getValue()&&board[i][j].getValue()!=board[i + 1][j].getValue()){
                            count++;
                        }
                    }
                }
            }
        }
        if (count==16){
            return true;
        }
        else
        	return false;
    }


    private void moveVer(int row,int col,String direction)
    {
        NumberBox initial = board[border][col];
        NumberBox compare = board[row][col];
        if(initial.getValue()==0||initial.getValue()==compare.getValue()){
            if (row>border||(direction.equals("down")&&(row<border))){
                int addScore=initial.getValue()+compare.getValue();
                if (initial.getValue()!=0){
                    score+=addScore;
                }
                initial.setValue(addScore);
                compare.setValue(0);
            }
        }
        else{
            if(direction.equals("down")){
                border--;
            }
            else{
                border++;
            }
            moveVer(row,col,direction);
        }
    }
    
    public void up(){
        for(int i=0;i<4;i++){
            border=0;
            for(int j=0;j<4;j++){
                if(board[j][i].getValue()!=0){
                    if(border<=j){
                        moveVer(j,i,"up");
                    }
                }
            }
        }
    }


   
    public void down(){
        for(int i=0;i<4;i++){
            border=3;
            for(int j=3;j>=0;j--){
                if(board[j][i].getValue()!=0){
                    if(border>=j){
                        moveVer(j,i,"down");
                    }
                }
            }
        }
    }

    public void left(){
        for(int i=0;i<4;i++){
            border = 0;
            for(int j=0;j<4;j++){
                if (board[i][j].getValue()!=0){
                    if(border <= j){
                        moveHor(i,j,"left");
                    }
                }
            }
        }
    }
  
    public void right(){
        for(int i=0;i<4;i++){
            border = 3;
            for(int j=3;j>=0;j--){
                if(board[i][j].getValue()!=0){
                    if (border>=j){
                        moveHor(i,j,"right");
                    }
                }
            }
        }
    }

    private void moveHor(int row, int col, String direction){
        NumberBox initial = board[row][border];
        NumberBox compare = board[row][col];
        if (initial.getValue() == 0 || initial.getValue() == compare.getValue()){
            if (col>border||(direction.equals("right")&&(col<border))){
                int addScore = initial.getValue() + compare.getValue();
                if (initial.getValue()!=0){
                    score+=addScore;
                }
                initial.setValue(addScore);
                compare.setValue(0);
            }
        }
        else{
            if (direction.equals("right")){
                border--;
                moveHor(row,col,direction);
            }
            else if(direction.equals("left")){
                border++;
                moveHor(row,col,direction);
            }
            else {
            	;
            }
        }
    }
    
   

}
