package abc.aa.groh;

public class Factorial {

	static int fact(int n) {
		int product = 1;
		while(n > 0 ) {
			product = product * n;
			n--;
		}
		return product;
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
