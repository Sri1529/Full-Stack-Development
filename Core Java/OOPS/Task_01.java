package OOPS;

class Base1
{
	int stud_Id;
	String Stud_name;
	
	void getinfo(int id, String name)
	{
		stud_Id=id;
		Stud_name=name;
	}
	
	void putinfo()
	{
System.out.println("Student id: "+ stud_Id);
System.out.println("Student name: "+Stud_name);

	}
}

class Derived1 extends Base1
{
	//int m1,m2,m3,total,avg;
	int total,avg;
	void getinfo1(int m1,int m2,int m3)
	{
		//m1=mar1;
		//m2=mar2;
		//m3=mar3;
		total=m1+m2+m3;
		avg=total/3;
		getinfo(19,"Sri");
	}
	
	void putinfo1()
	{
	System.out.println("Total :"+total);
	System.out.println("Average :"+avg);
	
	}
}
public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 d=new Derived1();
		
		d.getinfo1(89, 970, 990);
		d.putinfo();
		d.putinfo1();
		
		

	}

}
