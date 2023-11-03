package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Example_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b1=m.matches();//method 1
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();//method 2
		
		boolean b3=Pattern.matches(".s","as");//method3
		
		System.out.println(b1+" "+b2+" "+b3);
		//. represents a single character
		
		
		

	}

}
