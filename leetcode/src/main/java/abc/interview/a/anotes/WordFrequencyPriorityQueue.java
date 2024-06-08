package abc.interview.a.anotes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
	String word;
	int count;
	public Pair(String word, int count){
		this.word=word;
		this.count=count;
	}
}

public class WordFrequencyPriorityQueue {
	
	public List<String> topKFrequent(String[] nums, int k) {
		//count the frequency for each element
		HashMap<String, Integer> map = new HashMap<>();
		for(String num: nums){
			if(map.containsKey(num)){
				map.put(num, map.get(num)+1);
			}else{
				map.put(num, 1);
			}
		}

		// create a min heap
		PriorityQueue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>(){
			public int compare(Pair a, Pair b){
				return a.count-b.count;
			}
		});

		//maintain a heap of size k. 
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			Pair p = new Pair(entry.getKey(), entry.getValue());
			queue.offer(p);
			if(queue.size()>k){
				queue.poll();
			}
		}

		//get all elements from the heap
		List<String> result = new ArrayList<>();
		while(queue.size()>0){
			result.add(queue.poll().word);
		}
		//reverse the order
		Collections.reverse(result);

		return result;
	}
	
	
	public static void main(String[] args) {
		String[] str = {"a","b","a","c","d","b"};
		WordFrequencyPriorityQueue wordFrequency = new WordFrequencyPriorityQueue();
		System.out.println(wordFrequency.topKFrequent(str, 2).toString());
		
	}
}

