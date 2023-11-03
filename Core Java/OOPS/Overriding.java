package OOPS;

class Person
{
	public void role()
	{
		System.out.println("Hey buddy");
	}
	
	
}


public class Overriding extends Person {
	
	
	public void role()
	{
		super.role();//super is a key word which helps to call the same method name
		System.out.println("Hii bro");
	}

	public static void main(String[] args) 
	{
		Overriding r = new Overriding();
		r.role();
		
	}

}
