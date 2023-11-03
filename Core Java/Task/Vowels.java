package Task;
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
		case 'A':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowels");
			break;
			
			default:
				System.out.println("Consonants");
		}

	}

}
