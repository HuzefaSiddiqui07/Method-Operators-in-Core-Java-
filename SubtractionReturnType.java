 // Non-Static Method With Arguments
// Subtract 2 Numbers

public class SubtractionReturnType {
	// Create a Method
	public int subtractNumbers(int c, int d) {
		int subtract = c-d;
		return subtract;
	}

	public static void main(String[] args) {
		int num1 = 70;
		int num2 = 40;
		
		// Create an Object
		SubtractionReturnType obj = new SubtractionReturnType();
		// Calling Method
		int result = obj.subtractNumbers(num1, num2);
		// Notice the line; Here we have called the method by passing 2 args num1 & num2. since the method is returning some value in the result variable.
		System.out.println("Subtract Is :" + result);
	}

}
