import java.util.Hashtable;
import java.util.Map;
class Practice_21{
    public static void main(String[] args){
        Map<String,Integer> students =new Hashtable<>();

        students.put("navin",56);  
        students.put("abhin",25); 
        students.put("gokul",18); 
        students.put("meera",23); 
        students.put("merci",35);     

        System.out.println(students.keySet());

        for(String key:students.keySet()){

            System.out.println(key+" : "+students.get(key));

        }


    }
}