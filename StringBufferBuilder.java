 class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		StringBuffer sb1= new StringBuffer(4);
	    System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		sb1.append("javac");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		

	}

}
