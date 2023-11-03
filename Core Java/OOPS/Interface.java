package OOPS;


interface Myinterface
{
	public void method1();
	public void method2();
	
}

class Demo3 implements Myinterface
{
	public void method1()
	{
System.out.println("implemantation of method 1");
	}
	
	public void method2() 
	{
		System.out.println("implemantation of method 2");
	}
}

public class Interface {

	public static void main(String[] args) {
		Demo3 obj= new Demo3();
		//Myinterface obj= new Demo3();
		obj.method1();
		obj.method2();
	}

}
