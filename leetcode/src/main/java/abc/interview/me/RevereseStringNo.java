package abc.interview.me;

public class RevereseStringNo {


	static int sum(int n){

		int sum = 0;
		if(n < 10){
			return n;
		}
		System.out.println("a1");
		while(n>0){
			int y = n%10;
			sum = sum + y;
			n = n/10;
		}
		System.out.println("sum a2::"+sum);
		System.out.println("a2");
		if(sum > 9){
			return sum(sum);
		}
		System.out.println("a3");
		return sum;
	}

	public static void main(String[] args) {	
		int i = 1234;		
		while(i>0){
			int j = i%10;
			i = i/10;
			System.out.print(j);
		}		
		System.out.println();
		System.out.println("amazon reverse");
		String k = "amazon";
		char[] aa = k.toCharArray();		
		for(int i1 = aa.length - 1; i1 >= 0; i1--) {
			System.out.print(aa[i1]);
		}	
		System.out.println();
		System.out.println("4321 sum::"+sum(3434));
	}
}
