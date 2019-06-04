import java.io.Serializable;  
public class Student implements Serializable{  

	int id;  
	String name;
	String lastName;
	int age;
	String subject;
	char grade;

	public Student(int id, String name, String last_name, int age, String subject, char grade) {  

		this.id = id;  
		this.name = name; 
		this.lastName = last_name;
		this.age = age;
		this.subject = subject;
		this.grade = grade;
	}  
}
