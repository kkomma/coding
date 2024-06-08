package abc.interview.me;

import java.util.Arrays;
import java.util.Iterator;

public class Mutliplemax3 {

	public static void main(String[] args) {
		
		String[] mm = {"a","c","z","x"};
		Arrays.sort(mm);
		for(int i = 0 ; i < mm.length; i++){
			System.out.println(mm[i]);
		}		
		Iterator<String> it = Arrays.asList(mm).iterator();		
		while(it.hasNext()){
			System.out.println("iterator::"+it.next());
		}
				
		int[] m = {3,1,4,2,-2,5,-1};
		Arrays.sort(m);
		for(int i = 0 ; i < m.length; i++){
			System.out.println(m[i]);
		}		
		int ii = 1;
		for(int i = m.length - 1; i >= m.length-3; i-- ){
			ii = ii * m[i];
		}
		System.out.println("lat 3 product::"+ii);
	}

}
