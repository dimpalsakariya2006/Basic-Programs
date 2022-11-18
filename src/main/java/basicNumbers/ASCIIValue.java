package basicNumbers;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter character from Keyboard: ");
		char x = sc.next().charAt(0);
		int ASCIIvalue = x;
		System.out.println("ASCII value of " +x + " is " +ASCIIvalue);
		for(int i=0;i<=255;i++)
		{
			System.out.println("ASCII value of " +(char)i + " is " +i);
		}
	}

}
