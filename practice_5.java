class Calculator {
 
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;
    }

    public double add(double n1,int n2)
    {
        return n1+n2;
    }
    
}

 class practice_5 {
    
    public static void main(String args[]) {

        Calculator obj=new Calculator();
        
        int res= obj.add(3,4);
        System.out.println(res);


    }
}
