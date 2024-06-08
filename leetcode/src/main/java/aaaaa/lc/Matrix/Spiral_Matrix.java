package aaaaa.lc.Matrix;

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
//54_Spiral_Matrix.java

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;

        int totalElements = matrix.length * matrix[0].length;

        while (result.size() < totalElements) {
            for (int j = left; j <= right && result.size() < totalElements; j++) {
                result.add(matrix[up][j]);
            }

            for (int i = up + 1; i <= down - 1 && result.size() < totalElements; i++) {
                result.add(matrix[i][right]);
            }

            for (int j = right; j >= left && result.size() < totalElements; j--) {
                result.add(matrix[down][j]);
            }

            for (int i = down - 1; i >= up + 1 && result.size() < totalElements; i--) {
                result.add(matrix[i][left]);
            }

            ++left;
            --right;
            ++up;
            --down;
        }

        return result;
    }

        public static void main(String[] args) {
            Spiral_Matrix spiralMatrix = new Spiral_Matrix();
        
            // Test case 1: Empty matrix
            int[][] matrix1 = {};
            List<Integer> result1 = spiralMatrix.spiralOrder(matrix1);
            System.out.println("Test case 1: " + result1); // Expected output: []
        
            // Test case 2: 1x1 matrix
            int[][] matrix2 = {{1}};
            List<Integer> result2 = spiralMatrix.spiralOrder(matrix2);
            System.out.println("Test case 2: " + result2); // Expected output: [1]
        
            // Test case 3: 3x3 matrix
            int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            List<Integer> result3 = spiralMatrix.spiralOrder(matrix3);
            System.out.println("Test case 3: " + result3); // Expected output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
        
            // Test case 4: 4x5 matrix
            int[][] matrix4 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
            };
            List<Integer> result4 = spiralMatrix.spiralOrder(matrix4);
            System.out.println("Test case 4: " + result4); // Expected output: [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
        
            // Add more test cases as needed...
        }


}
