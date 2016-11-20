package car;

import javax.swing.JOptionPane;

public class Driver2 {

	public static void main(String[] args)
	{
	
		// use Joption Pane to ask user for one car's information (color, horsepower,engineSize, make)
		String color = JOptionPane.showInputDialog("Car color: ");
		String make = JOptionPane.showInputDialog("Car make: ");
		int horsePower = Integer.parseInt(JOptionPane.showInputDialog("Car horse power: "));
		double engineSize = Double.parseDouble(JOptionPane.showInputDialog("Car engine size: "));
		
		// create a 2nd car that is a copy of the 1st car
		Car c1 = new Car(color,horsePower,engineSize,make);
		Car c2 = new Car(color,horsePower,engineSize,make);
		
		// compare using the Car class's equal method
		System.out.println("Are the cars equal result: " + Car.Equals(c1, c2));
		//  Create Cars
		
		

	}

}
