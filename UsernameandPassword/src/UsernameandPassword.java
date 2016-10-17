import java.util.Scanner;

/*@author Hashim Abdi 
 * contact: ha24533@nvcc.edu
 * purpose of this program is to ask user for their username and password 
 * then output message saying weather its correct or not 
 * 
 * 
 * 
 */
public class UsernameandPassword {
	
	
	public static void main(String[] args) 
	{
	
		// create scanner variable 
		Scanner input = new Scanner(System.in);
		String username;
		String password;
		
		
		// Prompt user for input 
		System.out.println("Enter Your Username");
		username = input.nextLine();
		
		System.out.println("Enter Your Password");
		password = input.nextLine();
		
		// validate username and password 
		
		if(username.equals("Hashim") && password.equals("123"))  
		{
			System.out.println("Welcome " + username );
			
		}
		
		else
		{
			System.out.println("Username or password is incorrect");
		}
			
		
		
	}
}
