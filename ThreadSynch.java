class ResourceDemo {
    synchronized public void print(String str) {
        for(int i=0;i<5;i++) {
            System.out.println(str+" "+i);
            try {
            Thread.sleep(400);
            }
            catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
class ThreadOne extends Thread 
{
    ResourceDemo resource;
    public ThreadOne(ResourceDemo resource) {
        this.resource=resource;
    }
    public void run () {
        resource.print("in thread one");

    }
}
class ThreadTwo extends Thread 
{
    ResourceDemo resource;
    public ThreadTwo(ResourceDemo resource) {
        this.resource=resource;
    }
    public void run () {
        resource.print("in thread two");

    }
}
class ThreadThree extends Thread 
{
    ResourceDemo resource;
    public ThreadThree(ResourceDemo resource) {
        this.resource=resource;
    }
    public void run () {
        resource.print("in thread three");

    }
}
class ThreadSynch {
    public static void main(String [] args) {

        ResourceDemo resource = new ResourceDemo();
        ThreadOne one = new ThreadOne(resource);
        ThreadTwo two = new ThreadTwo(resource);
        ThreadThree three = new ThreadThree(resource);
        one.start();
        two.start();
        three.start();


    }
}