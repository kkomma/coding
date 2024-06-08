package abc.interview.eme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

	static int[] a= {0,1,0,8,0, 2};
	static int[] aa = new int[10];
	static List<Integer> b = new ArrayList<Integer> ();
	static List<Integer> c = new ArrayList<Integer> ();
	
	public static void simpleSolution(int target) {				
		int pos = 0;
		for(int i=0 ; i < a.length; i++) {
			if(a[i] != target) {
				a[pos++] = a[i];
			}
		}
		while(pos < a.length) {
			a[pos++] = target;
		}
		
		System.out.println("printing array");
		for(int i=0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args){		
		simpleSolution(0);
		for(int i=0;i<a.length; i++){
			if(a[i] > 0){
				b.add(a[i]);
			}else{
				c.add(a[i]);
			}
		}		
		c.addAll(b);		
		
		System.out.println(Arrays.toString(c.toArray()));
		
		for(int y=0;  y < c.size(); y++){			
			aa[y] = Integer.parseInt(c.get(y).toString());
			System.out.print(aa[y]+" ");
		}
	}
}
