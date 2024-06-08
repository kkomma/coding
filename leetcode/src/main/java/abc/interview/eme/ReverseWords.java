package abc.interview.eme;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "this is programming";
		
		char[] c = s.toCharArray();
		int len = c.length;
		for(int i=len-1; i>=0; i--){
			Character cc = c[i];
			if(!Character.isSpaceChar(cc)){
				System.out.print(cc+" ");	
			}
		}
		
		System.out.println();
		s = "this is programming";
		if (s == null || s.length() == 0) {
          System.out.println("string is empty");
		}
 
		// split to words by space
		String[] arr = s.split(" ");
		List<String> l = new ArrayList<>();
		for (int i1 = arr.length - 1; i1 >= 0; --i1) {
				l.add(arr[i1]);
		}				
		System.out.println("list::"+String.join(" ", l));
	}

}
