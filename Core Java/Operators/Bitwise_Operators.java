package Operators;

public class Bitwise_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =60;
		int b =13;
		int c =0;
		
		c = a & b;
		System.out.println("c = a&b:"+c);
		
		c = a|b;
		System.out.println("c = a|b:"+c);
		
		c = a^b;
		System.out.println("c = a^b:"+c);
		
        c =~a;
        System.out.println("c = ~a:"+c);
        
        c = a<<2;
        System.out.println("c = a<<b:"+c);
        
        c = a>>2;
        System.out.println("c = a>>b:"+c);
        
        c =a>>>2;
        System.out.println("c = a>>>b:[="+c);
        
		

	}

}
