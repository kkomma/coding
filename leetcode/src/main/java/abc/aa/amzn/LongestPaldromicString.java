package abc.aa.amzn;

//Java program of above approach 

public class LongestPaldromicString { 
	
	// A utility function to get max of two integers 
	static int max(int x, int y) { 
		return (x > y) ? x : y; 
	} 
	// Returns the length of the longest palindromic subsequence in seq 

	static int lps(char seq[], int i, int j) { 
	// Base Case 1: If there is only 1 character 
		if (i == j) { 
			return 1; 
		} 

	// Base Case 2: If there are only 2 characters and both are same 
		if (seq[i] == seq[j] && i + 1 == j) { 
			return 2; 
		} 

	// If the first and last characters match 
		if (seq[i] == seq[j]) { 
			return lps(seq, i + 1, j - 1) + 2; 
		} 
		
		System.out.println(new String(seq).substring(i,j));

	// If the first and last characters do not match 
		return max(lps(seq, i, j - 1), lps(seq, i + 1, j)); 
	} 


	/* Driver program to test above function */
	public static void main(String[] args) { 
		String seq = "malayalam"; 
		int n = seq.length(); 
		//System.out.printf("The length of the LPS is %d", lps(seq.toCharArray(), 0, n - 1)); 
		
		myLps(seq,n);

	}

	private static void myLps(String seq, int n) {
		
		String strs = null;
		int maxLenSoFar = 0;	
		int count = 1;
		for(int i=0; i < n;i++) {
			for(int j=i+1; j <=n; j++) {
				count++;
				String s = seq.substring(i,j);
				System.out.println(s);
				if(isPalin(s)) {
					System.out.println("yes");
					if(maxLenSoFar < s.length()) {
						strs = s;
						maxLenSoFar = s.length();
					}					
				}
			}
		}
		
		System.out.println("longest palin::"+strs);
		System.out.println("count::"+count);
		System.out.println("square"+(n*n));
		
	}

	private static boolean isPalin(String s) {
		StringBuilder sb = new StringBuilder(s);		
		return sb.reverse().toString().equals(s);
	} 
	
	
	
} 
