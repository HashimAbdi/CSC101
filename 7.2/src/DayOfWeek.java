
public class DayOfWeek {

	public static void main(String[] args) {
		Day d = new Day(2);
		
		d.setDay(7);
		
		System.out.println(d.addDays(-4));
		
		System.out.println(d.previousDay());
		
		System.out.println(d.getDay());

	}

}
