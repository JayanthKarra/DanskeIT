package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class EmployeeObjectOutputStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee employee = new Employee(101,"Alisa", 345435.5f);
		
		// Serializing Employee
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);
		
		
		 // De-serializing Employee
		 FileInputStream fis = new FileInputStream("emp.txt");
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 Employee employeeGet = (Employee)ois.readObject(); // down-casting object

		 System.out.println(employeeGet.getEmpNo() + " "+ employeeGet.getName()+" " + employeeGet.getSalary());
		
	}

}
