package basicNumbers;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10, b=50,c=20;  
		System.out.println(a<b||a<c);//logical || 
		System.out.println(a>b|a>c);// bitwise |
		System.out.println(a);
		System.out.println(a); 
		System.out.println(a>b&&a<c);// logical &&
		System.out.println(a>b&a>c); //bitwise &
		int z=(a<b)?a:b;  
		System.out.println(z);  
	}

}
