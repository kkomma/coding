package aaa.aa.misc;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {

	public static String removeDuplicates(String s, int k) {
	    StringBuilder sb = new StringBuilder(s);
	    Stack<Integer> counts = new Stack<>();
	    
	    for (int i = 0; i < sb.length(); ++i) {
	        if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
	            counts.push(1);
	        } else {
	            int incremented = counts.pop() + 1;
	            if (incremented == k) {
	                sb.delete(i - k + 1, i + 1);
	                i = i - k;
	            } else {
	                counts.push(incremented);
	            }
	        }
	    }
	    return sb.toString();
	}
	
	public static void main(String... args) {
		String s = "pbbcggttciiippooaais";
		int groupCount = 2;
		System.out.println(removeDuplicates(s,groupCount));
		
	}
	
}
