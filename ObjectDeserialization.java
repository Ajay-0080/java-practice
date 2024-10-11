import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectDeserialization {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Luminar\\employee.txt"));
	        @SuppressWarnings("unchecked")
			List<Employee> employees=(ArrayList<Employee>)ois.readObject();
            for(Employee emp: employees) {	
            	System.out.println(emp.roll+" "+emp.empId+" "+emp.empName);
            }
	
		
		    ois.close();
		}
		catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
