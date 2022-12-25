// Logical Operator

public class LogicalOperator {

	public static void main(String[] args) {
		
	  int e = 37;
	  int f = 29;
	  int g = 47;
	  
	  // AND ( && ) Operator
	  
	  System.out.println(e>f && g>e); // Both Condition are true
	  
	  System.out.println(g<f && f>e); // Both Condition are false
	  
	  System.out.println(f>g && f<e); // One is false & second is true
	  
	  System.out.println(g>f && e>g); // One is true & second is false
	  
	  // OR (||) Operator 
	  
      System.out.println(e>f || g>e); // Both Condition are true
	  
	  System.out.println(g<f || f>e); // Both Condition are false
	  
	  System.out.println(f>g || f<e); // One is false & second is true
	  
	  System.out.println(g>f || e>g); // One is true & second is false
	  
	  
	  }

}
