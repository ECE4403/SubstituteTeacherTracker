import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Ian Crossley
 * @author 
 * 
 * This class contains various sorting methods (like choose randomly, choose by preferred teachers, etc.)
 * and other relevant functions (like checking for schedule conflicts, checking school blacklists, etc.)
 *
 */
public class Sorter {

	// Choose a random subTeacher from arrayList stArray:
	public SubTeacher chooseRandomly(ArrayList<SubTeacher> stArray) {
		
		// Configure max index values:
		int max = stArray.size(); // max = number of subTeachers
		// Choose random index number, rn, between 0 and max:
		Random r = new Random();
		int rn = r.nextInt(max);
		// Return subTeacher element at inxex rn:
		return stArray.get(rn);
		
	}
	
	// Choose a random subTeacher from arrayList stArray:
		public SubTeacher chooseByTeachables(ArrayList<SubTeacher> stArray, TimeSlot ts) {
			
			SubTeacher finalSt = stArray.get(0);
			int lastRank = 0;
			
			for(SubTeacher st : stArray) { // For each sub teacher:
				System.out.println("");
				System.out.println("Comparing: " + st.getName());
				int rank = 0;
				//System.out.println(st.getTeachables());
				
				for(String subTeachable : st.getTeachables()) { // Consider sub's teachables:
					
					for(String absTeachable : ts.getAbsentTeacher().getTeachables()) { // For the absent teacher's teachable:
						System.out.println("comparing " + subTeachable + " and " + absTeachable);
						
						if(subTeachable.equals(absTeachable)) {
							System.out.println("Match!");
							rank++;
							System.out.println(rank);
						}
						
					} 
					
				}
				if(rank > lastRank) {
					System.out.println("Choosing by teachables!");
					finalSt = st;
				}else {
					System.out.println("Choosing randomly!");
					finalSt = chooseRandomly(stArray);
				}
				
			
				
			}
			return finalSt;
			
		}
	
	public SubTeacher chooseByPreffered(ArrayList<SubTeacher> stArray, TimeSlot ts) {
		int flag = 0;
		SubTeacher chosenST = chooseRandomly(stArray);
		for(SubTeacher st : stArray) {
			if(ts.getAbsentTeacher().getPreferredSubs().equals(st.getName())) {
				chosenST = st;
				flag=1;
			}
		}
		
		return chosenST;
	}
	
	
	
	
	
	
	
	

	// Determine if there is a scheduling conflict between a particular subTeacher's bookings
	// and a new time slot:
    public boolean scheduleConflict(SubTeacher st, TimeSlot ts) {
    	boolean flag = false; // Assume there won't be conflict by default
    	
    	// Compare each previously booked date to the new one:
    	for(String date : st.getBooked()) {
    		if(date == ts.getSlotDate()){ // If there is a conflict:
    			flag = true; // Change flag status
    		}
    	}
    	for(String date : st.getUnavailabilities()) {
    		if(date.equals(ts.getSlotDate())){ // If there is a conflict:
    			flag = true; // Change flag status
    		}
    		if(date.equals(st.getUnavailabilities())) {
    			flag = true;
    		}
    	}
    	
    	return flag; // false = no conflict, true = conflict
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
		

    //public Date parseDate(String dateIn, String timeIn) {
    public String parseDate(String dateIn, String timeIn) {
		
    	int year;
    	int month;
    	int day;
    	
    	// Parse month:
		if(dateIn.toLowerCase().contains("jan")) {
			month = 1;
		}else if(dateIn.toLowerCase().contains("feb")) {
			month = 2;
		}else if(dateIn.toLowerCase().contains("mar")) {
			month = 3;
		}else if(dateIn.toLowerCase().contains("apr")) {
			month = 4;
		}else if(dateIn.toLowerCase().contains("may")) {
			month = 5;
		}else if(dateIn.toLowerCase().contains("jun")) {
			month = 6;
		}else if(dateIn.toLowerCase().contains("jul")) {
			month = 7;
		}else if(dateIn.toLowerCase().contains("aug")) {
			month = 8;
		}else if(dateIn.toLowerCase().contains("sep")) {
			month = 9;
		}else if(dateIn.toLowerCase().contains("oct")) {
			month = 10;
		}else if(dateIn.toLowerCase().contains("nov")) {
			month = 11;
		}else if(dateIn.toLowerCase().contains("dec")) {
			month = 12;
		}else {
			month = 0;
		}
		
		// Parse day:
		

		
		
		
		
		//return new Date(yearIn, monthIn, dayIn, hourIn, minuteIn);
		return dateIn + " in the " + timeIn;
	}


	
	
}