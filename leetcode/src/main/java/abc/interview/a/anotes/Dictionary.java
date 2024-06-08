package abc.interview.a.anotes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dictionary {
	
	static Map<Character, Integer> map = new LinkedHashMap<>();

	public static void main(String[] args) {

		String str = "AAAABBBCCDAA";

		for(Map.Entry<Character, Integer> map: countCharMap(str).entrySet()) {
			System.out.println(map.getKey()+":"+map.getValue());
		}
	}

	private static Map<Character, Integer> countCharMap(String str) {

		char[] a = str.toCharArray();
		
		for(int i=0 ; i < a.length; i++) {			
			if(containsKey(a[i]) == 1){
				map.put(a[i], map.get(a[i]) +1 );
			}else {
				map.put(a[i], 1);
			}
		}		
		
		return map;
	}
	
	
	private static int containsKey(Character c) {
		
		if(map.get(c) != null) {
			return 1;
		}else {
			return 0;
		}		
		
	}

}
