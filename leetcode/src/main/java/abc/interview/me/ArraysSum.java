package abc.interview.me;

import java.util.LinkedList;

public class ArraysSum {

	static int[] a = {1,2,3,4,5,6};
	static  int[] b = {2,3,4,5,6,7,8};
	
	static LinkedList<Integer> split(int n){
		LinkedList<Integer> ll = new LinkedList<Integer>(); 			
		while(n > 0){
			ll.push(n%10);
			n = n /10;
		}
		while(!ll.isEmpty()){
			System.out.print(ll.pop()+"::::");	
			}		return ll;		
	}
	public static void main(String[] args) {
		
		int max = a.length < b.length? b.length: a.length;
		int min = a.length < b.length? a.length: b.length;
		int[] c= new int[max];

		for(int i=0 ; i <max; i++){			
			if(i < min){
				c[i] = a[i] + b[i];	
			}else{
				c[i] = b[i];
			}
		}
			
		System.out.println();
		for(int i: c){
			if(i>9){
				LinkedList<Integer> ll = split(i);
				while(!ll.isEmpty()){
				System.out.print(ll.pop()+" ");	
				}
			}else{
				System.out.print(i+" ");	
			}			
		}		
	}

}
