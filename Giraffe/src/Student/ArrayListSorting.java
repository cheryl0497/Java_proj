package Student;
import java.util.*;

public class ArrayListSorting {

	public static void main(String args[])
	{
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student( "Chaitanya",223, 26));
		   arraylist.add(new Student( "Rahul", 234,24));
		   arraylist.add(new Student( "Ajeet",256, 32));
		   Collections.sort(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
		}
	}

