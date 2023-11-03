package homeassesment1;
import java.util.*;
public class Number_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println("");
		}

	}

}
