
public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Sayýn Eðitmen " + instructor.getTeacherFirstName() + " " + instructor.getTeacherBranch() + " isimli dersiniz eklendi. Ýyi günler :)");
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Sayýn Eðitmen " + instructor.getTeacherFirstName() + " " + instructor.getTeacherBranch() + " isimli dersiniz silindi. Ýyi günler :)");
	}
	public void update(Instructor instructor) {
		System.out.println("Sayýn Eðitmen " + instructor.getTeacherFirstName() + " " + instructor.getTeacherBranch() + " isimli dersiniz güncellendi. Ýyi günler :)");
	}

}
