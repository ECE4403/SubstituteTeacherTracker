import java.util.ArrayList;

public class AbsentTeacher extends Teacher{

	private ArrayList<Date> extendedAbsences = new ArrayList<Date>();
	private ArrayList<String> preferredSubs = new ArrayList<String>();
	
	public AbsentTeacher(String nameIn, String teachablesIn, String extendedAbsencesIn, String preferredSubsIn) {
		super(nameIn, teachablesIn);
		extendedAbsences = parseDate(extendedAbsencesIn);
		preferredSubs = parseString(preferredSubsIn);
	}
	
	public ArrayList<Date> getExtendedAbsences(){
		return extendedAbsences;
	}
	
	public ArrayList<String> getPreferredSubs(){
		return preferredSubs;
	}
	
}
