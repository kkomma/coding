package abc.interview.asearch;


public class SearchInRotatedArrays {

	public static int search(int[] nums, int target) {
		int left = 0;
		int right= nums.length-1;

		while(left<=right){
			int mid = left + (right-left)/2;
			if(target==nums[mid])
				return mid;

			if(nums[left]<=nums[mid]){
				if(nums[left]<=target&& target<nums[mid]){
					right=mid-1;
				}else{
					left=mid+1;
				}
			}else{
				if(nums[mid]<target&& target<=nums[right]){
					left=mid+1;
				}else{
					right=mid-1;
				}
			}    
		}

		return -1;
	}


	public static void main(String args[]) 
	{
		//int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int arr [] = {21,22,23,24,25,26,27,28,29,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};		

		//int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};		
		System.out.println(search(arr, 8));
	}
}
