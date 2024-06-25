package aaabigdata;

public class TwoArraysMaxSum {

    public static void main(String[] args) {
        int[] A = {1, 3, -4, 2, -1};
        int K = 3;
        int L = 2;
        System.out.println(maxSumFragments(A, K, L)); // Output: 1

        int[] B = {6, 1, 4, 6, 3, 2, 7, 4};
        int K2 = 3;
        int L2 = 2;
        System.out.println(maxSumFragments(B, K2, L2)); // Output: 24
    }

    public static int maxSumFragments(int[] A, int K, int L) {
        int N = A.length;
        if (K + L > N) return -1; // Impossible to have two non-overlapping subarrays

        // Compute prefix sums
        int[] prefixSums = new int[N + 1];
        for (int i = 0; i < N; i++) {
            prefixSums[i + 1] = prefixSums[i] + A[i];
        }

        int maxK = Integer.MIN_VALUE;
        int maxL = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;

        // Compute max sum for K-length subarray and L-length subarray separately
        for (int i = 0; i <= N - K; i++) {
            int sumK = subarraySum(prefixSums, i, K);
            for (int j = 0; j <= N - L; j++) {
                if (j + L <= i || j >= i + K) { // Ensure non-overlapping
                    int sumL = subarraySum(prefixSums, j, L);
                    result = Math.max(result, sumK + sumL);
                }
            }
        }

        return result;
    }

    public static int subarraySum(int[] prefixSums, int start, int length) {
        return prefixSums[start + length] - prefixSums[start];
    }
}
