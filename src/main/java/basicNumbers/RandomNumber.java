package basicNumbers;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using Math.ramdom()
		System.out.println("Random Number" + Math.random()); // it gives double number
		
		// taking input from user max and min limit
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minimum limit : ");
		int min = sc.nextInt();
		System.out.print("Enter Maximum limit : ");
		int max = sc.nextInt();
		
		System.out.print("Random value of type int between "+min+" to "+max+ " : ");
		
		int b = (int)(Math.random()*(max-min+1)+min);
		System.out.print(b);
		System.out.println();
		
		
		// using Random class
		Random random = new Random();
		int i1 = random.nextInt(50);
		int i2 = random.nextInt(1000);
		System.out.println();
		System.out.println("Random Integer Values : ");
		System.out.println(i1+ " & " +i2);
		
		float f1 = random.nextFloat(50);
		float f2 = random.nextFloat(1000);
		System.out.println();
		System.out.println("Random Float Values : ");
		System.out.println(f1+ " & " +f2);
		
		double d1 = random.nextDouble(50);
		double d2= random.nextDouble(1000);
		System.out.println();
		System.out.println("Random Double Values : ");
		System.out.println(d1+ " & " +d2);
		
		long l1 = random.nextLong(50);
		long l2 = random.nextLong(1000);
		System.out.println();
		System.out.println("Random Long Values : ");
		System.out.println(l1+ " & " +l2);
		
		boolean x = random.nextBoolean();
		boolean y = random.nextBoolean();
		System.out.println();
		System.out.println("Random Boolean Values : ");
		System.out.println(x+ " & " +y);
		
		// using ThreadLocalRandom class
		
		int i11 = ThreadLocalRandom.current().nextInt();
		int i21 = ThreadLocalRandom.current().nextInt();
		System.out.println();
		System.out.println("Random Integer Values : ");
		System.out.println(i11+ " & " +i21);
		
		float f11 = ThreadLocalRandom.current().nextFloat();
		float f21 =ThreadLocalRandom.current().nextFloat();
		System.out.println();
		System.out.println("Random Float Values : ");
		System.out.println(f11+ " &  " +f21);
		
		double d11 = ThreadLocalRandom.current().nextDouble();
		double d21= ThreadLocalRandom.current().nextDouble();
		System.out.println();
		System.out.println("Random Double Values : ");
		System.out.println(d11+ " & " +d21);
		
		long l11 =ThreadLocalRandom.current().nextLong();
		long l21 =ThreadLocalRandom.current().nextLong();
		System.out.println();
		System.out.println("Random Long Values : ");
		System.out.println(l11+ " & " +l21);
		
		boolean x1 = ThreadLocalRandom.current().nextBoolean();
		boolean y1 =ThreadLocalRandom.current().nextBoolean();
		System.out.println();
		System.out.println("Random Boolean Values : ");
		System.out.println(x1+ " & " +y1);

		// using Ints(x,y,z)
		
		randomInts(5);
		randomInts(5,40,90);
		
	}


	 static void randomInts(int i) {
		// TODO Auto-generated method stub
		 Random random = new Random();
		 System.out.println();
		 System.out.println("Random Integer Values : ");
		 random.ints(i).forEach(System.out::println);
		
		
	}

	 static void randomInts(int i, int j, int k) {
		// TODO Auto-generated method stub
		 Random random1 = new Random();
		 System.out.println();
		 System.out.println("Random Integer Values : ");
		 random1.ints(i,j,k).forEach(System.out::println);
	}
	 }
