package aaalme.arrayproblems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	static Map<Integer, Integer> map = new HashMap<>();
	
	public static void mapOps() {
		  Set<Integer> s = map.keySet();
	        for(Integer ss: s) {
	        	System.out.println("keys::"+ss);
	        }
	        
	        Collection<Integer> t = map.values();
	        for(Integer ss: t) {
	        	System.out.println("vals::"+ss);
	        }
	        
	        for(Map.Entry<Integer, Integer> entries: map.entrySet()) {
	        	System.out.println("enties::"+entries.getKey()+"::"+entries.getValue());
	        	
	        }
	}
    public int[] twoSum(int[] nums, int target) {
        
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
      
        
        throw new IllegalArgumentException("No two sum solution found.");
    }
    
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        mapOps();
        
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);
        System.out.println("Indices: " + result2[0] + ", " + result2[1]);
        mapOps();
    }
}
