
public class first100ODD {

	public static void main(String[] args)
	{
		String numbers = "";
		numbers += "EVEN NUMBERS:\n";
		
		// even numbers 0-100
		int count = 0;
		while(count <= 100)
		{
			if((count != 0 && count % 2 != 0) == false)
			{
				numbers += count + ", ";
			}
			count++;
		}
		numbers = numbers.substring(0, numbers.length() -2);
		numbers += "\nODD NUMBERS:\n";
		
		  // odd numbers 0-100
		for(int i = 0; i <= 100; i++)
		{
			if(i != 0 && i % 2 != 0)
			{
				numbers += i + ", ";
			}
		}
		numbers = numbers.substring(0, numbers.length() -2);
		
		String diamond = "\nDIAMOND SHAPE:\n";
		count = 0;
		while(count < 5)
		{
			if(count == 0 || count == 4)
			{
				 diamond += "  *\n";
			}
			else if(count == 1 || count == 3)
			{
				diamond += " ***\n";
			}
			else if(count == 2){
				diamond += "*****\n";
			}
			count++;
		}
		
		
		
		// output numbers and diamond shape
		System.out.println(numbers);
		System.out.println(diamond);

	}
}

