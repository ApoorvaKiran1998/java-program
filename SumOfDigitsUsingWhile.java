
public class SumOfDigitsUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=456,reminder,sum=0;
		
		while(number>0) {
			reminder=number%10;
			sum=sum+reminder;
			number=number/10;
		}
		System.out.println("sum of the digits of given number is: "+sum);
	}
}
