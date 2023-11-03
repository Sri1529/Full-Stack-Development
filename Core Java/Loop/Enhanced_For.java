package Loop;


public class Enhanced_For {
	public static void main(String args[])
	{
		int [] numbers = {10,20,30,40,50};
		
		for(int x: numbers)
		{
			System.out.print(x+",");
		}
		
		System.out.println();
		
		String names[] = {"Sri" , "San" ,"Soll" ,"Suriya"};
		
		for(String name:names)
		{
			System.out.print(name+",");
		}
	}

}
