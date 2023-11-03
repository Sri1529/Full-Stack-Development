package Practise;
import java.util.*;
public class prm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0,s=0,i=1,j=0;
	
			while(s<n)
			{
				j=1;
				count=0;
				while(i>=j)
				{
					if(i%j==0)
					{
						count++;
					}
					j++;
				}
				if(count==2)
				{
					System.out.println(i);
					s++;
				}
				i++;
			}
		

	}

}
