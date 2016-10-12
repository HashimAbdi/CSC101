package tictactoe2;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class TicTacToe extends JApplet
{
	public void paint(Graphics canvas)
	{
		Font font= new Font("X", 500, 60);
		canvas.setFont(font);
		// first line going horizontally
		canvas.drawLine(150, 100, 500, 100);
		canvas.drawLine(150, 250, 500, 250);
		// first line going down
		canvas.drawLine(450,0, 450, 400);
		canvas.drawLine(250,0, 250, 400);
		
		// line going through the X 
		canvas.drawLine(200, 0,195 ,400);
		// middle left 
		canvas.drawString("x", 175, 200);
		// middle bottem 
		canvas.drawString("o", 350, 350);
		//  left bottom 
		canvas.drawString("x", 175, 350);
		// middle right 
		canvas.drawString("o", 500, 200);
		// top left 
		canvas.drawString("x",175 , 50);
		
	}

}

	