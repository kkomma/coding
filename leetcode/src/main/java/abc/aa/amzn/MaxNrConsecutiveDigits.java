package abc.aa.amzn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MaxNrConsecutiveDigits {

	public static void main(String[] args) {
		int[] a = {1,1,2,3,3,3,1,1,1,1,4,5,5,4,4};
		maxDigits(a, a.length);
	}
	private static void maxDigits(int[] a, int length) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int count = 1 ;
		int i;
		for(i = 1; i < length; i++) {
			if(a[i-1] == a[i]) {
				count++;
			}else {
				if(map.containsKey(a[i-1]) && map.get(a[i-1]) < count) {
					map.remove(a[i-1]);
					map.put(a[i-1], count);
				}else {
					map.put(a[i-1], count);
				}
				count = 1;
			}
		}
		if(map.containsKey(a[i-1]) && map.get(a[i-1]) < count) {
			map.remove(a[i-1]);
			map.put(a[i-1], count);
		}else {
			map.put(a[i-1], count);
		}
		System.out.println("map string::"+map.toString());
		System.out.println("map max value::"+map.values().stream().max(Integer::compare).get());
		System.out.println("keys sum::"+map.keySet().stream().mapToInt(r->r.intValue()).sum());
		System.out.println("map max value and key::"+map.entrySet().stream().max(Map.Entry.comparingByValue(Integer::compare)).get());
		System.out.println("map max key and value::"+map.entrySet().stream().max(Map.Entry.comparingByKey(Integer::compare)).get());
		
		Map<Integer, Integer> result1 = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(
						Collectors.toMap(
								Map.Entry::getKey, 
								Map.Entry::getValue,
						        (oldValue, newValue) -> oldValue, 
						        LinkedHashMap::new)
						);
		System.out.println("result1:"+result1);
	}
	
}
