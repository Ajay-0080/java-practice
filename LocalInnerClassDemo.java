class OuterDemo {
	
	public void display() {
		
		class InnerDemo{
			
			public void show(){
				System.out.println("i am in local class");
			}
		}
		
	   InnerDemo id = new InnerDemo();
		id.show();
	}
}
class LocalInnerClassDemo {

	public static void main(String[] args) {
		OuterDemo od = new OuterDemo();
		od.display();

	}

}
