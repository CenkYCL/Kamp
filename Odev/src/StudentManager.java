
public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Sevgili ��rencimiz " +student.getFirstName() + "," + student.getStudentCourse() + " �simli Kursa Kay�t Oldunuz");
		
}
	
	public void delete(Student student) {
		System.out.println("Sevgili ��rencimiz" +student.getFirstName() + "," + student.getStudentCourse() + " �simli Kursu Sildiniz");
	
	

}
	public void update(Student student) {
		System.out.println("Sevgili ��rencimiz" +student.getFirstName() + "," + student.getStudentCourse() + " �simli Kursu G�ncellendiniz");
	
	

}
}
