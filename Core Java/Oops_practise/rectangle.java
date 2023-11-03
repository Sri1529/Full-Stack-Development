package Oops_practise;

public class rectangle {
	int height,width;
	public rectangle(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	
	public int area()
	{
		return height*width;
	}
	public int perimeter()
	{
		return 2*(height+width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle d = new rectangle(2,2);
		System.out.println("Area"+d.area());
		System.out.println("Perimeter"+d.perimeter());
		

	}

}
