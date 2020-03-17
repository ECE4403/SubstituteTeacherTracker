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



public class AbsentTeacher{

	private String name;
	private String school;
	private String preferredSubs;
	private ArrayList<String> teachables = new ArrayList<String>();
	
	public AbsentTeacher(String nameIn, String teachablesIn, String schoolIn, String prefferedSubIn) {
		//super(nameIn, teachablesIn);
		name = nameIn;
		teachables = parseString(teachablesIn);
		school = schoolIn;
		preferredSubs = prefferedSubIn;
	}
	
	public String getPreferredSubs(){
		return preferredSubs;
	}
	
	public ArrayList<String> getTeachables(){
		return teachables;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSchool() {
		return school;
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

