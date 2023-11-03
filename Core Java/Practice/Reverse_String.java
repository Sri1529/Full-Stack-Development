package Practice;
import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		//String s="";
		int n=str.length();
		System.out.println(n);//
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
