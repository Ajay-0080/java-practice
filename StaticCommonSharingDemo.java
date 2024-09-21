class Test {
	
	static int no=0;
	Test() {
		no=no+10;
	}
	public void display() {
		System.out.println(no);
	}
}

public class StaticCommonSharingDemo {

	public static void main(String[] args) {
		Test obj1=new Test();
		obj1.display();
		Test obj2=new Test();
		obj2.display();
		Test obj3=new Test();
		obj3.display();
		obj1.display();

	}
}
