package Variable;

public class Local_Variable {
	int a=20;//global declaration
	public void display()
	{
		 a=10;//local declaration
		 int b=22;//local variable
		System.out.println(a);
		System.out.println(b);
	}
	public void display1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Local_Variable de=new Local_Variable();
		de.display();
		de.display1();
		
		
		
	}

}
