import java.io.*;  
class SerialTest2{  
	public static void main(String args[])throws Exception{  
		Student student = new Student(343,"Hikari", "Ogino", 10, "Literature", 'B');  

		FileOutputStream fos=new FileOutputStream("f.txt");  
		ObjectOutputStream oos=new ObjectOutputStream(fos);  

		oos.writeObject(student);  
		oos.flush();  
		System.out.println("Serialization Complete");  
	}  
}