class ThreadDemo extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			
			 try {
				 Thread.sleep(2000); 
	         } 
			 catch (InterruptedException ie) {
	        	                             
				 ie.printStackTrace();
	          }
	      }
	}

	public static void main(String[] args) {
		
        ThreadDemo td = new ThreadDemo();
        td.start();
	}

}
