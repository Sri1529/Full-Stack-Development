package Assignment;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the numbers: ");
		
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
			
			
		}
		
		System.out.println("Enter the number to search : ");
		int srch=sc.nextInt();
		
		
		for(int j=0;j<a;j++)
		{
			if(srch==arr[j])
			{
			   flag=1;
			   break;
				
			}
			else
			{
				flag=2;
				
			}
		}
		
		if(flag==1)
		{
			System.out.println("yes ");
		}
		else if(flag==2)
		{
			System.out.println("No ");
		}
		
		
		
		
		
		

	}

}
