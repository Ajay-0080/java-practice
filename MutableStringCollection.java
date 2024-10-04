import java.util.ArrayList;
import java.util.List;

class MutableStringCollection {
    
    public static void main(String[] args) {
		
		List<StringBuilder> sb =new ArrayList<StringBuilder>();
		sb.add(new StringBuilder("ajay"));
		sb.add(new StringBuilder("akhil"));
		sb.add(new StringBuilder("anoop"));
		sb.add(new StringBuilder("pooja"));
		sb.add(new StringBuilder("diya"));
		
		for(StringBuilder st :sb ) {
			System.out.println(st);
		
		}
		
		

	}

}


