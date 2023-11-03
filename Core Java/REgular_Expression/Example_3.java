package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_3 {

	public static void main(String[] args) 
	{
		String line ="This order was placed for QTdf0030! ok?";
		Pattern p=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher m=p.matcher(line);
		
		while(m.find())
		{
			System.out.println ("group 1:" +m.group(1));
			System.out.println ("group 2:" +m.group(2));
			System.out.println ("group 3:" +m.group(3));
			
		}
		

	}

}
