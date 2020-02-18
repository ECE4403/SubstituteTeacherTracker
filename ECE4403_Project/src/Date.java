
public class Date {

	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	
	public Date(int yearIn, int monthIn, int dayIn, int hourIn, int minuteIn) {
		year = yearIn;
		month = monthIn;
		day = dayIn;
		hour = hourIn;
		minute = minuteIn;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public String getDate() {
		return Integer.toString(year) + ":" + Integer.toString(month) + ":" + Integer.toString(day) + ":" + Integer.toString(hour) + ":" + Integer.toString(minute);
	}
	
	
	
	
	
	
}

