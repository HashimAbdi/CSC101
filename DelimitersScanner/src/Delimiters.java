
/**
 * @author Hashim Abdi  
 * Date: 9/11/2016
 * contact: ha24533@nvcc.edu
 * The goal of this program is to Write an application to find an average of 10 numbers from user input with delimited by comma ",". 
 * Directions 
 * use Scanner to read input from keyboard or from text file and use delimiter.
 * Also my program must include single line comments to explain each line of code
 * must use escape sequences i.e "\t", "\n", "\""
 */



import java.util.Scanner;


public class Delimiters {
	public static void main(String[] args) {
		String s1,s2;
		Scanner keyboard1 = new Scanner(System.in); // use space as delimiter 
		Scanner keyboard2= new Scanner(System.in); // use $$ as delimiter 
		keyboard2.useDelimiter("$$");
		
		System.out.println("Enter a Line of Text with Two words:");
		s1 = keyboard1.next();
		s2 = keyboard2.next(); 
		System.out.println("The words are" + s1 + "\t" + s2 ); // escape sequence is 
		
		System.out.println("Enter a Line of Text with Two words( delimited by $$):");
		s1 = keyboard1.next();
		s2 = keyboard2.next(); 
		System.out.println("The words are \""  + s1  + "\"\n\""  + s2 + "\"" ); // escape sequence is  


	}

}
