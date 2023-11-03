package Practise;
import java.util.*;
public class find_position_of_given {
	
	
	public static int uppercase( String str)
	   {
           for(int i=0;i<str.length();i++)
			
		{
			char lett=str.charAt(i);
			if(Character.isUpperCase(lett))
			{
				return i+1;
			}
		}
           return 0;  
	}
	
	public static int lowercase(String str)
	{
          for(int i=0;i<str.length();i++)
			
		{
			char lett=str.charAt(i);
			if(Character.isLowerCase(lett))
			{
				return i+1;
			}
		}
           return 0; 
	}
	
	public static int digit(String str)
	{
                for(int i=0;i<str.length();i++)
			
		{
			char lett=str.charAt(i);
			if(Character.isDigit(lett))
			{
				return i+1;
			}
		}
           return 0; 
	}
	
	public static int space(String str)
	{
              for(int i=0;i<str.length();i++)
			
		{
			char lett=str.charAt(i);
			if(Character.isSpace(lett))
			{
				return i+1;
			}
		}
           return 0; 
	}
	
	public static int Vowels(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'
					||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
			{
				return i+1;
			}
			
		}
		return 0;
	}
	public static int specialch(String str)
	{
                for(int i=0;i<str.length();i++)
			
		{
			char lett=str.charAt(i);
			if(!Character.isDigit(lett)&&!Character.isUpperCase(lett)&&!Character.isLowerCase(lett)&&!Character.isSpace(lett))
			{
				return i+1;
			}
		}
           return 0; 
	}
	
	public static int consonants(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!='a'&&str.charAt(i)!='A'&&str.charAt(i)!='e'&&str.charAt(i)!='E'&&str.charAt(i)!='i'&&str.charAt(i)!='I'&&str.charAt(i)!='o'
					&&str.charAt(i)!='O'&&str.charAt(i)!='u'&&str.charAt(i)!='U')
			{
				return i+1;
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the string");
		String str= sc.nextLine();
		
		int cp= uppercase(str);
		if(cp!=0)
		{
			System.out.println("Capital letter position: "+cp);
		}
		else
		{
			System.out.println("Capital letter position: Not found");
		}
		
		int sl=lowercase(str);
		
		
		if(sl!=0)
		{
			System.out.println("Small letter position: "+sl);
		}
		else
		{
			System.out.println("Small letter position: Not found");
		}
		
		int digit=digit(str);
		if(digit!=0)
		{
			System.out.println("Digit  position: "+digit);
		}
		else
		{
			System.out.println("Digit position: Not found");
		}
		
		int space=space(str);
		if(space!=0)
		{
			System.out.println("Space  position: "+space);
		}
		else
		{
			System.out.println("Space position: Not found");
		}
		int vowels=Vowels(str);
		
		
		
		if(vowels!=0)
		{
			System.out.println("vowels  position: "+vowels);
		}
		else
		{
			System.out.println("vowels position: Not found");
		}
		int cons =consonants(str);
				
		if(cons!=0)
		{
			System.out.println("consonants  position: "+cons);
		}
		else
		{
			System.out.println("consonants position: Not found");
		}
		int sp=specialch(str);
		
		
		if(sp!=0)
		{
			System.out.println("Special character position: "+sp);
		}
		else
		{
			System.out.println("Special character position: Not found");
		}

}
}
//capiatl letter ,small leter, digit, whitespace, special character, vowel,consonants......