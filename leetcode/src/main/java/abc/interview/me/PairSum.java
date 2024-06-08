package abc.interview.me;

import java.util.Arrays;

public class PairSum {

	int[] iArray = {1,2,3,4,5,6};
	
	public int[] pairSum(int sum) {
		
		int[] iArrPair = new int[2];
		int rightIndex = iArray.length -1;
		boolean found = false;
		for(int i=0; i < iArray.length; i++){			
			int leftIndex = i;
			while(leftIndex < rightIndex){
				if(iArray[leftIndex] + iArray[rightIndex] == sum){
					iArrPair[0]=iArray[leftIndex];
					iArrPair[1]=iArray[rightIndex];
					found = true;
					break;					
				}				
				leftIndex++;
			}
			if(found){
				break;
			}
		}
		
		return iArrPair;		
	}
	public static void main(String[] args) {
		PairSum pairSum = new PairSum();
		System.out.println(Arrays.toString(pairSum.pairSum(11)));
	}
}
