package Assesment_1;

public class Armstrong_number {

	public static void main(String[] args) {
		int arm=1;
		int rst=arm;
		double add=0;
		String str=Integer.toString(arm);
		int len=str.length();
		
		
		for(int i=0;i<len;i++)
		{
		int split=arm%10;
		double cube =Math.pow(split, 3);
		
		arm=arm/10;
		add=add+cube;
		
		}
		
		if(add==rst)
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}
	}

}
