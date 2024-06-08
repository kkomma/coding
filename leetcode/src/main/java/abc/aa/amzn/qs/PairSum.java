package abc.aa.amzn.qs;

import java.util.HashSet;
import java.util.Set;

public class PairSum {
	public static void main(String[] args) {
		int[] a = {1, 5, 7, -1, 5};
		int sum = 6;		
		pairsum(a, sum);
	}

	private static void pairsum(int[] a, int sum) {
		Set<Integer> set = new HashSet<>();
		Set<String> uniqSet = new HashSet<>();
		int count = 0;
		for(int i=0; i < a.length; i++) {			
			if(set.contains(sum-a[i])) {				
				uniqSet.add(retString(a[i] , sum-a[i]));
				count++;
			}else {
				set.add(a[i]);
			}
		}		
		System.out.println(uniqSet.toString());		
		System.out.println(count);
	}
	
	private static String retString(int i, int j) {
		return i < j ? String.valueOf(i) +":"+ String.valueOf(j) : 
			String.valueOf(j)  +":"+ String.valueOf(i);		
	}

}
