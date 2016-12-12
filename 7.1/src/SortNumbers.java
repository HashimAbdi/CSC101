import javax.swing.JOptionPane;

public class SortNumbers {

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Enter 10 numbers with a comma in between the numbers. Do not make the last character a comma.");
		
		// convert array of string numbers to array of int
		String[] nums = input.split(",");
		int[] numbers = new int[nums.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(nums[i]);
		}
		
		// order the numbers
		numbers = swap(numbers);
		
		// print the ordered numbers to screen
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}
	
	public static int[] swap(int[] numbers){
		java.util.Arrays.sort(numbers);
		return numbers;
	}

}
