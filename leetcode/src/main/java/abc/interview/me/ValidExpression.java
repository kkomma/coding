package abc.interview.me;

public class ValidExpression {

	static boolean validParenthesis(String str) {
		int i, n;
		i = 0;
		n = 0;
		while (i < str.length()) {
			if (str.charAt(i) == '(') {
				n++;
			} else if (str.charAt(i) == ')') {
				if (n == 0){
					return false;
				}
				n--;
			}
			i++;
		}
		return (n == 0);
	}
	public static void main(String[] args) {
		System.out.println(validParenthesis("(())()"));
		System.out.println(validParenthesis("(())())"));

	}
}
