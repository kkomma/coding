package abc.interview.asearch;

public class ImportantPrograms {

	public static void main(String[] args) {

		System.out.println("sum until single");		
		System.out.println(sum(2333));
		System.out.println("printing fibanaci");
		for(int i=1; i < 10; i++) {
			System.out.println("i:"+i);
			System.out.println(fibanaci(i));
		}
		System.out.println("printing prime");	
		for(int i=2; i < 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		System.out.println("reverse a number");
		System.out.println(reverseNr(1234));
		
	}

	private static int reverseNr(int n) {
		int sum = 0;		
		while( n > 0) {
			int rem = n % 10;
			sum = (sum*10) + rem;
			n = n/10;
		}
		return sum;		
	}

	private static int sum(int n) {
		
		int sum = 0;		
		if( n < 10) {
			return n;
		}
		while(n > 0) {	
			int rem = n %10;
			sum = sum + rem;
			n = n/10;
		}		
		if(sum > 9) {
			return sum(sum);
		}		
		return sum;
	}

	private static int fibanaci(int n) {		
		if(n <=1) {
			return n;
		} 
	    return fibanaci(n-1) + fibanaci(n-2);	    
	}

	private static boolean isPrime(int n) {
		
		boolean flag = true;
		for(int i=2; i < n; i++) {
			if( n % i == 0) {
				flag = false;
				return flag;
			}
		}			
		return flag;
	}

}
