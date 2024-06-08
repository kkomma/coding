package abc.interview.me;

public class PrimaryNo {
	
	static boolean prime1(int n){		
		if(n % 2 ==0){
			return false;
		}		
		for(int j=3; j*j <=n; j+=2){
			if(n % j ==0){
				return false;
			}
		}
		return true;
	}
	
	static boolean prime(int n){        
		System.out.println("main prime");
		//loop through the numbers one by one
		for(int i=1; i < n; i++){
			boolean isPrime = true;
			//check to see if the number is prime
			for(int j=2; j < i ; j++){
				//System.out.println("i::"+i+"::j::"+j);
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number
			if(isPrime){
				System.out.print(i + " ");
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		prime(100);
		System.out.println();
		
		System.out.println("main print");
		for(int i=0;i<100; i++){
			if(prime1(i)){
				System.out.print(i+" ");	
			}				
		}
		
	}
}
