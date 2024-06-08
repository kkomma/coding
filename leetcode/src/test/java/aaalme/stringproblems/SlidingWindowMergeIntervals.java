package aaalme.stringproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMergeIntervals {
    
    public static int[][] mergeIntervals(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            
            // If the current interval overlaps with the next interval, merge them
            if (currentInterval[1] >= interval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                // If the current interval doesn't overlap with the next interval, add it to the merged intervals list
                mergedIntervals.add(currentInterval);
                currentInterval = interval;
            }
        }
        
        // Add the last interval to the merged intervals list
        mergedIntervals.add(currentInterval);
        
        // Convert the list to an array and return
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        // Test case 1
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals1 = mergeIntervals(intervals1);
        System.out.println("Merged Intervals 1:");
        for (int[] interval : mergedIntervals1) {
            System.out.println(Arrays.toString(interval));
        }
        
        // Test case 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] mergedIntervals2 = mergeIntervals(intervals2);
        System.out.println("Merged Intervals 2:");
        for (int[] interval : mergedIntervals2) {
            System.out.println(Arrays.toString(interval));
        }
        
        // Test case 3
        int[][] intervals3 = {{1, 4}, {2, 5}, {6, 8}};
        int[][] mergedIntervals3 = mergeIntervals(intervals3);
        System.out.println("Merged Intervals 3:");
        for (int[] interval : mergedIntervals3) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
