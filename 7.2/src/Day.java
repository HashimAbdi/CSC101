import javax.swing.JOptionPane;


public class Day 
{
	public enum Days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
		
	//instance variables
	Days day; 
	int dayNumber;
	
	
	// default constructor sets day to Monday
	public Day()
	{
		day = Days.Monday;
		dayNumber = getNumberFromDay(day);
	}
	
	public Day(Days d)
	{
		day = d;
		dayNumber = getNumberFromDay(day);
	}
	
	public Day(int n)
	{
		dayNumber = n;
		day = getDayFromNumber(dayNumber);
	}
	
	// convert number to it's day equivalent
	private Days getDayFromNumber(int number)
	{
		Days day = Days.Monday;
		switch(number){
		case 1: 
			day = Days.Monday;
			break;
		case 2: 
			day = Days.Tuesday;
			break;
		case 3: 
			day = Days.Wednesday;
			break;
		case 4:
			day = Days.Thursday;
			break;
		case 5:
			day = Days.Friday;
			break;
		case 6:
			day = Days.Saturday;
			break;
		default:
			day = Days.Sunday;
		}
		return day;
	}

	// convert a Day into it's equivalent number
	private int getNumberFromDay(Days day)
	{
		int num = 1;
		switch(day){
		case Monday: 
			num = 1;
			break;
		case Tuesday: 
			num = 2;
			break;
		case Wednesday: 
			num = 3;
			break;
		case Thursday:
			num = 4;
			break;
		case Friday:
			num = 5;
			break;
		case Saturday:
			num = 6;
			break;
		default:
			num = 7;
		}
		return num;
	}

	// adds number of days to current day and returns the resulting day
	public Days addDays(int number)
	{
		if(number > 7)
		{
			number = number%7;
		}
		
		// add current days number to number
		number += dayNumber;
		
		if(number > 7)
		{
			number = number%7;
		}
		
		return getDayFromNumber(number);
		
	}

	// get previous day
	public Days previousDay()
	{
		if(dayNumber > 1)
		{
			return getDayFromNumber(dayNumber -1 );
		}
		else
		{
			return getDayFromNumber(7);
		}
	}

	public Days getDay()
	{
		return day;
	}
	
	public void setDay(int n)
	{
		dayNumber = n;
		day = getDayFromNumber(dayNumber);
	}
	
}
	
