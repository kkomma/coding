package aaaaa.lc.TopKElements;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
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
//215_Kth_Largest_Element_in_an_Array.java

public class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        int start = 0, end = nums.length - 1, resultIdx = nums.length - k;
        
        while (start < end) {
            int pivotIdx = partition(nums, start, end);
            
            if (pivotIdx < resultIdx) { start = pivotIdx + 1; }
            else if (pivotIdx > resultIdx) { end = pivotIdx - 1; }
            else { return nums[pivotIdx]; }
        }
        
        return nums[start];
    }
    
    private int partition(int[] nums, int start, int end) {
        int pivot = end;
        
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) { ++start; }
            while (start <= end && nums[end] > nums[pivot]) { --end; }
            
            if (start > end) { break; }
            
            swap(nums, start, end);
        }
        
        swap(nums, pivot, end);
        return end;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {

    }
}
