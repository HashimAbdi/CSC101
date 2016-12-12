
public class string {

	public static void main(String[] args) 
	{
	 String test = "Hashim";
	 System.out.println("concat: " + test.concat(" Abdi"));
	 System.out.println("equals: " + test.equals(" Abdi"));
	 System.out.println("equalsIgnoreCase: " + test.equalsIgnoreCase("Abdi"));
	 System.out.println("indexOf: " + test.indexOf("a"));
	 System.out.println("lastIndexOf: " + test.lastIndexOf("a"));
	 System.out.println("toLowerCae: " + test.toLowerCase());
	 System.out.println("toUpperCase: " + test.toUpperCase());
	 System.out.println("replace: " + test.replace('a', 'e'));
	 System.out.println("substring: " + test.substring(1));
	 System.out.println("substring: " + test.substring(1,3));
	 System.out.println("valueOf: " + String.valueOf(test));
	 System.out.println("trim: " + (test + " Abdi          ").trim());
	}

}
