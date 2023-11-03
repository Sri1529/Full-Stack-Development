package Assesment_1;

public class Single_digit {

	public static void main(String[] args) {
		int a=12345;
		int temp=0;
		int add=0;
		String str=Integer.toString(a);
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			int split=a%10;
			a=a/10;
			temp=temp+split;

		}
		//System.out.println(temp);
		
		String str1=Integer.toString(temp);
		int len1=str.length();
		
		for(int i=0;i<len1;i++)
		{
			if(len1>1)
			{
				int split1=temp%10;
				temp=temp/10;
				add=add+split1;
			}
		}
		
		System.out.println(add);

		
	}
	
	

}
