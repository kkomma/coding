package abc.aa.amzn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveCharsToMakePalindrome {

	public static void main(String[] args) {

		String s = "srinivasa red dy";
		System.out.println(s);
		s = s.replaceAll(" ", "");
		System.out.println(s);
		System.out.println(s.length());
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character c: s.toCharArray()) {
			if(map.containsKey(c)) {
			map.put(c,  map.get(c) + 1);	
			}else {
				map.put(c,  1);	
			}
		}
		
		if(map.values().size() == 1 || map.values().stream().mapToInt(r->r.intValue()).count() == s.length()) {
		   System.out.println("palindorme can not be formed");
		   System.exit(0);
		}
		
		Iterator<Integer> ii = map.values().iterator();
		System.out.println(Arrays.toString(map.values().toArray()));
		int minCount = 0;
		int singles = 0 ;
		
		while(ii.hasNext()) {
			int next = ii.next();
			if(next > 1 && next % 2 == 1) {
				minCount = minCount + 1;	
				System.out.println("if loop");
			}else if(next == 1 ) {
				singles++;
				System.out.println("else loop");
				minCount = minCount + 1;
			} 
		}
		
		if(singles > 1 || singles == 1) {
			minCount--;
		}
		System.out.println("chars to remove: "+minCount);
	}

}
