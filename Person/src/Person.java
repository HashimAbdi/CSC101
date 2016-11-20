
public class Person 
{
	private String name;
	private int age;
	
	public Person()
	{
		
	}
	
	public Person(String inputName, int inputAge)
	{
		name = inputName;
		age = inputAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String inputName)
	{
		name = inputName;
	}

	public void setAge(int inputAge)
	{
		age = inputAge;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		String s ="";
		s += "Name: " + name;
		s += "\nAge:" + age;
		
		return s;
	}
}

