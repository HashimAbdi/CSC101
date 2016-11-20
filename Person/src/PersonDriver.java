
public class PersonDriver
{

	public static void main(String[] args) 
	{
		Person p1 = new Person("Jay", 2);
		Person p2 = new Person("Jay", 1);
		
		//Test whether two Person objects are equal (have the same name and age).
		if(p1.getName().equals(p2.getName()) && p1.getAge() == p2.getAge()){
			System.out.println("Perfect match! Same name and age.");
		}
		else{
			System.out.println("Sorry! Person does not match both name and age");
		}
		
		// Test whether two Person objects have the same name
		if(p1.getName().equals(p2.getName())){
			System.out.println("Perfect match! Same name!");
		}
		else{
			System.out.println("Sorry! Person does not match name");
		}
		
		// Test whether two Person objects are the same age
		if(p1.getAge() == p2.getAge()){
			System.out.println("Perfect match! Same age.");
		}
		else{
			System.out.println("Sorry! Person does not match age");
	}
		
		//Test whether one Person object is older than another
		if(p1.getAge() > p2.getAge()) 
		{
			System.out.println("Person one is older than person 2");
		}
		if(p1.getAge() < p2.getAge())
		{
			System.out.println("Person one is younger than person 2");
		}

		
	}
}
		
