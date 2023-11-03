package Oops_practise;

public class Dog {
	private String name,breed;
	
	public Dog(String name,String breed)
	{
		this.name= name;
		this.breed=breed;
	}
	public String getname()
	{
		return name;
	}
	
	public String getbreed()
	{
		return breed;
	}
	public void setname(String name)
	{
		this.name= name;
	}
	public void setbreed(String breed)
	{
		this.breed= breed;
	}

	public static void main(String[] args) {
		Dog d = new Dog("Sandy","Greadane");
		System.out.println("The dog name:"+d.getname());
		System.out.println("The dog Breed:"+d.getbreed());
		
		System.out.println("Updated data");
		d.setname("Sandy 2.0");
		d.setbreed("Greatdane 2.0");
		System.out.println("The dog name:"+d.getname());
		System.out.println("The dog Breed:"+d.getbreed());
		
		
		// TODO Auto-generated method stub

	}

}
