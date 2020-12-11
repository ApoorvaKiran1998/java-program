package methods;

public class ArithmeticOperationModulusTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperationModulus operation = new ArithmeticOperationModulus();
		
		int a=40, b=6;
		int result1 = operation.modulus(a,b);
		System.out.println("remainder of a and b is: " +result1);
		
	    double p=40.5, q=2;
		double result2 = operation.modulus(p,q);
		System.out.println("remainder of p and q is: " +result2);

	}

}
