import java.util.ArrayList;

public class AbsentTeacher extends Teacher{

	private ArrayList<Date> extendedAbsences = new ArrayList<Date>();
	private ArrayList<String> preferredSubs = new ArrayList<String>();
	
	public AbsentTeacher(String nameIn, String teachablesIn, String extendedAbsencesIn, String preferredSubsIn) {
		name = nameIn;
		teachables = parseString(teachablesIn);
		extendedAbsences = parseDate(extendedAbsencesIn);
		preferredSubs = parseString(preferredSubsIn);
	}
	
	
}
