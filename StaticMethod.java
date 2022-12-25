// Static Method

public class StaticMethod {
	
	public static void test() {
		System.out.println("This is static method");
	}
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		StaticMethod.test(); // Calling Static Method by using class name.
		
	   StaticMethod obj = new StaticMethod(); // Here we creating by using new keyword, obj is object of this class.
	   
	       obj.test(); // Calling static method by using object.
	   

	}

}
