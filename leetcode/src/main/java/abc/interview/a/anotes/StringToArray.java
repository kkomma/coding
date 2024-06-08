package abc.interview.a.anotes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToArray {
	
	public static void strToArr(String[] arr) {
		Pattern p = Pattern.compile("-?\\d+");
		for(String str: arr) {
			Matcher m = p.matcher(str);
			while (m.find()) {
				System.out.println(m.group());
			}
		}
	}		
	
	public static void retNos(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char cc: c) {
			if(Character.isDigit(cc)) {
			 sb.append(cc);	
			}
		}
		System.out.println(Integer.parseInt(sb.toString()));
	}

	public static void main(String[] args) {
		String[] a = {"A1B","C2","34B","5F6","7"};
		strToArr(a);
		
		System.out.println("other way");
		for(String s: a) {
			retNos(s);
		}
	}

}
