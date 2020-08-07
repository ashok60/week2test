package studentassement;
import java.util.*;








public class StudentsMain  {	
	
	Set<Student> set=new HashSet<Student>();
	
	public static void main(String[] args) {
		
	
	StudentsMain demo= new StudentsMain();
	demo.runApp();
	
	}

public void runApp() {	
	try {
		if (Age<21){
			throw new AgeException();
		}		
	Student student1=new Student("Z21",21);
	set.add(student1);
	
	Student student2=new Student("Z11",69);
	set.add(student2);
	
	Student student3=new Student("Z33",32);
	set.add(student3);
	
	Student student4=new Student("Z43",65);
	set.add(student4);
	
	
	Iterator<Student> iterator=set.iterator();
	
	while(iterator.hasNext()) {
		Student student=iterator.next();
		System.out.println("Age="+student.getAge()+" "+"Rollno"+student.getRollno());
		
	
	catch (AgeException e){
		System.out.println(e);
	}
	}