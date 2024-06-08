package aaaaa.lc.Graphs;

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
//133_Clone_Graph.java

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};

public class Clone_Graph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> clones = new HashMap<>();

        clones.put(node, new Node(node.val, new ArrayList<>()));
        q.offer(node);

        while (!q.isEmpty()) {
            Node n = q.poll();

            for (Node neighbour : n.neighbors) {
                if (!clones.containsKey(neighbour)) {
                    clones.put(neighbour, new Node(neighbour.val, new ArrayList<>()));
                    q.offer(neighbour);
                }
                clones.get(n).neighbors.add(clones.get(neighbour));
            }
        }

        return clones.get(node);
    }
    public static void main(String[] args) {

    }
}
