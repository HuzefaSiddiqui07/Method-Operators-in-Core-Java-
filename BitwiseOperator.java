// Bitwise Operator

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int c = 36;
		int d = 63;
		int r = 28;
		
		// Bitwise AND (&) Operator
		
		  System.out.println(c>r & d>c); // Both Condition are true
		  
		  System.out.println(d<r & r>c); // Both Condition are false
		  
		  System.out.println(c>d & c<d); // One is false & second is true
		  
		  System.out.println(d>c & c>d); // One is true & second is false
		  
		  // Bitwise OR (|) Operator 
		  
          System.out.println(c>r | d>c); // Both Condition are true
		  
		  System.out.println(d<r | r>c); // Both Condition are false
		  
		  System.out.println(c>d | c<d); // One is false & second is true
		  
		  System.out.println(d>c | c>d); // One is true & second is false


	}

}
