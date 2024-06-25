package abc.interview.eme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AaaHashmapGroupBy {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "A");
		map.put(3, "B");
		map.put(4, "B");
		map.put(5, "B");
		map.put(6, "C");
		Map<Object, List<Integer>> valueMap = map.keySet().stream().collect(Collectors.groupingBy(k -> map.get(k)));		
		System.out.println(valueMap.toString());
	}

}
