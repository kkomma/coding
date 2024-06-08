package abc.interview.me;

public class Factorial {

	public int countTrailingZerosOfFactorial(int n) {
		int count = 0;
		for (int powerOfFive = 5; n / powerOfFive > 0; powerOfFive *= 5) {
			count += n / powerOfFive;
		}
		return count;
	}

	public static void main(String[] args) {
		Factorial a = new Factorial();
		System.out.println(a.countTrailingZerosOfFactorial(100));
	}

}
