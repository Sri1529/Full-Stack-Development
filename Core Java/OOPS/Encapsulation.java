package OOPS;

class EncapsulationDemo
{
	private int ssn;
	private String empname;
	private int empage;
	
	public int getEmpssn()
	{
		return ssn;
	}


public String getEmpname()
{
	return empname;
	
}

public int getEmpAge() {
	return empage;
	
}

public void setEmpAge(int newvalue)
{
	empage= newvalue;
}

public void setEmpName(String newValue)
{
	empname=newValue;
}

public void setEmpSSn(int newValue)
{
	ssn=newValue;
}

}

public class Encapsulation {

	public static void main(String[] args)
	{
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName("Mario");
		obj.setEmpAge(32);
		obj.setEmpSSn(112233);
		
		System.out.println("Employee Name:" + obj.getEmpname());
		System.out.println("Employee SSN:" + obj.getEmpssn());
		System.out.println("Employee Name:" + obj.getEmpAge());
		

	}

}
