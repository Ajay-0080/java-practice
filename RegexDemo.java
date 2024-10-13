import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexDemo {
	
	public static void main(String [] args) {
		Pattern a = Pattern.compile("luminar",Pattern.CASE_INSENSITIVE);
		Matcher b = a.matcher("lUmInAR");
		boolean res;
		res= b.matches();
		
		System.out.println(res);
		
			
	}
}
	