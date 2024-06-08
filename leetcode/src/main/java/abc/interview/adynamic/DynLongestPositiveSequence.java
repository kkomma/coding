package abc.interview.adynamic;

public class DynLongestPositiveSequence {

	public void longestPositiveSequence(int[] a){

		int maxLength = 0;
		int currLength = 0;
		int maxIndex = 0;
		int currIndex = 0;
		boolean flag = false;
		for(int i = 0; i < a.length; i++){
			if(a[i] > 0){
				if(flag == true){
					currLength++;	
				}
				else{
					currIndex = i;
					currLength = 1;
					flag = true;
				}
			}else{
				if(currLength > maxLength){
					maxLength = currLength;
					maxIndex = currIndex;
				}
				flag = false;
			}
		}

		if(maxLength > 0){
			System.out.println("Max Length:" + maxLength + " || maxIndex: "+ ++maxIndex);
		}

	}

	void longestpos(int[] a){
		int curMaxCount = 0;	
		int prevMaxCount = 0;
		int maxIndex = 0;

		for(int i=0; i < a.length; i++){
			boolean inloop = true;	
			
			if(a[i]>0 && inloop){
				curMaxCount++;
			}else{				
				if(prevMaxCount < curMaxCount){					
					prevMaxCount = curMaxCount;
					maxIndex = i;
				}
				curMaxCount = 0;
			}
		}		
		System.out.println("max length::"+prevMaxCount+"||max index::"+maxIndex);
	}

	public static void main(String[] args){
		DynLongestPositiveSequence sequence = new DynLongestPositiveSequence();
		int a[] = new int[] {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6};
		sequence.longestPositiveSequence(a);
		sequence.longestpos(a);

	}
}
