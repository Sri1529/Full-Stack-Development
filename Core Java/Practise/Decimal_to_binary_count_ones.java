package Practise;
import java.util.*;
public class Decimal_to_binary_count_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		int div,count=0,rem;
		while(n!=0)
		{
			
			rem=n%2;
			n=n/2;
			//n=div;
			if(rem==1)
			{
				count++;
			}
			//System.out.print(rem);
			
			
		}
		//System.out.println("");
		System.out.print(count);
		
		
		

	}

}
