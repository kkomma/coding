package abc.interview.me;

public class MissingNoTwoArrays {

	static void missingNo(){
		int[] m = {1,4,5,7,99};
		int[] n = {1,4,7,99};
		int sum = 0;
		int sum1 = 0;
		int max = m.length > n.length ? m.length : n.length;
		for(int i = 0 ; i < max; i++){
			if(i <= m.length - 1) {
				sum1 = sum1 + m[i];	
			}
			if(i <= n.length - 1) {
				sum = sum + n[i];
			}
		}
		int missingNr= sum - sum1 ;
		System.out.println("missing nr::"+Math.abs(missingNr));
	}

	public static void main(String[] args) {
		missingNo();
	}

}
