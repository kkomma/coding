import java.util.*;
/**
 * A group of friends went on holiday and sometimes lent each other money. For
 * example, Alice paid for Bill's lunch for $10. Then later Chris gave Alice $5
 * for a taxi ride. We can model each transaction as a tuple (x, y, z) which
 * means person x gave person y $z. Assuming Alice, Bill, and Chris are person
 * 0, 1, and 2 respectively (0, 1, 2 are the person's ID), the transactions can
 * be represented as [[0, 1, 10], [2, 0, 5]].
 * 
 * Given a list of transactions between a group of people, return the minimum
 * number of transactions required to settle the debt.
 * 
 * Note:
 * A transaction will be given as a tuple (x, y, z). Note that x ≠ y and z > 0.
 * Person's IDs may not be linear, e.g. we could have the persons 0, 1, 2 or
 * we could also have the persons 0, 2, 6.
 * 
 * Example 1:
 * Input:
 * [[0,1,10], [2,0,5]]
 * Output:
 * 2
 * 
 * Explanation:
 * Person #0 gave person #1 $10.
 * Person #2 gave person #0 $5.
 * Two transactions are needed. One way to settle the debt is person #1 pays
 * person #0 and #2 $5 each.
 * 
 * Example 2:
 * Input:
 * [[0,1,10], [1,0,1], [1,2,5], [2,0,5]]
 * Output:
 * 1
 * 
 * Explanation:
 * Person #0 gave person #1 $10.
 * Person #1 gave person #0 $1.
 * Person #1 gave person #2 $5.
 * Person #2 gave person #0 $5.
 *  Therefore, person #1 only need to give person #0 $4, and all debt is settled.
 */

public class OptimalAccountBalancing465 {
    public int minTransfers(int[][] transactions) {
        Map<Integer, Integer> balances = getBalances(transactions);
        int[] posNeg = new int[balances.size()];
        int i =0;
        for (int b: balances.values()) {
            posNeg[i++] = b;
        }
        return dfs(posNeg, 0);
    }

    private int dfs(int[] posNeg, int start) {
        int L = posNeg.length;
        while (start < L && posNeg[start] == 0) start++;
        if (start == L) return 0;
        int res = Integer.MAX_VALUE;

        for (int i=start+1; i<L; i++) {
            if (posNeg[start] * posNeg[i] >= 0) continue;
            int pre = posNeg[i];
            posNeg[i] += posNeg[start];
            res = Math.min(res, dfs(posNeg, start+1) + 1);
            posNeg[i] = pre;
        }
        return res;
    }

    private Map<Integer, Integer> getBalances(int[][] transactions) {
        Map<Integer, Integer> balances = new HashMap<>();
        for (int[] tx: transactions) {
            balances.put(tx[0], balances.getOrDefault(tx[0], 0) - tx[2]);
            balances.put(tx[1], balances.getOrDefault(tx[1], 0) + tx[2]);
        }
        return balances;
    }

}
