package OOPS;


interface basee1
{
	public void m1();
}

interface basee2
{
	public void m2();
}

class inmp implements basee1,basee2
{
	public void m1()
	{
	System.out.println("M1");	
	}
	public void m2()
	{
		System.out.println("M2");	
	}
}
public class mianclassfor_Interface {

	public static void main(String[] args) {
		inmp s =new inmp();
		s.m1();
		s.m2();

	}

}
