package Assesment_1;

public class Digit_to_word {

	public static void main(String[] args) {
		int number=1234;
	
		int reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		
		
		String str=Integer.toString(reverse);
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			int split =reverse%10;
			reverse=reverse/10;
			
			if(split==1)
			{
				System.out.print("one ");
			}
			if(split==2)
			{
				System.out.print("two ");
			}
			if(split==3)
			{
				System.out.print("three ");
			}
			if(split==4)
			{
				System.out.print("four ");
			}
			if(split==5)
			{
				System.out.print("five ");
			}
			if(split==6)
			{
				System.out.print("six ");
			}
			if(split==7)
			{
				System.out.print("seven ");
			}
			if(split==8)
			{
				System.out.print("eight ");
			}
			if(split==9)
			{
				System.out.print("nine ");
			}
			if(split==0)
			{
				System.out.print("Zero ");
			}
			
			
		}
		

	}

}
