package abc.aa.amzn.qs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class BucketAnagrams {

	public static void main(String[] args) {
		String[] str = {"dog","god","tale","late","odg","kasi"};
		bucketAnagrams(str);
	}

	private static void bucketAnagrams(String[] str) {
		Map<String, LinkedList<String>> map = new HashMap<>();
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey(String::compareTo));		
		for(int i = 0 ; i < str.length; i++) {
			String retString = sort(str[i]);
			LinkedList<String> l = new LinkedList<>();			
			if(map.containsKey(retString)) {	
				l = map.get(retString);
			}
			l.add(str[i]);
			map.put(retString, l);
		}		
		Iterator<LinkedList<String>> it = map.values().iterator();
		while(it.hasNext()) {
			LinkedList<String> sss = it.next();			
			if(sss.size() > 1) {
				System.out.println(sss.toString());
			}
		}		
	}	
	static String sort(String str) {
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return (new String(c));
	}

}
