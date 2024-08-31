class Mobile{

    String brand;
    int price;
    static String name;
    
    public void show(){
        System.out.println(brand +" : "+price+ " : "+name);
    }

    public static void show1(Mobile obj1){
        System.out.println(obj1.brand +" : "+obj1.price+ " : "+name);
    }
    }
    
    class practice_13{
        public static void main(String args[]){
             Mobile obj1= new Mobile();
             obj1.brand="apple";
             obj1.price=50000;
             Mobile.name="smartphone";
             Mobile obj2= new Mobile();
             obj2.brand="samsung";
             obj2.price=25000;
             Mobile.name="smartphone";
    
             obj1.show();
             obj2.show();
             Mobile.show1(obj1); 
    
        }
    }
    
