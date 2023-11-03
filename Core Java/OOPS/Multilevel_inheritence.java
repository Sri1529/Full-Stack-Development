package OOPS;

class grand_father
{
	void show1()
	{
		System.out.println("I am show function 1 in grand father class");
	}
}

class father extends grand_father
{
	void show2()
	{
		System.out.println("I am show function 2 in  father class");
	}
}

class son extends father
{
	void show3()
	{
		System.out.println("I am show function 3 in son class");
	}
}

class grandson extends son
{
	void show4()
	{
		System.out.println("I am show function 4 in grand son class");
	}
}

public class Multilevel_inheritence {

	public static void main(String[] args) {
		grandson s=new grandson();
		s.show1();
		s.show2();
		s.show3();
		s.show4();


	}

}
