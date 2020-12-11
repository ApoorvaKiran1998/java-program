package methods;

public class ArithmeticOperationMultiplicationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticOperationMultiplication operation = new ArithmeticOperationMultiplication();
		
		int a=20, b=5;
		int result1 = operation.multiplication(a,b);
		System.out.println("product of a and b is: " +result1);
		
	    double p=10.5, q=4.5;
		double result2 = operation.multiplication(p,q);
		System.out.println("product of p and q is: " +result2);
		
	}

}

