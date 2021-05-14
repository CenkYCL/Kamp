
public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setCustomerNumber("11");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);
		
		
		Student student = new Student();
		student.setId(2);
		student.setCustomerNumber("22");
		student.setFirstName("Cenk");
		student.setLastName("Y�cel");
		student.setStudentAdress("�stanbul");
		student.setStudentCourse("Java");		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(3);
		instructor.setCustomerNumber("33");
		instructor.setTeacherFirstName("Ali");
		instructor.setTeacherLastName("Mercan");
		instructor.setTeacherBranch("Bilgisayar Programc�l���");
		instructor.setTeacherAdress("�stanbul");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);

	}

}
