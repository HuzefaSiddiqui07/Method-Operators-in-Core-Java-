// Global Variable

public class GlobalVariable {
	// Static Variables
	static int a = 50;
	static int b = 30;
	static int c = a+b;
	static int d = a-b;
	static int e = a*b;
	static int f = a/b; 

	public static void main(String[] args) {
		
		// Create an Object
		GlobalVariable obj = new GlobalVariable();
		
		// Print Values 
		System.out.println("Value of a :" + obj.a);
		System.out.println("Value of b :" + obj.b);
		System.out.println("Value of c :" + obj.c);
		System.out.println("Value of d :" + obj.d);
		System.out.println("Value of e :" + obj.e);
		System.out.println("Value of f :" + obj.f);
		
		// By Using Class Name 
		//System.out.println("Value of c :" + GlobalVariable.c);
	}

}
