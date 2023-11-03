package Assesment_1;

public class Ducknumber 
{
	
	public static void main(String args[])
	{
		int nbr=25,split=0;
		String str=Integer.toString(nbr);
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			split=nbr%10;
			
			
			nbr=nbr/10;
			
			
			
		}
		
		if(split==0)
		{
			System.out.println("duck nbr");
		}
		else
		{
			System.out.println(" not duck nbr");
		}
		
		
		
	}

}
