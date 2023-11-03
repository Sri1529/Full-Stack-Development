package Generic;
import java.util.*;
public class Example {
	
	public static <E> void printArray (E[]numb123)
	{
		for(E element : numb123)
		{
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]intArray = {10,20,30,40,50};
		Character[]charArray= {'J','A','V','A','T','R','A','I'};
		System.out.println("Printing Integer array");
		printArray(intArray);
		System.out.println("Printing character array");
		printArray(charArray);
		
		
	}

}
