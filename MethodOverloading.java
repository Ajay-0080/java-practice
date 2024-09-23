class Employee {
	
	public void sum(int a) {
		System.out.println("a = "+a);
	}
	public void sum(int a, int b) {
		System.out.println("a = "+a+" b = "+b);
	}
	public void sum(int a,int b, String name) {
		System.out.println("a = "+a+" b = "+b+" name= "+name);
	}
	public void sum(int a,float b, String name) {
		System.out.println("b = "+b+" a = "+a+" name= "+name);
	}
	public void sum(String name,int a, float b) {
		System.out.println("name = "+name+" b = "+b+" a = "+a);
	}
	
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.sum(10);
		obj.sum(10,20);
		obj.sum(10,20,"ajay");
		obj.sum(20,10.5f,"ajay");
		obj.sum("ajay",20,15.45f);

	}

}
