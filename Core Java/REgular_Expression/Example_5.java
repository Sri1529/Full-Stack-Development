package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Example_5 {

	public static void main(String[] args) {

//		Pattern p=Pattern.compile(".s");
//		Matcher m=p.matcher("as");
		System.out.println("metacharacters d...");
		System.out.println(Pattern.matches("\\d", "323ac"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		
		
		System.out.println("metacharacters D...");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4443"));
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m"));
		
		System.out.println("metacharacters D with quantifiers...");
		System.out.println(Pattern.matches("\\D*", "asda"));
		System.out.println(Pattern.matches("\\D*", "aa"));
		System.out.println(Pattern.matches("\\D*", ""));
		System.out.println(Pattern.matches("\\D*", "aawwssdd"));
		System.out.println(Pattern.matches("\\D*", "235"));
		

	}

}
