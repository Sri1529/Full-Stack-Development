package Task;
import java.util.*;
public class Extract_digits_from_a_given_integer {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int n=sc.nextInt();
		int m=n;
		
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		
		while(m>0)
		{
			int a=m%10;
			System.out.println("Digits at position"+count+":"+a);
			m=m/10;
		}
		
	}

}
