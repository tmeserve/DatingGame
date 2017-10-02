package datingGame;

public class MyDate implements DateInterface
{
	static int year;
	static int month;
	static int day;
	static int doWeek;
	static String[] dows = {"Sunday","Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
	static String[] mont = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	
	public int getDay()
	{
		return day;
	}

	public int getDow()
	{
		
		return doWeek;
	}

	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}

	public void set(int m, int d, int y, int dow)
	{
		month = m;
		day = d;
		year = y;
		doWeek = dow;
	}

	public void tomorrow()
	{
		day++;
		doWeek++;
		if (day > 31)
		{
			month++;
			day = 1;
		}
		if (month > 11)
		{
			year++;
			month = 0;
		}
		if (doWeek > 6)
		{
			doWeek = 0;
		}
	}

	public void today()
	{
		
	}

	public void yesterday()
	{
		day--;
		doWeek--;
		if (day < 1)
		{
			month--;
			day = 31;
		}
		if (month < 0)
		{
			year--;
			month = 11;
		}
		if (doWeek < 0)
		{
			doWeek = 6;
			
		}
	}
	
	public String toString()
	{
		return dows[doWeek] + " " + mont[month] + " " + day + ", " + year;
	}
}
