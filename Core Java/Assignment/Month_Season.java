package Assignment;
import java.util.*;
public class Month_Season {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the month number :");
		int a = sc.nextInt();
		
		while(a<=4)
		{
			System.out.println("Summer");
			
			break;
		}
		while(a>=5&&a<=8)
		{
			System.out.println("Rainy");
			
			break;
		}
		
		
		
		while(a>=9&&a<=12)
		{
			System.out.println("Winter");
			
			break;
		}
		
		while(a>=13)
		{
			System.out.println("Invalid number");
			
			break;
		}
		

		
		
	}

}
