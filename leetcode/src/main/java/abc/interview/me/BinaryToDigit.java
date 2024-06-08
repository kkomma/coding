package abc.interview.me;

public class BinaryToDigit {

	public static void main(String[] args) {
		String s = "111011";
		System.out.println(Integer.parseInt(s,2));		
		int n = 111011;//59
		int decimal=0,p=0;
		while(n!=0)
		{
			decimal = (int) (decimal + ((n%10)*Math.pow(2,p)));
			n=n/10;
			p++;
		}
		System.out.println(decimal);
	}

}

