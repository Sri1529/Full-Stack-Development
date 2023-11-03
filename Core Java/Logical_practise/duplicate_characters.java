package Logical_practise;
import java.util.*;
public class duplicate_characters {

	public void dup(String str)
	{
		int count;
		char arr[]=str.toCharArray();
		System.out.println("Duplicate characters:");
		for(int i=0;i<arr.length;i++)
		{ count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&arr[i]!=' ')
				{
					//System.out.print(arr[j]+" ");
					count++;
					System.out.println(str+" Contains "+arr[i]+" "+count+"times");
				}
			}
			
		}
		//System.out.println(arr.length);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicate_characters d = new duplicate_characters();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		d.dup(str);

	}

}
