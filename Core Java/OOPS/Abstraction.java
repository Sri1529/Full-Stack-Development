package OOPS;

abstract class sum
{
	public abstract int sumof2(int n1,int n2);
	public abstract int sumof3(int n1,int n2,int n3);
	public abstract int multof2(int n1,int n2);
	
	//regular method
	public void disp()
	{
		System.out.println("Method of class sum: ");
	}
	
}


class Demo extends sum
{
	public int sumof2(int n1,int n2)
	{
		return n1+n2;
	}
	
	public int sumof3(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	public int multof2(int num1,int num2)
	{
		return num1*num2;
	}
}

public class Abstraction {

	public static void main(String[] args) 
	{
		Demo obj= new Demo();
		//sum obj= new Demo();//object is created for demo
		System.out.println(obj.sumof2(3, 7));
		System.out.println(obj.sumof3(3, 7,8));
		System.out.println(obj.multof2(3, 7));
		obj.disp();
		

	}

}
