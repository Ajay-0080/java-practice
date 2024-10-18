class OuterClass {
	
	void print() {
		System.out.println("in outer class print method");
	}
	 class InnerClass {
		void print() {
			System.out.println("in inner class print method");
		}
	}
			
}
	
class OuterInnerClass {
	
	public static void main(String [] args) {
		OuterClass out = new OuterClass();
		out.print();
		OuterClass.InnerClass oic = out.new InnerClass();
		oic.print();
				
			
    }
}
	