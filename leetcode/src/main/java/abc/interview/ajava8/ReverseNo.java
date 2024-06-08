package abc.interview.ajava8;

public class ReverseNo {

	public static void main(String[] args) {

		int n = 123;
		int sum = 0;
		
		while(n > 0) {			
			int reminder = n % 10;
			sum = (sum*10) + reminder;
			n = n / 10;
		}
		System.out.println("reversed no is:"+sum);
	}

}
