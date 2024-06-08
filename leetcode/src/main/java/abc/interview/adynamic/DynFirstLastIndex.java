package abc.interview.adynamic;

public class DynFirstLastIndex {

	public static void main(String[] args) {		
		int[] n = {5,1,4,5,5,6,8,5,7,8,10,5};		
		int z = 5;		
		int first=0;
		int last=n.length - 1;

		for(int i=0; i < n.length; i++){
			if(first ==0&& n[i] == z && i<n.length-1){
				first = i;
			}else if(first ==0&& n[i] == z && i == n.length-1){
				first = last = i;
			} else if(n[i] == z){
				last = i;
			}
		}
		if(n[last] != z){
			last=first;
		}
		System.out.println("first::"+first);
		System.out.println("last::"+last);

		first = 0;
		last = n.length-1;

		boolean f = false;
		boolean l = false;
		//int[] n = {1,4,5,5,7,8};		
		
		while(first<last){	
			if(!f){
				if(n[first] == z){
					f = true;
				}	
			}
			if(!l){
				if(n[last] == z){
					l = true;
				}
			}
						
			if(!f){
				first++;				
			}			
			if(!l){
				last--;
			}		
			if(f&&l){
				break;
			}
			
		}

		System.out.println("first::"+first);
		System.out.println("last::"+last);
	}

}
