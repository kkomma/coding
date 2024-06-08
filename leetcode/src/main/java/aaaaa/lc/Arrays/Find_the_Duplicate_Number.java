package aaaaa.lc.Arrays;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;
//287_Find_the_Duplicate_Number.java

public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return -1;
        }

        int slow = nums[0], fast = nums[nums[0]];

        while (nums[slow] != nums[fast]) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    
    public int fingDuplicateMap(int[] nums) {
    	LinkedHashMap<Integer,Integer> m = new LinkedHashMap<>();
    	
    	for(int num : nums) {
    		if(m.containsKey(num)) {
    			m.put(num,m.get(num)+1);
    		}else {
    			m.put(num,1);
    		}    		
    	}
    	for(Map.Entry<Integer,Integer> kvs : m.entrySet()) {
    		if(kvs.getValue() > 1)
    			return kvs.getKey();
    	}
    	return -1;
    }
    
    
    public static void main(String[] args) {
    	
    	Find_the_Duplicate_Number obj = new Find_the_Duplicate_Number();
    	int[] a = {1,2,3,4,5,1,3,8};
    	
    	int retVals = obj.findDuplicate(a);
    	System.out.println(retVals);
    	
    	retVals = obj.fingDuplicateMap(a);
    	System.out.println(retVals);

    }
}
