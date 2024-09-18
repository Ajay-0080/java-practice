abstract class Employee {
	int basic=20000;
	static String empCode="L01";
	
	public void calculateSalary() {
		System.out.println("basic = "+basic+" employee code = "+empCode);
	}
	
	public static void printCode(){
		System.out.println("employee code = "+empCode);
	}
	
	public abstract void doWork ();
}

class Accountant extends Employee {
	public void doWork() {
		System.out.println("account related activities");
	}
}

class Hr extends Employee {
	public void doWork() {
		System.out.println("hr related activities");
	}
}

public class LuminarEmployee {

	public static void main(String[] args) {
		Employee obj = new Accountant();
		obj.doWork();
		obj = new Hr();
		obj.doWork();
        Employee.printCode();
        obj.calculateSalary();
        
	}

}
