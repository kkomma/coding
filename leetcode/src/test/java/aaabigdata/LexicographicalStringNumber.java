package aaabigdata;

import java.util.Stack;

public class LexicographicalStringNumber {


	public static String parseString(String s) {

		StringBuilder sb= new StringBuilder();
		Stack<Integer> st= new Stack<>();

		for(char ch: s.toCharArray()) {
			int digit = ch-'0';
			while(!st.isEmpty() && digit+st.peek()<=9) {
				int pop=st.pop();

				if(pop+(ch-'0')<=9) {
					digit=pop+digit;
				}
				else {
					st.add(pop);
					break;
				}
			}

			st.add(digit);
		}

		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.reverse().toString();
	}


	public static void main(String[] args) {

		String[] ss = {"356","1119812","226228"};
		
		for (String s:ss) {
			System.out.println(parseString(s));	
		}
		
	}

}
