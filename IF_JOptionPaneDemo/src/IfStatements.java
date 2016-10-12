/* 
 * @author Hashim Abdi 
 *  The purpose of this program is to figure what type of credit card the user enters 
 *  contact: ha24533@nvcc.edu
 *  
 */




import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.Scanner;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class IfStatements
{
	public static void main(String [] aargs) 
	{
		String message = "Enter your credit card number please:";
		Scanner input = new Scanner(System.in);
		
		
		System.out.println(message);
		String creditCardNumber = input.nextLine();
		
		// this is visa card 
		if(creditCardNumber.startsWith("41")) 
		{
			message = "This is a Visa Card";
		}
		// this is master card 
		else if(creditCardNumber.startsWith("55")) 
		{
			message = "This is a Master Card";
		}
		// this is Discover card 
		else if(creditCardNumber.startsWith("60"))
		{
			message = "This is a Discover Card";
		}
		// this is Dinners club card 
		else if(creditCardNumber.startsWith("30")) 
		{
			message = "This is a Dinners club card";
		}
		// this is the JCB Card 
		else if(creditCardNumber.startsWith("35"))
		{
			message = "This is JCB";
		}
		else
		{
			message = "The credit card number you entered is not apart of the companies listed. \nThank you!";
		}
		input.close(); 
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int hieght = gd.getDisplayMode().getHeight();
		JOptionPane pane = new JOptionPane(message);
		JDialog dialog = pane.createDialog(null, "Visa card Type");
		dialog.setLocation( width-550, hieght-250);
		dialog.setVisible(true);
		
	}
}
