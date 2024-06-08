package abc.aa.amzn.qs;

public class MissingNrFromSequnce {

	public static void main(String[] args) {
		int[] a = {1,5,4,3,2,7};
		int len = a.length+1;
		int sum = 0;		
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}		
		System.out.println((len*(len+1)/2) - sum);		
	}

}
