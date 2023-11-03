package Assignment;
import java.util.*;
public class buzz {

	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int nbr=sc.nextInt();
		//String str=Integer.toString(nbr);
		//int len=str.length();
		
		
		
		
			int split=nbr%10;
			//nbr=nbr/10;
			if(split==7||nbr%7==0)
			{
				flag=1;
				
			}
			
		
		//System.out.println(flag);
		
		
		if(flag==1)
		{
			System.out.println("it is a buzz number");
		}
		else
		{
			System.out.println("it is not a buzz number");
		}
	
		

	}

}
