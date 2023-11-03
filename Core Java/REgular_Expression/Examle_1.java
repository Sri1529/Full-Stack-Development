package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Examle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("abb");
		Matcher m=p.matcher("aabbabbabbaaa");
		while(m.find())
		{
			System.out.println("Start:"+m.start()+", End: "+m.end()+", Group"+m.group());
		}

	}

}
