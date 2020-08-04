package lab_5;

public class DivisorCalc {
	private int gcd(int num1, int num2) {
		if (num2 <= num1 && num1 % num2 == 0) {
			return num2;
		} else if (num1 < num2){
			return gcd(num2, num1);
		} else {
			return gcd(num2, num1%num2);
		}
	}
	public static void main(String[] args) {
		
		// Test gcd method
		DivisorCalc test = new DivisorCalc();
		
		// Run some tests!
		System.out.println(test.gcd(3, 9));
		System.out.println(test.gcd(158, 5782319));
		System.out.println(test.gcd(25, 15));
		System.out.println(test.gcd(101, 101));
		System.out.println(test.gcd(48, 148));
		

	}

}
