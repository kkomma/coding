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
//75_Sort_Colors.java

public class Sort_Colors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int j = 0, k = nums.length - 1;

        for (int i = 0; i <= k; i++) {
            if (nums[i] == 0) {
                swap(nums, i, j);
                j++;
            } else if (nums[i] == 2) {
                swap(nums, i, k);
                i--;
                k--;
            }
        }

        return;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {

    }
}
