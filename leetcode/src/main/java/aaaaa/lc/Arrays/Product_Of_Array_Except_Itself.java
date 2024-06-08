package aaaaa.lc.Arrays;

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
//238_Product_Of_Array_Except_Itself.java

public class Product_Of_Array_Except_Itself {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }

        int[] result = new int[nums.length];
        int productSoFar = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = productSoFar;
            productSoFar *= nums[i];
        }

        productSoFar = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= productSoFar;
            productSoFar *= nums[i];
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
