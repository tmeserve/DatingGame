package datingGame;

public class MyDate implements DateInterface
{
	static int year = 0;
	static int month = 0;
	static int day = 0;
	static int dow = 0;
	static String[] dows;
	static String[] mont;
	
	public MyDate()
	{
		
	}
	
	public int getDay()
	{
		return day;
	}

	public int getDow()
	{
		if (dow == 0)
		{
			dows[0] = "Sunday";
		}
		else if (dow == 1)
		{
			dows[1] = "Monday";
		}
		else if (dow == 2)
		{
			dows[2] = "Tuesday";
		}
		else if (dow == 3)
		{
			dows[3] = "Wedensday";
		}
		else if (dow == 4)
		{
			dows[4] = "Thursday";
		}
		else if (dow == 5)
		{
			dows[5] = "Friday";
		}
		else if (dow == 6)
		{
			dows[6] = "Saturday";
		}
		return ;
	}

	public int getMonth()
	{
		if (month == 1)
		{
			mont[0] = "January";
		}
		else if (month == 2)
		{
			mont[1] = "February";
		}
		else if (month == 3)
		{
			mont[2] = "March";
		}
		else if (month == 4)
		{
			mont[3] = "April";
		}
		else if(month == 5)
		{
			mont[4] = "May";
		}
		else if (month == 6)
		{
			mont[5] = "June";
		}
		else if (month == 7)
		{
			mont[6] = "July";
		}
		else if (month == 8)
		{
			mont[7] = "August";
		}
		else if (month == 9)
		{
			mont[8] = "September";
		}
		else if (month == 10)
		{
			mont[9] = "October";
		}
		else if (month == 11)
		{
			mont[10] = "November";
		}
		else if (month == 12)
		{
			mont[11] = "December";
		}
		return month;
	}
	
	public int getYear()
	{
		return year;
	}

	public void set(int m, int d, int y, int dow)
	{
		m = month;
		d = day;
		y = year;
		dow = getDow();
	}

	public void tomorrow()
	{
		day++;
		dow++;
		if (day > 31)
		{
			month++;
			day = 1;
		}
		else if (month > 12)
		{
			year++;
			month = 1;
		}
		else if (dow > 6)
		{
			dow = 0;
		}
	}

	public void today()
	{
		
	}

	public void yesterday()
	{
		
	}
	
	public String toString()
	{
		return dows[] + mont[] + day + year;
	}
}
