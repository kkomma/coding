package abc.interview.a.anotes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class NrPair{
	int num;
	int count;
	public NrPair(int num, int count){
		this.num=num;
		this.count=count;
	}
	@Override
	public String toString() {
		return "NrPair [num=" + num + ", count=" + count + "]";
	}
	
}

public class TopKFrequentPriorityQueue {
	
	public List<Integer> topKFrequent(int[] nums, int k) {
		//count the frequency for each element
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: nums){
			if(map.containsKey(num)){
				map.put(num, map.get(num)+1);
			}else{
				map.put(num, 1);
			}
		}
		// create a min heap
		PriorityQueue<NrPair> queue = new PriorityQueue<NrPair>(new Comparator<NrPair>(){
			public int compare(NrPair a, NrPair b){
				return a.count-b.count;
			}
		});
		//maintain a heap of size k. 
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			NrPair p = new NrPair(entry.getKey(), entry.getValue());
			queue.offer(p);
			System.out.println("queue:"+queue.toString());
			if(queue.size()>k){
				queue.poll();
			}
		}

		//get all elements from the heap
		List<Integer> result = new ArrayList<Integer>();
		while(queue.size()>0){
			result.add(queue.poll().num);
		}
		//reverse the order
		Collections.reverse(result);
		//Collections.s

		return result;
	}
	
	
	public static void main(String[] args) {
		int[] a = {2,4,5,2,1,4,7,8,1,4,4};		
		TopKFrequentPriorityQueue wordFrequency = new TopKFrequentPriorityQueue();
		System.out.println(wordFrequency.topKFrequent(a, 2).toString());
		
	}
}

