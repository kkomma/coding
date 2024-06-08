package abc.interview.me;

public class SumNo {

	public static void main(String[] args) {
		System.out.println(sum(96656));		
		for(int i = 0 ; i <10; i ++){
			System.out.print(fib(i) + " ");
		}
		fib();
	}

	
	private static void fib() {
		int n = 10;
		int i = 0;
		int j = 1;
		
		System.out.println();
		
		while(n > 0){
			int temp = i + j;
			i = j;
			j = temp;
			
			System.out.print(temp+" ");
			n--;
		}
	}
	
	
	
	private static int fib(int i) {
		if (i ==1 || i == 0){
			return i;
		}		
		return fib(i-1) + fib(i-2);
	}

	private static int sum(int i) {
		if(i <10){
			return i;
		}
		int sum = 0;		
		while(i>0){			
			int rem = i %10;
			sum = sum+ rem;
			i = i/10;
		}
		if(sum>9){
			return sum(sum);
		}
		return sum;
	}

}
