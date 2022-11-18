package basicNumbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		checkPrime(num);
		System.out.println();
		}
	}

	static void checkPrime(int num) {
		// TODO Auto-generated method stub
		
		int flag=0,m=0;
		m=num/2;
		if(num == 0 & num == 1)
		{
			System.out.println(+num + " is not Prime Number");
		}
		else
		{
			for(int i=2; i<=m ; i++)
			{
				int remainder = num % i;
				if(remainder==0)
				{
					System.out.println(+num +" is not Prime Number");
					flag=1;
					break;
				}
			}
				if(flag==0)
				{
					System.out.println(+num + " is  Prime Number");
				}
			}
		}
	}


