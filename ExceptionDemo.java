 class ExceptionDemo {

	public static void main(String[] args) {
		try {
			try {
				int data=100/2;
			}
			catch (ArithmeticException ae){
				ae.printStackTrace();
			}
			try {
				int [] arr=new int [5];
				arr[4]=7;
			}
			catch (ArrayIndexOutOfBoundsException ai) {
				ai.printStackTrace();
				
			}
			 String str = null;
			    System.out.println(str.length()); 
			
		}
		
        catch(Exception e) {
        	e.printStackTrace();
        }
		System.out.println("rest of the code");
	}

}
