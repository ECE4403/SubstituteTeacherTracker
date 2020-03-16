import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This class extends Teacher.java to include characteristics of an absent teacher.
 * 
 */

public class SubTeacher{

	private String name;
	private ArrayList<String> unavailabilities = new ArrayList<String>();
	private ArrayList<String> onCalls = new ArrayList<String>();
	private ArrayList<String> booked = new ArrayList<String>();
	private ArrayList<String> blacklist = new ArrayList<String>();
	private ArrayList<String> teachables = new ArrayList<String>();
	public SubTeacher(String nameIn, String teachablesIn, String blacklistIn, ArrayList<String> unavailabilitiesIn){
		
		//super(nameIn, teachablesIn);
		name = nameIn;
		teachables = parseString(teachablesIn);
		
		blacklist = parseString(blacklistIn);
		
		unavailabilities = unavailabilitiesIn; //TODO
		//onCalls = parseDate(onCallsIn);
		//booked = parseDate(bookedIn);
	}
	

	public ArrayList<String> getTeachables(){
		return teachables;
	}
	
	public ArrayList<String> getUnavailabilities(){
		return unavailabilities;
	}
	
	public ArrayList<String> getOnCalls(){
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
	
	public String toString() {
		return name + teachables;
	}
	
	// Helper method to convert string (of teachables, for example) into an arraylist of strings:
    public ArrayList<String> parseString(String stringIn){	
    	ArrayList<String> stringList = new ArrayList<String>();		
    	Scanner scan = new Scanner(stringIn);
    	while(scan.hasNext())  {      
    		stringList.add(scan.nextLine());		
    	}
    	scan.close();	
        // for each string listed in string, append it to strings arraylist: 		
        return stringList; 	
    }

}
