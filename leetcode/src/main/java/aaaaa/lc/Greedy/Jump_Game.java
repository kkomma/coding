package aaaaa.lc.Greedy;

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
//55_Jump_Game.java

public class Jump_Game {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int goal = nums.length - 1, maxJump = nums[0];

        for (int i = 0; i <= maxJump; i++) {
            if (maxJump >= goal) {
                return true;
            }
            maxJump = Math.max(maxJump, i + nums[i]);
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
