package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Example_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		int n=6;
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","adsccrun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","desjbc@#$%"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}","arun"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
		//try with more examples......

	}

}
