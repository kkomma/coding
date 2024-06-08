package abc.aa.aalat;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueuee {

	public static void main(String[] args) {

		int[] a = {7,8,9,0,1,2,3,4,5,6};		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				if(a<b) {
					return 1;	
				}else if(a>b) {
					return -1;	
				}else if(a==b) {
					return 0;	
				}
				return -1;				 
			}
		});		
		for(int i=0 ; i < a.length;i++) {
			p.add(a[i]);
		}
		System.out.println(p.poll());		
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0 ; i < a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set.iterator().next());

	}

}
