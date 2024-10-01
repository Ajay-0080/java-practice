class Infosys{
	public static synchronized void recruitment(String name, int counterNo) {
		System.out.println(name+" "+"please visit counter number "+counterNo);
		
	}
}
class A extends Thread {
	public void run() {
		Infosys.recruitment("class a",2);
	}
	
	
}
class B extends Thread {
	public void run() {
		Infosys.recruitment("class b",4);
	}
	
	
}
class C extends Thread {
	public void run() {
		Infosys.recruitment("class c",6);
	}
	
	
}
class D extends Thread {
	public void run() {
		Infosys.recruitment("class d",8);
	}
}
class StaticSynchDemo {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		a.start();
		b.start();
		c.start();
		d.start();
		

	}

}
