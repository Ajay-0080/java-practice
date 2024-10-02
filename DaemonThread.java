class DaemonThread extends Thread {

    public DaemonThread (String str) {
        super(str);
    }
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName()+" is a daemon thread");
        }
        else {
            System.out.println(getName()+" is a user thread");
        }
        
    }

    public static void main(String [] args) {
        DaemonThread one = new  DaemonThread ("jenny");
        DaemonThread two = new  DaemonThread ("khatri");
        one.setDaemon(true);
        one.start();
        two.start();

    }
    
}
