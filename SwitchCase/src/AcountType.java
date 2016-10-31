import javax.swing.JOptionPane;
public class AcountType {
	
	   public enum AccountType {Administrator, Student, Staff, Guest}
	 public static void main(String[] args) { 
	             AccountType[] choices = { AccountType.Administrator, AccountType.Student, AccountType.Staff, AccountType.Guest }; 
	             AccountType input = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type", 
	                                                                           JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 
	             while (input!=null) { 
	                      //Fill in switch case code below to check for account type and return appropriate Welcome message
	       JOptionPane.showMessageDialog(null, "Welcome " + input);
	  
	                      input = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type", 
	                                                                        JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
	      } 
	   }
	}
