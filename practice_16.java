class Human{
    private int age;
    private String name;
    
    public Human()
    {
        age=12;
        name="jenny";
        System.out.println("hi");
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    }

    class practice_16{
        public static void main(String args[]){
             Human obj= new Human();
             
           
           System.out.println(obj.getName() + " : "+ obj.getAge());
    
        }
    }
    