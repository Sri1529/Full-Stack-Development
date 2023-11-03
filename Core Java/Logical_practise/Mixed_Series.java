package Logical_practise;

import java.util.Scanner;

//1 2 1 3 2 5 3 7 5 11 8 13 13 17 21
public class Mixed_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
		int flag=0,f1=1,f2=0,f3,number=2,index=0;
		for(int i=1;i<=n;i++) {
			if(flag==0) {
				f3=f1+f2;
				f1=f2;
				f2=f3;
				flag=1;
				//System.out.print(f3+" ");
				arr[index++]=f3;
			}
			else {
				if(number==2)
					//System.out.print(number+" ");
					arr[index++]=number;
				else {
				Task:
				for(int j=2;j<=number/2;j++) {
					if(number%j==0) {
						number++;
						continue Task;
					}
				}
				//System.out.print(number+" ");
				arr[index++]=number;
				}
				number++;
				flag=0;
			}
		}
		System.out.println(arr[index-1]);

	}

}
