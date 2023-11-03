package Practise;
import java.util.*;
public class Smallest_largest {
	
	public static void find_word(String str)
	{
		int minvalue,maxvalue;
		String largest,smallest;
		String arr[]=str.split(" ");
		maxvalue=Integer.MAX_VALUE;//max value= 2147483647
		minvalue=Integer.MIN_VALUE;//min value= -2147483648
		largest=smallest=" ";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>minvalue)
			{
				smallest=arr[i];
				  minvalue=arr[i].length();
			}
			 if(arr[i].length()<maxvalue)
			{
				largest=arr[i];
				maxvalue=arr[i].length();
			}
		}
		System.out.println("Smallest: "+largest);
		System.out.println("Largest: "+smallest);
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		find_word(str);
		
		

	}

}
