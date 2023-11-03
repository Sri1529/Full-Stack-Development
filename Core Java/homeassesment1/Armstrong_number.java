package homeassesment1;
import java.util.*;
public class Armstrong_number {

	public static void main(String[] args) {
		
		double mult=1;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int num=sc.nextInt();
		int dup=num;
		String str=Integer.toString(num);
		int len=str.length();
		
	  while(num>0)
	  {
		  int split=num%10;
		  mult=Math.pow(split,len);
		  num=num/10;
		 sum=mult+sum;
	  }
	  //System.out.println(sum);
	  if(sum==dup)
	  {
		  System.out.println("Armstrong number");
	  }
	  else
	  {
		  System.out.println("not a Armstrong number");
	  }

	}

}
