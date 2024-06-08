package abc.aa.amzn;

import java.util.ArrayList;
import java.util.List;

public class RotateAllStrings {

	public static void main(String[] args) {
		String s = "this is test";
	    for(int i=s.length() -1; i >= 0; i--) {
	    	System.out.print(s.charAt(i));
	    }	    
		System.out.println();

	    String[] ss = s.split(" ");
	    List<String> ll = new ArrayList<>();
	    //for(int i=ss.length -1 ; i >=0; i--) {
	    for(int i = 0; i<=ss.length-1 ;i++) {
	    	ll.add(revStr(ss[i]));
	    }
	    System.out.println("join::"+String.join(" ", ll));	    
	}
	
	static String revStr(String s) {
		char[] c = new char[s.length()];
		int count = 0;
		for(int i = s.length() - 1; i>=0; i--) {
			c[count] = s.charAt(i);
			count++;
		}
		//return new String(c);
		return String.valueOf(c);
	}

}
