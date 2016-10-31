import javax.swing.JOptionPane;
	public class Months 
	{ 
  
	
		public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
		
		public static void main(String[] args) 
		{ 
             Month[] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December}; 
            
             
             String winterMessage = "December – February: Do you want to build a snow man?";
             String springMessage = "March – May: Happy Spring days!";
             String summerMessage = "June – August: It’s a summer time.";
             String fallMessage = "September – November: Welcome to the foliage season!";
            
             Month input = (Month) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type",JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);   
			while (input != null) 
			{
				switch (input) 
				{
				case January:
					System.out.println(winterMessage);
					break;
				case February:
					System.out.println(winterMessage);
					break;
				case December:
					System.out.println(winterMessage);
					break;
				case March:
					System.out.println(springMessage);
					break;
				case April:
					System.out.println(springMessage);
					break;
				case May:
					System.out.println(springMessage);
					break;
				case June:
					System.out.println(summerMessage);
					break;
				case July:
					System.out.println(summerMessage);
					break;
				case August:
					System.out.println(summerMessage);
					break;
				default:
					System.out.println(fallMessage);
					break;
				}			
				 input = (Month) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type",JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);   
			}
			System.out.println("Good bye!"); 
      
   }
}
