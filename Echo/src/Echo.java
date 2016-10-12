import java.util.Scanner;

import javax.swing.JOptionPane;

public class Echo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Byte byteValue;
		String charValue;
		String input = "a";
		Boolean booleanValue;
		Long longValue;
		Short shortValue;
		Float floatValue;
		int intValue;
		
		Scanner stringValue = new Scanner(input);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a byte value");
		byteValue = keyboard.nextByte();
		JOptionPane.showMessageDialog(null, " You Have Entered" + byteValue);
		System.out.println("Enter a char Value");
		charValue = keyboard.next();charAt(0);
		JOptionPane.showMessageDialog(null, "You have just entered" + charValue);
		char output = stringValue.findInLine(".").charAt(0);
		JOptionPane.showMessageDialog(null, " Your Have an input value" + output);
		
		new Scanner(input);
		System.out.println("Enter Long Value");
		longValue = keyboard.nextLong();
		JOptionPane.showMessageDialog(null, " You Have Entered" + longValue);
		
		new Scanner(input);
		System.out.println("Enter Short Value");
		shortValue = keyboard.nextShort();
		JOptionPane.showMessageDialog(null, " You Have Entered" + shortValue);
		
		new Scanner(input);
		System.out.println("Enter float Value");
		floatValue = keyboard.nextFloat();
		JOptionPane.showMessageDialog(null, " You Have Entered" + floatValue);
		System.out.println("Enter Boolen Value");
		intValue = keyboard.nextInt();
		JOptionPane.showMessageDialog(null, " You Have Entered" + intValue);
		
	}

	private static void charAt(int i) {
		// TODO Auto-generated method stub
		
	}

}
