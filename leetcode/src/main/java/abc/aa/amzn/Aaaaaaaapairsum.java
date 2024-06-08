package abc.aa.amzn;

import java.util.HashSet;
import java.util.Set;

public class Aaaaaaaapairsum {

	public static void main(String[] args) {
		int[] a = {1, 5, 7, -1, 5};
		int sum = 6;		
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int i=0; i < a.length; i++) {			
			if(set.contains(sum-a[i])) {
				System.out.println(a[i]+":"+(sum-a[i]));
				count++;
			}else {
				set.add(a[i]);
			}
		}		
		System.out.println(count);
	}

}
