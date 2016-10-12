/* @author Hashim Abdi 
 * contact: ha24533@email.nvcc.edu
 * purpose of the program is to output the exact change 
 * 
 */

package moneyPractice;

import javax.swing.JOptionPane;

public class DollerBillsPractice {

	public static void main(String[] args) {
		final int QUATER = 25;
		final int DIME = 10;
		final int NICKLE = 5;
		final int PENNY = 1; 
		
		String input = JOptionPane.showInputDialog("Enter amount iin 1,5,10 dollar bills");
		int amount = Integer.parseInt(input)*100;
		JOptionPane.showMessageDialog(null, "The change in Quaters is " + amount/QUATER);
		JOptionPane.showMessageDialog(null, "The change in Dime is " + amount/DIME);
		JOptionPane.showMessageDialog(null, "The change in Nickle is " + amount/NICKLE);
		JOptionPane.showMessageDialog(null, "The change in Penny is " + amount/PENNY);
	}

}

// this is just practice i have to complete this using Git Bash. 