import java.util.ArrayList;

public class SubTeacher extends Teacher{

	
	private ArrayList<Date> unavailabilities = new ArrayList<Date>();
	private ArrayList<Date> onCalls = new ArrayList<Date>();
	private ArrayList<Date> booked = new ArrayList<Date>();
	
	public SubTeacher(String nameIn, String teachablesIn, String unavailabilitiesIn, String onCallsIn, String bookedIn){
		
		super(nameIn, teachablesIn);
		
		teachables = parseString(teachablesIn);
		unavailabilities = parseDate(unavailabilitiesIn);
		onCalls = parseDate(onCallsIn);
		booked = parseDate(bookedIn);
	}
	
	public ArrayList<Date> getUnavailabilities(){
		return unavailabilities;
	}
	
	public ArrayList<Date> getOnCalls(){
		return onCalls;
	}
	
	public ArrayList<Date> getBooked(){
		return booked;
	}
	
	
	
	
}
