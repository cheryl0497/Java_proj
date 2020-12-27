package Hr;

import java.io.*;
import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
class Serialize {
	
	public static void main(String[] args) throws Exception {
		if(args.length > 0){
			var dept = new Department();
			dept.setTitle(args[0]);
			dept.addEmployee(4, 45000);
			dept.addEmployee(6, 65000);
			dept.addEmployee(5, 54000);
			dept.addEmployee(3, 32000);
			dept.addEmployee(2, 23000);
			var output = new ObjectOutputStream(new FileOutputStream("dept.dat"));
			output.writeObject(dept);
			output.close();
		}else{
			var input = new ObjectInputStream(new FileInputStream("dept.dat"));
			var dept = (Department)input.readObject();
			input.close();
			System.out.printf("Employees of %s department%n", dept.getTitle());
			for(var emp : dept.getEmployees())
				System.out.println(emp);
		}
	}
}
