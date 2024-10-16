import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d", "5"));//true d represent digit
		System.out.println(Pattern.matches("\\d","15" ));//false one d means only one digit not two
		System.out.println(Pattern.matches("\\d", "a"));//false small d will not take char or string only digit
		System.out.println(Pattern.matches("\\dd","3"));//false wrong syntax of d
		System.out.println(Pattern.matches("\\d\\d","56"));//true d is here used for taking two digits
		System.out.println(Pattern.matches("\\d\\d","567"));//false will not take more or less than 2 digits
		System.out.println(Pattern.matches("\\d*","8910"));//* means any number of digits allowed
		System.out.println(Pattern.matches("\\D","a"));//true capital D takes string value
		System.out.println(Pattern.matches("\\D","ab"));//false only takes one value
		System.out.println(Pattern.matches("\\D","1"));//false will not take digits
		System.out.println(Pattern.matches("\\D\\D","cd"));//true double D takes two values
		System.out.println(Pattern.matches("\\D\\D","e"));//false less or more will not take
		System.out.println(Pattern.matches("\\D*","abc"));// * means any number of alphabets allowed

	}

}
