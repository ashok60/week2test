package studentassement;
import java.util.*;
public class StudentMain{
void validate (int age) throws AgeException {
	if (age<21){
		throws new AgeException();
	}
}


public static void main(String [] args) {
	
	Set<Student> hset = new HashSet<>();
	Set<Student> hset1 = new HashSet<>();
	Student s1 = new Student("101",20);
	Student s2 = new Student("102,21);
	Student s3 = new Student("103",24);
	hset.add(s1);
	hset.add(s2);
	hset.add(s3);
	
	System.out.println("Students List");
	for(Student s:hset){
		try {
			System.out.println("Rollno "+s.getRollno()+" Age: "+s.getAge());
			StudentMain ob = new StudentMain();
			ob.validate(age);
			hset1.add(s);
		}
		catch (AgeException e){
			System.out.println(e);
		}		
			
	}
	System.out.println("Students with Age greater than or equal to 21 ");
	for(Student s:hset1){
		System.out.println(" Rollno "+s.getrollno()+" Age: "+s.getAge());
	}
	
}