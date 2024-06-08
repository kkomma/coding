package abc.interview.a.anotes;

import java.util.HashSet;
import java.util.Set;

public class TargetSumSet {


	public static void main(String[] args) {

		int[] a = {10,1,2,3,4,5,6};

		Set<Integer> map = new HashSet<>();				
		/*Iterator<Integer> itr = map.iterator();		
		while(itr.hasNext()){
		    map.contains("");	
		}
		 */
		int target = 10;
		for(int i=0; i < a.length; i++) {
			if(map.contains(target - a[i])) {
				System.out.println("true");
				System.out.println(a[i]+"::"+ (target-a[i]));				
			}else {
				map.add(a[i]);	
			}
		}
	}

}
