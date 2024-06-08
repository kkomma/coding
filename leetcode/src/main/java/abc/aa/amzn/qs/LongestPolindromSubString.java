package abc.aa.amzn.qs;

public class LongestPolindromSubString {

	public static void main(String[] args) {
		
		String str = "googleinc";
		String curSubString = "";
		for(int i=0; i < str.length(); i++) {
			for(int j=i+1; j < str.length(); j++) {				
				String s = substringgg(str, i, j);				
				if(isPalin(s)) {
					if(s.length() > curSubString.length()) {
						curSubString = s;	
					}
				}
			}
		}		
		System.out.println(curSubString);
		
		
		System.out.println("optimal soln::"+longestPalindrome(str));
	}

	private static String substringgg(String str, int i, int j) {
		StringBuilder sb = new StringBuilder();
		for(int k=i; k<j; k++ ) {
			sb.append(""+str.charAt(k));
		}
		return sb.toString();
	}

	private static boolean isPalin(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString().equals(s);
	}

	/**********************************************************/
	
	static int lo;
	static int maxLen;
	
	public static String longestPalindrome(String s) {
	    int len = s.length();
	    if (len < 2)
	        return s;

	    for (int i = 0; i < len-1; i++) {
	         extendPalindrome(s, i, i); //assume odd length, try to extend Palindrome as possible
	         extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private static void extendPalindrome(String s, int j, int k) {
	    while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
	        j--;
	        k++;
	    }
	    if (maxLen < k - j - 1) {
	        lo = j + 1;
	        maxLen = k - j - 1;
	    }
	}
	
	
}
