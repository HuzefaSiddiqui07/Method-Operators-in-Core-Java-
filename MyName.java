// Print My Name.
// Static Method

public class MyName {
	public static void name() {
		System.out.println("Huzefa Siddiqui");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		MyName.name(); // by using class name.
		
		MyName obj = new MyName(); // Create Object
		
		obj.name(); // by using object.
		
		
		
		
		
		
	}

}
