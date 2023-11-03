package Logical_practise;
import java.util.*;
public class Add_2_nbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int l1[]= new int[n];
		int l2[]= new int[n];
		int l11=0;
		for(int i=0;i<n;i++)
		{
			l1[i]=sc.nextInt();
		}
		System.out.println("Enter numbers for l2");
		for(int i=0;i<n;i++)
		{
			l2[i]=sc.nextInt();
		}
		for(int i=n;i>0;i--)
		{
			l11=l1[i]+l11;
		}

	}

}
