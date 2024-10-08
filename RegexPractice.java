import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Luminar",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("visit Luminar!");
		boolean matchfound=matcher.find();
		
		if(matchfound) {
			System.out.println("match found");
		}
		
		else {
			System.out.println("match not found");
		}
		System.out.println(Pattern.matches("([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/[2][0-9]{3}","05/10/2024"));
		


        }
   }
