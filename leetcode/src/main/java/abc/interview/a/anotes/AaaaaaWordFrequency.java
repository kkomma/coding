package abc.interview.a.anotes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

class PairWords {
	String word;
	int count;
	PairWords(String word, int count){
		this.word = word;
		this.count = count;
	}
}

public class AaaaaaWordFrequency {

	public static void main(String[] args) {
		String[] s = {"a","b","c","d","e","e","b","e","a","h","a","e"};
		AaaaaaWordFrequency aa = new AaaaaaWordFrequency();
		System.out.println(aa.listMap(s, 2));
	}

	private List<String> listMap(String[] s, int topelms) {
		
		List<String> retList = new ArrayList<>();		
		Map<String, Integer> map = new HashMap<>();
		for(String ss: s) {
			if(map.containsKey(ss)) {
				map.put(ss, map.get(ss) + 1);
			}else {
				map.put(ss , 1);
			}
		}
		PriorityQueue<PairWords> queue = new PriorityQueue<>(new Comparator<PairWords>() {
			public int compare (PairWords p1, PairWords p2) {
				return p1.count - p2.count;
			}
		});
		for(Entry<String, Integer> h: map.entrySet()) {
			PairWords p = new PairWords(h.getKey(), h.getValue());
			queue.offer(p);
			if(queue.size() > topelms) {
				queue.poll();
			}
		}		
		while(queue.size() > 0) {			
			retList.add(queue.poll().word);
		}		
		Collections.reverse(retList);
		return retList;
		
	}

}
