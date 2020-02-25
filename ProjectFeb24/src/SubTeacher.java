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

	private ArrayList<String> unavailabilities = new ArrayList<String>();
	private ArrayList<Date> onCalls = new ArrayList<Date>();
	private ArrayList<String> booked = new ArrayList<String>();
	private ArrayList<String> blacklist = new ArrayList<String>();
	
	public SubTeacher(String nameIn, String teachablesIn, String blacklistIn, ArrayList<String> unavailabilitiesIn){
		
		super(nameIn, teachablesIn);
		blacklist = parseString(blacklistIn);
		
		unavailabilities = unavailabilitiesIn; //TODO
		//onCalls = parseDate(onCallsIn);
		//booked = parseDate(bookedIn);
	}
	
	public ArrayList<String> getUnavailabilities(){
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
	
	public void addUnavailabilites(String unavailabilitiesIn) {
		unavailabilities.add(unavailabilitiesIn);
	}
	
	
}
