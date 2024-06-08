package aaaaa.lc.TopologicalSort;

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
//207_Course_Schedule.java

public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adjList = new ArrayList[numCourses];
        int[] indegrees = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int courseCount = 0;

        for (int i = 0; i < numCourses; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int[] pair : prerequisites) {
            adjList[pair[1]].add(pair[0]);
            ++indegrees[pair[0]];
        }

        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int course = q.poll();
            ++courseCount;

            for (int prereqCourse : adjList[course]) {
                if (--indegrees[prereqCourse] == 0) {
                    q.offer(prereqCourse);
                }
            }
        }

        return courseCount == numCourses;
    }
    public static void main(String[] args) {

    }
}
