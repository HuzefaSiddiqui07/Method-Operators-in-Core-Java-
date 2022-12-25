 // Non-Static with Arguments

public class NonStaticArguments {
	
	// Create a Methods
	public int addition(int j, int k) {
		int sum = j+k; // Addition
		return sum;
	}
	public int subtract(int j, int k) {
		int subtract = j-k; // Subtract
		return subtract;
	}
	public int multiplication(int j, int k) {
		int multiplication = j*k; // Multiplication
		return multiplication;
	}
	public int division(int j, int k) {
		int division = j/k; // Division
		return division;
	}
	
	public static void main(String[] args) {
		
		int no1 = 50;
		int no2 = 30;
		
		// Create an Object
		NonStaticArguments obj = new NonStaticArguments();
			// Calling All Methods
			int store1 = obj.addition(no1, no2);
			int store2 = obj.subtract(no1, no2);
			int store3 = obj.multiplication(no1, no2);
			int store4 = obj.division(no1, no2);
			
			// Print All Values 
			System.out.println("Addition is :" + store1);
			System.out.println("Subtract is :" + store2);
			System.out.println("Multiplication is :" + store3);
			System.out.println("Division is :" + store4);
	}

}
