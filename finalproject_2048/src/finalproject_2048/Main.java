package finalproject_2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;




public class Main extends JPanel implements KeyListener{
	
	Board game=new Board();
	static Main newGame = new Main();
	static JFrame frame = new JFrame("2048");
	String gameBoard = game.toString();
	
	public static void setUpGUI()
    {
        frame.addKeyListener(newGame);
        frame.getContentPane().add(newGame);
        frame.setSize(560,560);
        frame.setVisible(true);
        
    }
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_S) {
			game=null;
			game = new Board();
            game.generate();
            frame.repaint();
            
		}
		else if(e.getKeyCode()==KeyEvent.VK_R) {
			game=null;
			game = new Board();
            game.generate();
            frame.repaint();
            
		}
		else if (e.getKeyCode()==KeyEvent.VK_UP ){
            game.up();
            game.generate();
            gameBoard=game.toString();
            frame.repaint();
        }
		else if (e.getKeyCode()==KeyEvent.VK_DOWN ){
            game.down();
            game.generate();
            gameBoard=game.toString();
            frame.repaint();
        }
		else if (e.getKeyCode()==KeyEvent.VK_LEFT )
        {
            game.left();
            game.generate();
            gameBoard=game.toString();
            frame.repaint();
        }
		else if (e.getKeyCode()==KeyEvent.VK_RIGHT )
        {
            game.right();
            game.generate();
            gameBoard=game.toString();
            frame.repaint();
        }
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		Graphics2D graphics2 = (Graphics2D)graphics;
		int fontSize=17;
		//Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
		graphics2.setFont(new Font("TimesRoman", Font.PLAIN, fontSize)); 
		graphics2.drawString( "Score: " + game.getScore(),125,40);
		graphics2.drawString( "Highest Box Number: " + game.getHighestNumberBox(),245,40);
		graphics2.drawString( "Press ' s ' to Start",195,335);
		graphics2.drawString( "Press ' r ' to Restart",190,355);
		graphics2.drawString( "Press UP, DOWN, LEFT, RIGHT Keys to move",90,385);
		graphics2.setColor( Color.gray );
        graphics2.fillRect(140, 50, 250, 250 ); //140, 50, 250, 250
        for ( int i = 0; i < 4; i++ )
        {
            for ( int j = 0; j < 4; j++ )
            {
                drawNumberBoxes( graphics, game.board[i][j], j * 60 + 150, i * 60 + 60); //j * 60 + 150, i * 60 + 60
            }
        }
        
       /* if(game.blackOut()==true) {
        	if(game.gameOver()==false) {
        		for(int i=0;i<4;i++) {
        			for(int j=0;j<4;j++) {
        				if(i==0&&j==0) {
        					if(game.board[i][j]==game.board[i][j+1]) {
            					
            				}
        				}
        				
        			}
        		}
        	}
        }*/
        
		  if ( game.gameOver() )
	        {
	        	
	        	/*graphics2.
	        	graphics2.setColor( Color.gray );
	            graphics2.fillRect( 140, 50, 250, 250 );*/
	            for ( int i = 0; i < 4; i++ )
	            {
	                for ( int j = 0; j < 4; j++ )
	                {
	                    graphics2.setColor( Color.red );
	                  //graphics2.fillRoundRect( j * 60 + 150, i * 60 + 60, 50, 50, 5, 5 );
	                    //graphics2.setColor( Color.black );
	                    graphics.drawString("GAME",j*60+150,i*60+80); //j*60+160,i*60+75
	                    graphics.drawString("OVER",j*60+150,i*60+100); //j*60+160,i*60+95
	                }
	            }
			  fontSize=30;
			  	graphics2.setFont(new Font("TimesRoman", Font.PLAIN, fontSize)); 
	            graphics2.setColor( Color.RED );
	            graphics2.drawString("Game Over, Press 'r' to Restart", 50, 420);
	        }
	}
	
	public void drawNumberBoxes( Graphics graphics, NumberBox numberBox, int x, int y )
    {
        int numberBoxValue = numberBox.getValue();
        int length = String.valueOf(numberBoxValue).length();
        Graphics2D graphics2 = (Graphics2D)graphics;
        graphics2.setColor( Color.lightGray );
        graphics2.fillRoundRect(x,y,50,50,1,1); //x,y,50,50,1,1
        graphics2.setColor(Color.black);
        if ( numberBoxValue > 0 )
        {
        	graphics2.setColor(numberBox.getColor());
        	graphics2.fillRoundRect(x,y,50,50,1,1); //x,y,50,50,1,1
        	graphics2.setColor( Color.black );
        	graphics.drawString(""+numberBoxValue,x+24-3*length,y+30); //""+numberBoxValue,x+25-3*length,y+25
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpGUI();
	}
}
