package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String str=sc.nextLine();
		
		Pattern p=Pattern.compile("javaTraining",Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(str);
		boolean matchFound=m.find();
		if(matchFound)
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("Match not found");
		}

	}

}
