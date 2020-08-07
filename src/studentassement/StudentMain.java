package studentassement;
import java.util.*;

public class StudentMain {
	private Set<Student> set = new HashSet<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {
		set.add(new Student("a1", 23));
		set.add(new Student("b2", 21));
		set.add(new Student("c3", 20));
		set.add(new Student("d4", 22));
		List<Student> list = changedlist(set);
	}

	public List<Student> changedlist(Set<Student> set) {
		List<Student> list = new ArrayList<>();
		for (Student student : set) {
			if (student.getAge() > 21) {
				list.add(student);
			}
		}
		return list;
	}
}