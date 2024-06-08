package sample.code;

public class BinarySearchRotate {

	public static void main(String[] args) {
		int a [] = {21,22,23,24,25,26,27,28,29,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};		
		System.out.println(searchInRotateArray(a, 21));
	}

	private static boolean searchInRotateArray(int[] a, int target) {

		boolean found = false;		
		int low = 0 ;
		int high = a.length - 1;

		while(low <= high) {	
			int mid = (high-low)/2 + low;						
			if(a[mid] == target) {
				return true;
			}
			if(a[low] <= a[mid]) {
				System.out.println("1");
				if(a[low] <= target && target< a[mid]) {				 
					high = mid-1;					
				}else {
					low = mid+1;
				}					
			}else {
				System.out.println("2");
				if(a[mid] < target && target<=a[high]) {				 
					low = mid+1;
				}else {
					high = mid -1;					
				}					
			}

		}

		return found;

	}

}


/*
private static boolean searchInRotateArray(int[] a, int target) {

	boolean found = false;		
	int low = 0 ;
	int high = a.length - 1;

	while(low <= high) {

		int mid = ((high-low)/2) + low;						

		if(a[mid] == target) {
			return true;
		} 			

		if(a[mid] < target && a[low] > target) {				 
			high = mid-1;
		}else if (a[mid] > target && a[high] < target) {
			low = mid + 1;
		}


	}

	return found;

}
 */