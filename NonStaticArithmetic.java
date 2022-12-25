// Non-Static Method With No Arguments

public class NonStaticArithmetic {
	
	int m = 75;
	int r = 65;
	int t = 45;
	
	public void add(){
		
		int a = m+t; // Addition 
		System.out.println("Value Of a :" + a);
		 }
	
	public void subtract() {
		int b = m-r; // Subtract
		System.out.println("Value of b :" + b);
	}
	
	public void multiplication() {
		int c = r*t; // Multiplication
		System.out.println("Value of c :" + c);
	}
	
	public void division() {
		int d = m/t; // Division
		System.out.println("Value of d :" + d);
	}
	
	
	public static void main(String[] args) {
		
		// Create an object
		NonStaticArithmetic obj = new NonStaticArithmetic();
		
		// Calling All Method by Object
		obj.add();
		obj.subtract();
		obj.multiplication();
		obj.division();
		
		}

}
