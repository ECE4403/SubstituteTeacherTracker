import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.csv.*;

public class Driver {

	public static void main(String[] args) throws Exception {
		

		
		// Read input files:
		
CSVParser csvParser = new CSVParser(new FileReader("absences.csv"), CSVFormat.EXCEL.withFirstRecordAsHeader());
		
		// After constructed, we can loop through each row of the CSV file using a for-each loop
		// We access the data in each column using the corresponding column label
		for (CSVRecord record : csvParser) {
			String teacher = record.get("teacher");
			String date = record.get("date");
			String time = record.get("time");
			String school = record.get("school");
			
			System.out.println("CSV Record: " + teacher + " | " + date + " | " + time + " | " + school);

		}
				
		// Remember to close all input and output streams when you are done processing them
		csvParser.close();
				
				
			// Read absences.csv (each row is one absence that must be filled)
			// Read substitutes.csv (each row is one available substitute teacher)
		
		// For each absence, add a timeSlot object to the timeSlots arrayList:
		
		// For each substitute teacher, add a subTeacher object to the subTeachers arrayList:
		
		// For each timeSlot, identify a viable subTeacher and assign it to that timeSlot:
		//for(int i = 0; i < subTeachers.size(); i++) {
		//	assignRandomly(); // This will change when we're ready to assign subs based on preference, teachability, etc.
		//}
		
		
		
		
		
		
		
		
		// Write to output files:
		    // Write assignments.csv
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
