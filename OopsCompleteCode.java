class Tata {
    void enquiry() {
        System.out.println("enquired about tata cars");
    }
}
class Tiago extends Tata{
    void enquiry() {
        System.out.println("enquired about tata tiago models");
    }
    int quote(int amount, int disc) {
        return amount-disc;
    }
    double quote(double amount, double disc) {
        return amount-disc;
    }

} 
class Owner {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
abstract class TestDrive {
    abstract void run();
    void preBooked() {
        System.out.println("pre booked for test drive");
    }
}
class Test extends TestDrive {
    void run(){
        System.out.println("test drive conducted succeesfully");
    }
}

interface VehiclePollution {
   int noYear=15;
     void pollutionCertificate();
}
interface VehicleTax {
    
    void tax();
}
class RCBook implements VehiclePollution,VehicleTax {
    public void pollutionCertificate(){
        System.out.println("got pollution certificate");
    }
    public void tax(){
        System.out.println("green tax set for "+noYear+" years");
    }

}


class OopsCompleteCode {
    public static void main(String [] args){

        Tata tata = new Tata();
        tata.enquiry();
        Tiago tiago = new Tiago();
        tiago.enquiry();
        System.out.println("price of tiago base model "+tiago.quote(600000,100000));
        System.out.println("price of tiago premium model "+tiago.quote(800000.00,100000.00));
        Owner owner = new Owner();
        owner.setName("ajay");
        System.out.println("owner name is "+owner.getName());
        Test test = new Test();
        test.preBooked();
        test.run();
        RCBook rc = new RCBook();
        rc.pollutionCertificate();
        rc.tax(); 

    }
}

