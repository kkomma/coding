package aaaaa.lc.TwoPointers;

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
//713_Subarray_Product_Less_Than_K.java

public class Subarray_Product_Less_Than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return 0;
        }

        int result = 0, product = 1;

        for (int start = 0, end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (start <= end && product >= k) {
                product /= nums[start];
                start++;
            }

            result += end - start + 1;
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
