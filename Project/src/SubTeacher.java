import java.util.ArrayList;

/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This class extends Teacher.java to include characteristics of an absent teacher.
 * 
 */

public class SubTeacher extends Teacher{

	private ArrayList<Date> unavailabilities = new ArrayList<Date>();
	private ArrayList<Date> onCalls = new ArrayList<Date>();
	private ArrayList<String> booked = new ArrayList<String>();
	private ArrayList<String> blacklist = new ArrayList<String>();
	
	public SubTeacher(String nameIn, String teachablesIn, String blacklistIn){
		
		super(nameIn, teachablesIn);
		blacklist = parseString(blacklistIn);
		
		//unavailabilities = parseDate(unavailabilitiesIn);
		//onCalls = parseDate(onCallsIn);
		//booked = parseDate(bookedIn);
	}
	
	public ArrayList<Date> getUnavailabilities(){
		return unavailabilities;
	}
	
	public ArrayList<Date> getOnCalls(){
		return onCalls;
	}
	
	public ArrayList<String> getBooked(){
		return booked;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
}
