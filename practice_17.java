class Human{
    private int age;
    private String name;
    
    public Human()
    {
        age=12;
        name="jenny";
        
    }
    public Human(int a, String n)
    {
        age=a;
        name=n;
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

    class practice_17{
        public static void main(String args[]){
             Human obj= new Human();
             Human obj1= new Human(15 ,"khatri");
             
           
           System.out.println(obj.getName() + " : "+ obj.getAge());
           System.out.println(obj1.getName() + " : "+ obj1.getAge());
    
        }
    }
    