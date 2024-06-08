package abc.aa.groh;

public class PrimeNo {

	static boolean isPrime(int n) {
		boolean isPrime = true;
		int count = 0 ;
		for(int i = 2; i < n; i++) {
			count++;
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(count);
		return isPrime;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(12));
	}

}
