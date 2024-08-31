class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show()
    {
        System.out.println("in b show");
    }
}
 class practice_18 {
    public static void main(String args[])
    {
        A obj=new B();
        obj.show();
    }
 }