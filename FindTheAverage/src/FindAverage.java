/**
 * @author Hashim Abdi 
 * Contact: ha24533@nvcc.edu
 * Date: 9/11/2016
 * We are finding the average of 10 user inputs using delimiter 
 * 
 */



import java.util.Scanner;


public class FindAverage {
	
	public static void main(String[] args) {

		float mean , sum = 0; // Mean = Sum of all inputs / Total Number of inputs
		
		// get the scanner and set delimiter
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		input.useDelimiter(",");
		
		// read user input
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();
		sum += input.nextInt();

		// calculate mean
		mean = sum/10;
		
		// print out information
		System.out.println("Sum is: " + sum + "\nMean is: " + mean);


	}
}
