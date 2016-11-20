package car;

public class Car 
{
	
	private String color;
	private String make;
	private int horsePower;
	private double engineSize;
	
	private static int count;
	
	
	public Car()
	{
		count++;
	}
	
	public Car(String inputColor, int inputHorsePower, double inputEngineSize, String inputMake )
	{
		count++;
		color = inputColor;
		horsePower = inputHorsePower;
		engineSize = inputEngineSize;
		make = inputMake;
	}

	
	public static int getCount()
	{
		return count;
	}
	
	public static Boolean Equals(Car c1, Car c2)
	{
		Boolean isEqual = false;
		if(c1.getColor().equals(c2.getColor()) && c1.getMake().equals(c2.getMake()) &&
				c1.getHorsePower() == c2.getHorsePower() && c1.getEngineSize() == c2.getEngineSize())
		{
			isEqual = true;
		}		
		return isEqual;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String inputColor) {
		color = inputColor;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String inputMake) {
		make = inputMake;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int inputHorsePower) {
		horsePower = inputHorsePower;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double inputEngineSize) {
		engineSize = inputEngineSize;
	}
	
	
	public String toString()
	{
		String s ="";
		s += "Color: " + color;
		s += "\nMake: " + make;
		s += "\nHorse Power: " + horsePower;
		s += "\nEngine Size: " + engineSize;
		
		return s;
	}
	
	
	
}
