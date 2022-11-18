package basicNumbers;

public class CompareObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Double x = new Double(123.525252);
		Long y = new Long(9858674);
		System.out.println("If objects are equal then  result true otherwise false");
		System.out.println(x.equals(y));  
		System.out.println(x.equals(123.525252));  
		
		int a = x.hashCode();
		int b = y.hashCode();
		System.out.println("hashcode of x = " + a);  
		System.out.println("hashcode of y = " + b);  
		System.out.println("Comparing objects x and y = " + x.equals(y));  
	}

}
