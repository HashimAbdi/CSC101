/* 
 * @author Hashim Abdi 
 * Date: 9/13/2016
 * Contact: ha24533@nvcc.edu
 * 
 */




import java.util.Scanner;

public class FindAverageWithOutDelimiters {

	public static void main(String[] args) 
	{		
		float mean , sum = 0; // Mean = Sum of all inputs / Total Number of inputs
		int counter = 10;
		// get the scanner and set delimiter
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers: ");

		//Pattern WHITESPACE_PATTERN = Pattern.compile("[,\\s]+");
		
		input.useDelimiter("[,\\s]+");		
		for(int i = 0; i < counter; i++ )
		{
			sum += input.nextInt();
		}
		
		
		input.close();
		// calculate mean
		mean = sum/counter;
		
		// print out information
		String message = "Sum is: " + sum;
		message += "\nMean is: " + mean;
		
		System.out.println(message);

	}

}
