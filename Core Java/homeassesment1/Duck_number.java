package homeassesment1;
import java.util.*;
public class Duck_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int split=0;
		int flag=0;
		while(n>0)
		{
			split=n%10;
			
			n=n/10;
			//System.out.print(split);
			if(split==0)
			{
				flag++;
			}
		}
		//System.out.print(split);
//		System.out.print(flag);
		if(split==0)
		{
			System.out.print("Not a duck number:");
		}
		else if(flag>=1)
		{
			System.out.print("Duck number");
		}
		else
		{
			System.out.print("Not a duck number");
		}
		
		
      
	}

}
