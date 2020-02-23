import java.util.ArrayList;

/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This class represents a generic teacher.
 * It contains simple fields, such as name and teachables.
 * 
 */

public class Teacher {

	public String name;
	public ArrayList<String> teachables = new ArrayList<String>();
	

	public Teacher(String nameIn, String teachablesIn) {
		name = nameIn;
		teachables = parseString(teachablesIn);
	}
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getTeachables(){
		return teachables;
	}
	
	
	
	// Helper method to convert string (of teachables, for example) into an arraylist of strings:
		public ArrayList<String> parseString(String stringIn){
			ArrayList<String> strings = new ArrayList<String>();
			
			// for each string listed in string, append it to strings arraylist:

			return strings;
		}
		
		// Helper method to convert string (of unavailabilities, for example) into an arraylist of dates:
		public ArrayList<Date> parseDate(String datesIn){
			ArrayList<Date> dates = new ArrayList<Date>();
			
			// for each date listed in string, append it to dates arraylist:
			
			return dates;
		}
		
		
		
		
		
}
