import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingBorderLayout extends JFrame
{
	private JButton button1, button2, button3, button4, button5;
	private JTextField[] textFields = new JTextField[4];
	
	public  SwingBorderLayout() 
	{
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		
		setLayout(new BorderLayout());
	
		add(button1, BorderLayout.PAGE_START);
		add(button2, BorderLayout.CENTER);
		add(button3, BorderLayout.PAGE_END);
		add(button4, BorderLayout.LINE_END);
		add(button5, BorderLayout.LINE_START);
		
		
		textFields[0] = new JTextField("a");
		textFields[1] = new JTextField("b");
		textFields[2] = new JTextField("c");
		textFields[3] = new JTextField("d");
		
		add(textFields[0], BorderLayout.PAGE_START);
		add(textFields[1], BorderLayout.CENTER);
		add(textFields[2], BorderLayout.PAGE_END);
		add(textFields[3], BorderLayout.LINE_END);
				
		
		setVisible(true);
		setSize(new Dimension(500,500));
		
		
	}
}
		
	


