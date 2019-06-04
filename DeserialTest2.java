import java.io.*;  
class DeserialTest2{  
	public static void main(String args[])throws Exception{  

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f.txt"));  
		Student s=(Student)ois.readObject();  
		System.out.println(s.id + " " + s.name + " " + s.subject);  

		ois.close();  
	}  
}
