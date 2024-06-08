package abc.aa.amzn;

public class ValidParanthsis {
	public static void main(String[] args) {
		String s = "(())(())";	
		System.out.println(valid(s));
	}

	static boolean valid(String s) {
		int count = 0;
		int n = 0;
		while(n < s.length()) {
			if(s.charAt(n) == '(') {
				count++;
			}else if(s.charAt(n) == ')') {
				if (count == 0){
					return false;
				}
				count--;
			}
			n++;
		}
		return (count == 0);
	}
}
