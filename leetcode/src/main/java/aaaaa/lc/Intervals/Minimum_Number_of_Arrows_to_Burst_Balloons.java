package aaaaa.lc.Intervals;

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
//452_Minimum_Number_of_Arrows_to_Burst_Balloons.java

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (p1, p2) -> {
            return p2[0] - p1[0];
        });

        int arrowPos = points[0][0];
        int arrowCount = 1;

        for (int i = 1; i < points.length; i++) {
            if (points[i][1] >= arrowPos) {
                continue;
            } else {
                ++arrowCount;
                arrowPos = points[i][0];
            }
        }

        return arrowCount;
    }
    public static void main(String[] args) {

    }
}
