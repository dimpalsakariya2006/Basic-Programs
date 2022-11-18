package basicNumbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		checkPalindrome(num);
		System.out.println();
		}
	}

	static void checkPalindrome(int num) {
		// TODO Auto-generated method stub
		
		int remainder=0,sum=0,temp;
		temp=num;
		while(temp>0)
		{
			remainder = temp %10;
			sum = sum*10 + remainder;
			temp /= 10;
		}
		if(sum==num)
		{
			System.out.println(+num + " is Palindrome Number");
		}
		else
		{
			System.out.println(+num + " is not Palindrome Number");
		}
	}

}
