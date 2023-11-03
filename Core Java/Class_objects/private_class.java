package Class_objects;

class demo
{
	int a=19064;
	String stdname="Sri Hari";
	void print()
	{
		System.out.println("StdID ="+a);
		System.out.println("Student name ="+stdname);
	}
	
	
}

class demo1
{
	int a1=60;
	int a3=2;
	
	public void mult()
	{
		System.out.printf("The multiplication is %d",a1*a3);
		System.out.println();
	}
}

public class private_class {
	public static void main(String args[])
	{
		demo d=new demo();
		d.print();
		
		demo1 sc= new demo1();
		sc.mult();
		
		
		first f=new first();//used from another program because the method is on public
		f.add();//it is a public method
		
	}

}
