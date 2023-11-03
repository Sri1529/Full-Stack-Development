package OOPS;

class Overload
{
	void demo(int a)
	{
		System.out.println("a: "+a);
	}
	
	void demo(int a,int b)
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	double demo(double a)//method name includes double because it returns the double value
	{
		System.out.println("double a: "+a);
		return a*a;//this returns the value to the variable result.....then result=2.5*2.5
	}
}

public class polymorphism_MethodOverloading {

	public static void main(String[] args) {
		
		Overload d=new Overload();
		
		double result;
		
		d.demo(12);
		d.demo(33,45);
		
		result=d.demo(2.5);
		System.out.println("o/p:  "+result);

	}

}
