package abc.interview.ajava8;

import java.util.Arrays;

public class RotateString {

	public static void main(String[] args) {
		String s = "this is class";
		char[] c = s.toCharArray();
		int n = c.length;
		//leftRotate(c,2,n);
		rightRotate(c,2,n);
		System.out.println(Arrays.toString(c));
	}

	private static void rightRotate(char[] s, int offset, int n) {
		leftRotate(s, n - offset, n);
	}

		
	private static void leftRotate(char[] s, int offset, int n) {
		reverse(s,0,offset-1);
		reverse(s,offset, n-1);
		reverse(s,0,n-1);

	}

	private static void reverse(char[] s, int left, int right) {
		
		while(left<right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
	}

}
