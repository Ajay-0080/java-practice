class Customer {
	int balance=10000;
	public synchronized void withdraw(int amount) {
		System.out.println("withdraw....");
		if(balance<amount) {
			try {
				wait();
				
			}
			catch( InterruptedException ie)   {
				ie.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("withdraw compelted amount...");
	}
	public synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		balance += amount;
		notify();
		System.out.println("deposited");
	}
	
}


 class InterThreadCommunication {

	public static void main(String[] args) {
		Customer c = new Customer();
		
         new Thread() {
        	 public void run() {
        		 c.withdraw(15000);
        	 }
         }.start();
         new Thread() {
        	 public void run() {
        		 c.deposit(15000);
        	 }
         }.start();
	}

}
