package Task;
import java.util.*;
public class Increment_decrement {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any integer:");
		int a=sc.nextInt();
			int b=++a;
			System.out.println("Result after pre increment a:"+a);
			System.out.println("Result after pre increment b:"+b);
			int c=a++;
			
			System.out.println("Result after pre increment a:"+a);	
			System.out.println("Result after pre increment c:"+c);
			int d=--a;
			System.out.println("Result after pre increment a:"+a);	
			System.out.println("Result after pre increment d:"+d);
			int e=a--;
			System.out.println("Result after pre increment a:"+a);	
			System.out.println("Result after pre increment e:"+e);	
		
	}

}
