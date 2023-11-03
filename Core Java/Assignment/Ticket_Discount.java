package Assignment;
import java.util.*;
public class Ticket_Discount {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no.of tickets: ");
		int n=sc.nextInt();
		
		
		System.out.println("Enter the"+n+" ticker numbers: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the date of the month:  ");
        int date=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
        	if(arr[i]%date==0)
        		
            {
            	
            	System.out.print("1 ");
            	
            }
        	
        	else
        	{
        		
        		System.out.print("0 ");
        	}
        }
        
     
        
	}

}
