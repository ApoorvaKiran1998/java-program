package methods;

public class ArithmeticOperationSubtractionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArithmeticOperationSubtraction operation = new ArithmeticOperationSubtraction();
		
		int a=30, b=5;
		int result1 = operation.subtraction(a,b);
		System.out.println("difference of a and b is: " +result1);
		
	    double p=5.5, q=3.0;
		double result2 = operation.subtraction(p,q);
		System.out.println("difference of p and q is: " +result2);
		
	}

}

