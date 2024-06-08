package abc.interview.a.anotes;

import java.util.Arrays;

public class SearchRange {

	 static int[] nums = {5,7,7,8,8,10};
	 static int search = 8;
	 
	 public static int[] searchRange(int[] nums, int target) {
	        int temp = binarySearch(nums, target);
	        if (temp == -1) {
	            return new int[] {-1, -1};
	        } else {
	            int start = temp, end = temp;
	            while ((start - 1) >= 0 && nums[start-1] == nums[start]) start--;
	            while ((end + 1) <= (nums.length - 1) && nums[end+1] == nums[end]) end++;
	            return new int[] {start, end};
	        }
	    }    

	    private static int binarySearch(int[] nums, int target) {
	        int lo = 0;
	        int hi = nums.length - 1;
	        while (lo <= hi) {
	            int mid = (lo + hi) / 2;
	            if (nums[mid] < target) {
	                lo = mid + 1;
	            } else if (nums[mid] > target) {
	                hi = mid - 1;
	            } else {
	                return mid;
	            }
	        }
	        return -1;
	    }
	    
	public static void main(String[] args) {

		System.out.println(binarySearch(nums, 7));
		System.out.println(Arrays.toString(searchRange(nums, search)));
	}

}
