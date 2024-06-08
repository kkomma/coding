package abc.aa.groh;

public class SumDigits {

	static int summ(int n) {
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			n = n/10;
			sum = sum + rem;
		}
		if(sum > 9) {
			return summ(sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(summ(9991));
	}

}
