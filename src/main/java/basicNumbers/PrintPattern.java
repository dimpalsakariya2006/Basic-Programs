package basicNumbers;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		 // 1st pattern
		
		for( int i = 0 ; i <num ; i++ )
		{
			for(int j=0; j<=i; j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 2nd pattern
		System.out.println();
		for( int i = 0 ; i <num ; i++ )
		{
			for(int j=(num-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 3rd pattern
		System.out.println();
		for( int i = 0 ; i <num ; i++ )
		{
			for(int j=2*(num-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		// 4th pattern
		System.out.println();
	int s= num-1;
		for( int i = 1 ; i <=num ; i++ )
		{
			for(int j=1; j<=s; j++)
			{
				System.out.print(" ");
			}
			s--;
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s=1; 
		for (int i = 1; i<= num - 1; i++)  
		{  
		for (int j = 1; j<= s; j++)  
		{  
		System.out.print(" ");  
		}  
		s++;  
		for (int j= 1; j<= 2 * (num - i) - 1; j++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		
		// 5th pattern
		
		System.out.println();
		for( int i = num-1 ; i >=0 ; i-- )
		{
			for(int j=0; j<=i; j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 6th pattern
		System.out.println();
		for( int i = 0 ; i <=num ; i++ )
		{
			for(int j=(num-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//7th pattern
		System.out.println();
		for( int i = 0 ; i <=num-1; i++ )
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=num-1-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//8th pattern
		
		System.out.println();
		for( int i = 0 ; i <=num ; i++ )
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<num-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//9th pattern
		System.out.println();
		for( int i = 0 ; i <num ; i++ )
		{
			for(int j=0; j<=i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for( int i = num-1 ; i >=0 ; i-- )
		{
			for(int j=0; j<i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//10th pattern
	
		System.out.println();
		for( int i = 0 ; i <num ; i++ )
		{
			for(int j=(num-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for( int i = 0 ; i <=num ; i++ )
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<num-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//11th pattern
		
		System.out.println();
		for( int i = 0 ; i <=num-1; i++ )
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=num-1-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for( int i = 0 ; i <num ; i++ )
		{
			for(int j=(num-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 12th pattern
		
		for( int i = 0 ; i <=num ; i++ )
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//13th pattern
		
		System.out.println();
		int k=1;
		for( int i = 0 ; i <=num ; i++ )
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		// 14th pattern
		
		System.out.println();
		for( int i = 1 ; i <=num ; i++ )
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		// 15th pattern
		
		System.out.println();
		for( int i = num ; i>=1; i-- )
		{
			for(int j=num; j>=i; j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//16th pattern
		
		System.out.println();
		for( int i = 1 ; i<=num; i++ )
		{
			for(int j=i; j>=1; j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//17th pattern
		
		System.out.println();
		for( int i = 1; i <=num; i++ )
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int l=i;l<=num;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		for( int i = num-1 ; i >=1 ; i-- )
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int l=i;l<=num;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		//18th pattern
		
		System.out.println();
		for( int i = 1 ; i <=num ; i++ )
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for( int i = num-1 ; i >0 ; i-- )
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//19 pattern
		
		System.out.println();
		for( int i = 1; i <=num ; i++ )
		{
			for(int j=num; j>=i; j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// 20th pattern
		
		System.out.println();
		for( int i = num; i >0 ; i-- )
		{
			for(int j=1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//21st pattern
		int a=65;
		System.out.println();
		for( int i = num-1; i >=0 ; i-- )
		{
			for(int j=0; j<=i; j++ )
			{
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
		
	}

}
