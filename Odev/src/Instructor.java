
public class Instructor extends User{
	
	private String teacherFirstName;
	private String teacherLastName;
	private String teacherAdress;
	private String teacherBranch;
	
	public Instructor() {
		
	}
	
	public Instructor(String teacherFirstName, String teacherLastName, String teacherAdress, String teacherBranch) {
		
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.teacherAdress = teacherAdress;
		this.teacherBranch = teacherBranch;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}

	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}

	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}

	public String getTeacherAdress() {
		return teacherAdress;
	}

	public void setTeacherAdress(String teacherAdress) {
		this.teacherAdress = teacherAdress;
	}

	public String getTeacherBranch() {
		return teacherBranch;
	}

	public void setTeacherBranch(String teacherBranch) {
		this.teacherBranch = teacherBranch;
	}

}
