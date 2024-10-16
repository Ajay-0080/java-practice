import java.util.regex.Pattern;

public class RegexExample3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "arun34"));//allowed a-z, A-Z and 0-9, but total 6 alphabets
		System.out.println(Pattern.matches("[a-zA-z0-9]{7}", "arun345"));//true total 7 alphabets
		System.out.println(Pattern.matches("[a-zA-z0-9]{3}", "aruN34"));//false exceeds 3
		System.out.println(Pattern.matches("[a-zA-z0-9]{6}", "ar7n34"));//true total 6
		
		
		System.out.println(Pattern.matches("^[6-9]\\d{9}$", "9953038949"));//true
		System.out.println(Pattern.matches("[6789][0-9]{8}","985303984" ));//true
		//^ pattern start from here, [6-9] or [6789] are same representing the pattern should start with 
		// any of 6,7,8 and 9 other wise wrong. [0-9] means we can use 0 to 9  any numbers in the remaining  
		// pattern elements. {8} means remaining total 8 digits allowed in pattern.$ represents end
		
 
	}

}
