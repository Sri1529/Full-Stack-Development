package Matrix;
import java.util.*;
public class Repeated_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		//int in=Integer.parseInt(str);
		int len=str.length();
		//System.out.println("length:"+len);
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i));
					break;//remove if u need continuos repeted characters 
					//now it shoes the 1st repeated character...
				}
			}
		}

	}

}
