package abc.aaa.samsung;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateSentence {
	
	private static void rotate() {	
		String s = "this is not a joke";
		String[] gg = s.split(" ");
		List<String> sList = Arrays.asList(gg);
		Collections.rotate(sList, 3);
		System.out.println("rotated sentence good way:"+String.join(" ", sList));
	}
	
	private static void strRotate(String[] str, int start, int end) {
	        while (start < end) {
	            String temp = str[start];
	            str[start] = str[end];
	            str[end] = temp;
	            start++;
	            end--;
	        }
	}
	
	private static void strRotateLeft(String s1, int offset) {
		String[] ss = s1.split(" ");
		int len = ss.length;
		offset = offset%len;		
		strRotate(ss,0,len-offset-1);
		strRotate(ss,len-offset,len-1);
		strRotate(ss,0,len-1);
		System.out.println("the best way to do::"+String.join(" ", ss));
	}
	
	private static void strRotateRight(String s1, int offset) {
		 strRotateLeft(s1, s1.length()-offset);
	}
	public static void main(String[] args) {		
		String s1 = "this is a test class";
		strRotateLeft(s1,2);
		strRotateRight(s1,2);
		//rotate();	
	}
}
