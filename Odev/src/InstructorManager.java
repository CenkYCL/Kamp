
public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Say�n E�itmen " + instructor.getTeacherFirstName() + " " + instructor.getTeacherBranch() + " isimli dersiniz eklendi. �yi g�nler :)");
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Say�n E�itmen " + instructor.getTeacherFirstName() + " " + instructor.getTeacherBranch() + " isimli dersiniz silindi. �yi g�nler :)");
	}
	public void update(Instructor instructor) {
		System.out.println("Say�n E�itmen " + instructor.getTeacherFirstName() + " " + instructor.getTeacherBranch() + " isimli dersiniz g�ncellendi. �yi g�nler :)");
	}

}
