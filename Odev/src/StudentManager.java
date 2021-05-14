
public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Sevgili Öğrencimiz " +student.getFirstName() + "," + student.getStudentCourse() + " İsimli Kursa Kayıt Oldunuz");
		
}
	
	public void delete(Student student) {
		System.out.println("Sevgili Öğrencimiz" +student.getFirstName() + "," + student.getStudentCourse() + " İsimli Kursu Sildiniz");
	
	

}
	public void update(Student student) {
		System.out.println("Sevgili Öğrencimiz" +student.getFirstName() + "," + student.getStudentCourse() + " İsimli Kursu Güncellendiniz");
	
	

}
}
