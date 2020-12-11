package methods;

public class ArithmeticOperationAdditionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticOperationAddition operation = new ArithmeticOperationAddition();
		
		int a=10, b=20;
		int result1 = operation.addition(a,b);
		System.out.println("sum of a and b is: " +result1);
		
		int x=15, y=5, z=45;
		int result2 = operation.addition(x,y,z);
		System.out.println("sum of x y and z is: " +result2);
		
		double p=15.5, q=3.0;
		double result3 = operation.addition(p,q);
		System.out.println("sum of p and q is: " +result3);
	}

}
