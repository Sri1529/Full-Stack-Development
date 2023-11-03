package REgular_Expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password {
	
	public static boolean Passwordvalid(String  Password)
	{
		
		String regex ="^(?=.*[0-9])"
		              +"(?=.*[a-z])"
		              + "(?=.*[A-Z])"
		              +"(?=.*[@#$%^&+=])"
			          +"(?=\\S+$).{8,20}$";
		
		Pattern p=Pattern.compile(regex);
		if(Password==null)
		{
		return false;
		}
		
		Matcher m=p.matcher(Password);
		return m.matches();
		
		
	}
	public static void main(String args[])
	{
		String str1="Pass@portal20";
		System.out.println(Passwordvalid(str1));
		
		String str2 ="Passwordcheck";
		System.out.println(Passwordvalid(str2));
		
		String str3="Pass@portal9";
		System.out.println(Passwordvalid(str3));
		
		String str4="1234";
		System.out.println(Passwordvalid(str4));
		
		String str5="Sri23@";
		System.out.println(Passwordvalid(str5));
		
		String str6="Srih23i80";
		System.out.println(Passwordvalid(str6));
		
	}

}
