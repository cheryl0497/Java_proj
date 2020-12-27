package Serializable;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialize {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.setRno(101);
		s1.setName("Cheryl");
		
		Student s2= new Student();
		s2.setRno(102);
		s2.setName("Carol");
		
		Student s3= new Student();
		s3.setRno(103);
		s3.setName("Anitha");
		
		List<Student>s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
	        try
	        {
	            
	            FileOutputStream fos = new FileOutputStream("student.txt");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(s);
	            oos.flush();
	            oos.close();
	        }
	        catch (Exception e)
	        {
	            System.out.println(e);
	        }
	    }

}
