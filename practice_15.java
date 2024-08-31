class Human{
    private int age;
    
    public void setAge(int age){

       this.age= age;
    } 
    public int getAge(){

        return age;
         
    } 
    }

    class practice_15{
        public static void main(String args[]){
             Human obj1= new Human();
           obj1.setAge(25);
           System.out.println(obj1.getAge());
    
        }
    }
    

