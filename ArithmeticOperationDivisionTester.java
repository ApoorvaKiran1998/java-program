package methods;

public class ArithmeticOperationDivisionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperationDivision operation = new ArithmeticOperationDivision();
		
		int a=40, b=6;
		int result1 = operation.division(a,b);
		System.out.println("quotient of a and b is: " +result1);
		
	    double p=40.5, q=2;
		double result2 = operation.division(p,q);
		System.out.println("quotient of p and q is: " +result2);

	}

}
