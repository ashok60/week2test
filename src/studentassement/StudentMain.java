package studentassement;
import java.util.*;

public class StudentMain {
	private Set<Student> set = new HashSet<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {
		set.add(new Student("kk66", 67));
		set.add(new Student("ck97", 56));
		set.add(new Student("bk67", 42));
		set.add(new Student("ak47", 23));
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