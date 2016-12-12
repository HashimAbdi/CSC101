
public class StringBuffer {

	public static void main(String[] args) {

		StringBuilder test = new StringBuilder("hashim");

		System.out.println("capacity: " + test.capacity());
		System.out.println("length: " + test.length());
		System.out.println("replace: " + test.replace(1, 3, "aaa"));
		System.out.println("append: " + test.append("aaa"));
		
	}

}
