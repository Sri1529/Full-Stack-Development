package Practice;
import java.util.*;
public class Sumof_digitswithalphabest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int b,sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				b=Integer.parseInt(String.valueOf(str.charAt(i)));
				sum=sum+b;
			}
		}

	}

}
