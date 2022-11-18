package basicNumbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		checkArmstrong(num);
		System.out.println();
		}
	}

	
	static void checkArmstrong(int num) {
		// TODO Auto-generated method stub
		int digit=0,temp=num,result=0;
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=num;
		while(temp>0)
		{
			int remainder = temp%10;
			result= (int) (result+ Math.pow(remainder, digit));
			temp=temp/10;
		}
		if(result==num)
		{
			System.out.println(+num + " is Armstrong Number");
		}
		else
		{
			System.out.println(+num + " is not Armstrong Number");
		}
	}

}
