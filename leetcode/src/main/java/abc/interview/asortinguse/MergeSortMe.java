package abc.interview.asortinguse;

public class MergeSortMe {

	
    static int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	
    static void mergeSort(){		
    	int low = 0;
    	int high = inputArr.length - 1;
    	int mid = low + (high-low) / 2;    	
    	merge(low, mid, high);    
	}
	
	private static void merge(int low, int mid, int high) {
		
		int[] a = inputArr.clone();
		
		if(low < high){			
			//merge(low, mid, a);
		}
		
	}

	public static void main(String[] args) {
	
//        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		
		mergeSort();

                
	}

}
