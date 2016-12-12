import java.util.Scanner;

/*
 * Author: @HashimAbdi 
 * Contact: @ha24533@email.vccs.edu
 * 
 */
public class Printf {

	public static void main(String[] args) 
	{
		System.out.println("Please choose an option\n1 for println\n2 for printf");

		
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		if(option == 1)
		{
			// use println
			System.out.println("Hi my name if Hashim and I am 19 years old!");
		}
		else if(option == 2)
		{
			// use printf
			System.out.printf("Hi my name is %s\n", "Hashim");
			System.out.printf("Hi my name is %c\n", 'H');
			System.out.printf("Hi my name is Hashim and I am %d years old\n", 19);
			System.out.printf("Hi my name is Hashim and I am %e years old\n", 19.000000000000002);
			System.out.printf("Hi my name is Hashim and I am %f years old\n", 19.56);
		}
		else
		{
			System.out.println("You can only enter 1 or 2. Please try again!");
		}
	}

}
