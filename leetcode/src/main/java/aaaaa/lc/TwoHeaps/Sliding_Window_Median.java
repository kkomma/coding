package aaaaa.lc.TwoHeaps;

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
//480_Sliding_Window_Median.java

public class Sliding_Window_Median {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new double[] {};
        }

        MedianQueue mq = new MedianQueue();
        double[] result = new double[nums.length - k + 1];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            mq.offer(nums[i]);

            if (mq.size() == k) {
                result[idx++] = mq.getMedian();
                mq.remove(nums[i + 1 - k]);
            }
        }

        return result;
    }

    class MedianQueue {
        private PriorityQueue<Integer> maxHeap;
        private PriorityQueue<Integer> minHeap;

        public MedianQueue() {
            maxHeap = new PriorityQueue<>();
            minHeap = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void offer(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }

        public boolean remove(int num) {
            return maxHeap.remove(num) || minHeap.remove(num);
        }

        public int size() {
            return maxHeap.size() + minHeap.size();
        }

        public double getMedian() {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : ((long) maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
    public static void main(String[] args) {

    }
}
