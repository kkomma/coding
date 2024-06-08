package abc.interview.me;

import java.util.Arrays;

public class ZipString {

	
	private static String countDuplicate(String s) {
	    
		StringBuilder result = new StringBuilder();
	    // count letters
	    int[] counter = new int[300];
	    for (char c : s.toCharArray()) {
	        counter[c]++;
	    }
	    
	    System.out.println(Arrays.toString(counter));

	    // build answer
	    boolean[] isProcessed = new boolean[300];
	    for (char c : s.toCharArray()) {
	        if (isProcessed[c]) {
	            continue;
	        }
	        isProcessed[c] = true;
	        result.append(c).append(counter[c]);
	    }
	    return result.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(countDuplicate("gggggarrrttgyyyyaaaa"));
	}

}
