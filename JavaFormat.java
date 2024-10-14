import java.util.Date;    
    public class JavaFormat {
    
        public static void main(String[] args) {
            
            System.out.printf("%s %n","luminar");
            System.out.printf("%S' %n","LUminar");
            System.out.printf("%15s %n","Total:");
            System.out.printf("%d \n",10000);
            double d =2.456436;
            System.out.printf("decimal point upto 2 decimal places: "+String.format("%.2f",d));
            
            Date joindate = new Date();
            System.out.println(joindate);
            System.out.printf("hours %tH: minutes %tM: seconds %tS %n",joindate,joindate,joindate);
            System.out.printf("%1$tA, %1$tB %1$ty %n",joindate);
            System.out.printf("%1$td, %1$tm, %1$ty %n",joindate); 
                                                                
        }
    
    }

    

