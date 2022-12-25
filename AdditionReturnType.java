// Non-Static Method With Arguments
// Add 2 Numbers

public class AdditionReturnType {
	// Create a method 
	  public int addNumbers(int x, int y) {
		  int sum = x+y;
		return sum;
		  
	  }
	

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 20;
		
		// Create an object of Main
		AdditionReturnType obj = new AdditionReturnType();
		// Calling Method 
		int result = obj.addNumbers(num1 , num2);
 // Notice the line; Here we have called the method by passing 2 args num1 & num2. since the method is returning some value in the result variable.
		System.out.println("Sum is :" + result);

	}

}
