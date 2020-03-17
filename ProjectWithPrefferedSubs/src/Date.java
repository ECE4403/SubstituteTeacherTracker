/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This class represents a single simple date.
 * 
 */
public class Date {

	private int year;
	private int month;
	private int day;
	private String time;
	
	public Date(int yearIn, int monthIn, int dayIn, String timeIn) {
		year = yearIn;
		month = monthIn;
		day = dayIn;
		time = timeIn;
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
	
	public String getTime() {
		return time;
	}
	
	public String getDate() {
		return Integer.toString(year) + ":" + Integer.toString(month) + ":" + Integer.toString(day) + ":" + time;
	}
	
	
	
	
	
	
}

