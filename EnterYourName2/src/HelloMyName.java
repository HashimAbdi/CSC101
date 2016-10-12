import java.util.Scanner;
public class HelloMyName {

	public static void main(String[] args) {
		String name;
		String password; 
		Scanner laptop = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		name = laptop.nextLine(); 
		System.out.println(" Enter Your Password");
		password = laptop.nextLine();
		
		System.out.println("Hello " + name);

	}

}
