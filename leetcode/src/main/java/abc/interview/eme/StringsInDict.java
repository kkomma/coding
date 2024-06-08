package abc.interview.eme;

import java.util.HashSet;
import java.util.Set;

public class StringsInDict {

	public static void main(String[] args) {

		String s = "googleisawesome";
		Set<String> set = new HashSet<>();
		set.add("google");
		set.add("is");
		set.add("awesome");

		StringBuilder sb = new StringBuilder();
		for(int i=0;i < s.length(); i++) {
			String ss = sb.append(s.charAt(i)).toString();
			if(set.contains(ss)) {
				System.out.println(ss);
				sb.setLength(0);	
			}
		}
	}

}
