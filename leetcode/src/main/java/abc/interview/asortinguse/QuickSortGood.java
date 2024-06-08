
package abc.interview.asortinguse;

public class QuickSortGood {
	public static void main(String[] args) {	
		int[] a = {4,5,1,9,22,13,20,3,7};
		int start = 0;
		int end = a.length-1;
		//QuickSortGood ob = new QuickSortGood();
		//ob.quickSort(a, start, end);
		quickSort(a, start, end);
		
		System.out.println("sorted array");
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
	}
	private static void quickSort(int[] a, int start, int end) {
		if(start<end){
			int partIndex = partition(a, start , end);
			quickSort(a, start,partIndex-1 );
			quickSort(a, partIndex+1,end );	
		}
		
	}
	//https://www.youtube.com/watch?v=COk73cpQbFQ
	//see from 17 mins
	private static int partition(int[] a, int start, int end) {
		int pivot = a[end];        
		int partitionIndex = start-1;
		for(int i=start; i< end; i++){        	
			if(a[i] <= pivot){
				partitionIndex++;   
				int temp = a[i];
				a[i] = a[partitionIndex];
				a[partitionIndex] = temp;
			}
		}
		
		int incrPI = partitionIndex + 1;
		int temp = a[incrPI];
		a[incrPI] = a[end];
		a[end] = temp;		
		return incrPI;
	}
}
