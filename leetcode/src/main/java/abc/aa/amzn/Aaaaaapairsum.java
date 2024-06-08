package abc.aa.amzn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Aaaaaapairsum {

	public static void main(String[] args) {	
		int[] a = {2,45,7,3,5,1,8,9,2};
		int sum = 10;
		//pairsum(a, sum);
		printSumPairs(a,sum);
	}
	private static void pairsum(int[] a, int sum) {		
		Set<Integer> set = new HashSet<>();
		List<Integer> l = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		for(int i=0; i < a.length;i++) {
			if(set.contains(sum - a[i])) {
				System.out.println(a[i]+"::"+(sum - a[i]));
				//System.out.println("found the target at index:"+i+"::"+l.indexOf(sum - a[i]));
				//break;
			}else {
				set.add(a[i]);
			}			
		}		
	}
	public static void printSumPairs(int []input, int k){
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for(int i=0;i<input.length;i++){
			if(pairs.containsKey(input[i]))
				System.out.println(input[i] +", "+ pairs.get(input[i]));
			else
				pairs.put(k-input[i], input[i]);
		}
	}

}
