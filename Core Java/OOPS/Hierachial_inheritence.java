package OOPS;

class parents
{
	void show()
	{
System.out.println("I am parent class");
	}
}

class son1 extends parents
{
	void show1()
	{
		System.out.println("I am son1 class");
	}
}

class daughter extends parents
{
	void show2()
	{
		System.out.println("I am daughter class");
	}
}

public class Hierachial_inheritence {

	public static void main(String[] args) {
		daughter d=new daughter();
		son1 s=new son1();
		d.show2();
		s.show1();
		s.show();
		d.show();

	}

}
