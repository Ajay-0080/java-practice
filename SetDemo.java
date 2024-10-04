import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("php");
		set.add("java");
		set.add("jsp");
		set.add("spring");
		set.add("jsp");
		
		
		Enumeration <String> e = Collections.enumeration(set);
		while(e.hasMoreElements())  {
			System.out.println(e.nextElement());
		}
		
		
	}

}
