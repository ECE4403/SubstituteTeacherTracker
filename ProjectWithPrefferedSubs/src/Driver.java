import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.csv.*;

/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This top-level program reads a .csv list of teacher absences (absences.csv)
 * and a .csv list of substitute teachers (substitutes.csv). It then assigns a
 * substitute teacher to each absence, and generates a .csv list of assignments
 * (assignments.csv)
 * 
 */

// Note: many lines are currently commented out - these were written before we knew the input .csv file formats.
// I have kept them simply to remind us where additional functionality may be added
public class Driver {

	public static void main(String[] args) throws Exception {
		
		Sorter sorter = new Sorter(); // Sorter object can perform various useful functions
		
		ArrayList<TimeSlot> timeSlotList = new ArrayList<TimeSlot>();       // Array list of all timeSlots
		ArrayList<SubTeacher> subTeacherList = new ArrayList<SubTeacher>(); // Array list of all subTeachers
		
		// Note: No absentTeacherList is needed - absent teachers are stored as fields in timeSlot objects
		
        // Read absences.csv (each row contains one absence that must be filled):
		CSVParser csvParser = new CSVParser(new FileReader("absences.csv"), CSVFormat.EXCEL.withFirstRecordAsHeader());
		
		for (CSVRecord record : csvParser) {
			
			String date = record.get("date");
			String time = record.get("period");
			String name = record.get("teacher");
			String teachables = record.get("teachables");
			String preferredSub = record.get("preffered"); 
			String school = record.get("location");
			
			// Add the new time slot to timeSlotList:
			timeSlotList.add(new TimeSlot(sorter.parseDate(date, time), new AbsentTeacher(name, teachables, school, preferredSub),school));
		
		}
		
		csvParser.close();
		
		System.out.println("Number of absences: " + timeSlotList.size());
			
		
		// Read substitutes.csv (each row contains one available substitute teacher):
        CSVParser subParser = new CSVParser(new FileReader("substitutes.csv"), CSVFormat.EXCEL.withFirstRecordAsHeader());
		
		for (CSVRecord record : subParser) {
			CSVParser unavailParser = new CSVParser(new FileReader("unavailabilites.csv"), CSVFormat.EXCEL.withFirstRecordAsHeader());	
			String name = record.get("name");
			String teachables = record.get("teachables");
			
			System.out.println(name);
			System.out.println(teachables);
			
			String blacklist = record.get("blacklist");
			ArrayList<String> unavailabilities = new ArrayList<String>(); //1 unavailabilities list per subParser record
			

			for(CSVRecord record2: unavailParser) { //search for name match
				String date = record2.get("date");
				String time = record2.get("period");
				String substitute = record2.get("substitute");
				
				
				if(name.equals(substitute)) {
					unavailabilities.add(sorter.parseDate(date,time));
				}			
			} //end of unavailability for-each loop
			
			
			//String onCalls = record.get("onCalls");
			//String bookings = "bookings";
			
			subTeacherList.add(new SubTeacher(name, teachables, blacklist, unavailabilities)); // Add teacher to array list
			unavailParser.close();
			
		}
		subParser.close();
		
		//System.out.println(subTeacherList.toString());
		
		//System.out.println("Number of substitutes: " + subTeacherList.size());
		
		
		// For each timeSlot, identify a viable subTeacher and assign it to that timeSlot:
		for(TimeSlot ts : timeSlotList) {
			
			SubTeacher st; // Temp variable to store subTeacher object

			// Note: this is where we will put other subTeacher selecting methods, like chooseByPreferred()

			do {
				System.out.println("");
				System.out.println("Choosing for: " + ts.getAbsentTeacher().getName());
				st = sorter.chooseByPreffered(subTeacherList, ts);
			} while(sorter.scheduleConflict(st, ts)); // Try again and pick a new st if the last one's bookings conflict //This will be changed later.
			
			ts.setSubTeacher(st); // Set subTeacher for this timeSlot 
		}
		
		// Write to assignments.csv:

        CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("assignments.csv"), CSVFormat.EXCEL.withHeader("Absent Teacher Name", "Time Slot", "School", "Substitute Teacher Chosen", "Email Message"));
        
        // Print a line for each time slot:
        for(TimeSlot ts : timeSlotList) {
        	csvPrinter.printRecord(ts.getAbsentTeacher().getName(), ts.getSlotDate(), ts.getAbsentTeacher().getSchool(), ts.getSubTeacher().getName(), ts.generateEmail());
        }
		
		csvPrinter.close();
		
	} // End of main()
	
} // End of Driver.java
