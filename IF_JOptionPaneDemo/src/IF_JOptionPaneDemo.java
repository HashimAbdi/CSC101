import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IF_JOptionPaneDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Your Credit Card number");
		Long ccNo = keyboard.nextLong(); // ccNo = create card number. We had to use long because the credit card digits are too long  
		String ccString = String.valueOf(ccNo); // we want to convert long to string 
		
	if (ccString.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int hieght = gd.getDisplayMode().getHeight();
		JOptionPane pane = new JOptionPane("Visa card Type");
		JDialog dialog = pane.createDialog(null, "credit card Type Validator");
		dialog.setLocation( width-1000, hieght-500);
		dialog.setVisible(true);
	}
	}
}
