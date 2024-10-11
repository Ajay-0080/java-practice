
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectSerialization {// serialization is important

	public static void main(String[] args) {
		int roll;
		int empId;
		String empName;
		Scanner sc = new Scanner(System.in);
		List <Employee> employees = new ArrayList<Employee>();
		try {
			
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Luminar\\employee.txt"));
			for(int i=1;i<=2;i++) {
				System.out.println("enter roll num");
				roll=sc.nextInt();
				System.out.println("enter empid");
				empId=sc.nextInt();
				sc.nextLine();
				System.out.println("enter emp name");
				empName=sc.nextLine();
				employees.add(new Employee(roll,empId,empName));
				
			}
			os.writeObject(employees);
			os.flush();
			os.close();
			sc.close();
		}
		catch (IOException  ie) {
			ie.printStackTrace();
		}

	}

}
