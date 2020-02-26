import java.util.ArrayList;

/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This class extends Teacher.java to include characteristics of an absent teacher.
 * 
 */

public class AbsentTeacher extends Teacher{

	private String school;
	private ArrayList<String> preferredSubs = new ArrayList<String>();
	
	public AbsentTeacher(String nameIn, String teachablesIn, String schoolIn) {
		super(nameIn, teachablesIn);
		school = schoolIn;
		//preferredSubs = parseString(preferredSubsIn);
	}
	
	public ArrayList<String> getPreferredSubs(){
		return preferredSubs;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSchool() {
		return school;
	}
}
