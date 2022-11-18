package basicNumbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print(" Enter a Number : ");
		int num = sc.nextInt();
		factorial(num);
		System.out.println();
		}
	}

	 static void factorial(int num) {
		// TODO Auto-generated method stub
		
		 int factorial=1;
		 for(int i=num; i>0 ; i--)
		 {
			 factorial = factorial * i; 
			 if(i>1)
			 System.out.print(+i + " * ");
			 else
				 System.out.print(i);
		 }
		 System.out.print(" = " +factorial);
	}

}
