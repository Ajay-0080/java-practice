import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer implements Comparable<Customer> {
      int custId;
      String custName;
      String custAddress;
	public Customer(int custId, String custName, String custAddress) {
		
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	@Override
	public int compareTo(Customer customer) {
		if(custId==customer.custId) {
			return 0;
		}
		else if(custId>customer.custId) {
			return +1;
		}
		else {
			return -1;
			
		}
		 
	}

}


class ComparableDemo {

	public static void main(String[] args) {
		
      List<Customer> customers = new ArrayList<Customer>();
      customers.add(new Customer(780,"ajay","kaakanad"));
      customers.add(new Customer(5,"akhil","alepy"));
      customers.add(new Customer(3,"pooja","kozhikode"));
      customers.add(new Customer(1,"diya","tvm"));
      Collections.sort(customers);
      for(Customer c : customers) {
    	  System.out.println(c.custId+" "+c.custName+" "+c.custAddress);
      }
      
	}

}

