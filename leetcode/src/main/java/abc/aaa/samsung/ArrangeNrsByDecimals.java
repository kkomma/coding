package abc.aaa.samsung;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrangeNrsByDecimals {

	static int count(int nr) {
		String s = Integer.toBinaryString(nr);
		System.out.println("nr sent::"+nr);
		System.out.println("binary string::"+s);
		s = s.replaceAll("0", "");
		return s.length();
	}
	
	public static void main(String[] args) {		
		int arr[] = {1, 2, 3, 4, 5, 6};
		LinkedHashMap<Integer, Integer> l = new LinkedHashMap<>();
		for(Integer i : arr) {
			l.put(i, count(i));
		}
		System.err.println(l.toString());
		Map<Integer, Integer> result1 = l.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(
						Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new)
						);
		System.out.println(result1.toString());
		System.out.println(Arrays.toString(result1.keySet().toArray(new Integer[0])));
		Integer[] a = result1.keySet().toArray(new Integer[0]);
		System.out.println(a.length);
	}

}
