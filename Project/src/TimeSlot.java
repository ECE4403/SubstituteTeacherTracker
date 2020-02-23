
/**
 * 
 * @author Ian Crossley
 * @author Ryan Marino
 * 
 * This class represents one "time slot" - i.e. a single absence period that must be filled by a substitute.
 * It contains details about when (slotDate), where (schoolName), and for whom (absentTeacher) the time slot exists.
 * When one is eventually chosen, a substitute teacher can also be stored (in subTeacher).
 * 
 * 
 */

public class TimeSlot {
	
	// Date for this time slot (YYYY-MM-DD):
	//private Date slotDate;
	private String slotDate;
	private AbsentTeacher absentTeacher;
	private SubTeacher subTeacher;
	private String schoolName;
	
	// Constructor:
	public TimeSlot(String slotDateIn, AbsentTeacher absentTeacherIn){
		slotDate = slotDateIn;
		absentTeacher = absentTeacherIn;
	}
	
	public String getSlotDate() {
		return slotDate;
	}
	public void setDate(String dateIn) {
		slotDate = dateIn;
	}
	
	public void setAbsentTeacher(AbsentTeacher absentTeacherIn) {
		absentTeacher = absentTeacherIn;
	}
	
	public AbsentTeacher getAbsentTeacher() {
		return absentTeacher;
	}
	
	public void setSubTeacher(SubTeacher subTeacherIn) {
		subTeacher = subTeacherIn;
	}
	
	public SubTeacher getSubTeacher() {
		return subTeacher;
	}
	
	public void setSchoolName(String schoolNameIn) {
		schoolName = schoolNameIn;
	}
	
	public void getTimeSlot() {
		System.out.println("Time slot: " + slotDate + " | " + absentTeacher.getName() + " | " + subTeacher.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
