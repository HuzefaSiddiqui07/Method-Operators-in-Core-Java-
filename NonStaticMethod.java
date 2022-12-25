// Non-Static Method

public class NonStaticMethod {
	
	public void test() {
		System.out.println("This is non-static method");
	}
	  

	public static void main(String[] args) {
		
		NonStaticMethod obj = new NonStaticMethod();
		
		obj.test();
		
	}

}
