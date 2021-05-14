
public class Student extends User{
	
	
	private String firstName;
	private String lastName;
	private String studentCourse;
	private String studentAdress;
	
	
	public Student() {
		
	}
	
	public Student(String lastName, String firstName, String studentCourse, String studentAdress) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentCourse = studentCourse;
		this.studentAdress = studentAdress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	
}
