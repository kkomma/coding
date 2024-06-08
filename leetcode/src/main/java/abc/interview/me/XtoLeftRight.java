package abc.interview.me;

public class XtoLeftRight {

	static int[] a = {4,3,5,1,8,10,19,20,16};
	
	public static void main(String[] args) {
		
		boolean found = false;
		
		for(int i=1; i < a.length; i ++){						
			
			int count = 1;
			for(int j=0; j < a.length; j ++){				
				if(j<i && a[j] < a[i]){
					count++;
				}else if(j>i && a[j] > a[i]){
					count++;
				}else{
					continue;
				}
			}
			
			if(count == a.length){
				found = true;
				System.out.println("found elem at::"+a[i]);
				//return;
			}
		}
		
		if(!found){
			System.out.println("none found");
		}
	
		/*int[] b = a.clone();		
		for(int yy: b){
			System.out.println(yy);
		}
		
		List<Integer> intList = new ArrayList<Integer>();		
		for(int u: a){
			intList.add(u);
			System.out.println(u);
		}				
		Arrays.sort(a);
		System.out.println();
		
		for(int yy: a){
			System.out.println(yy);
		}*/
		
		
	}
}
