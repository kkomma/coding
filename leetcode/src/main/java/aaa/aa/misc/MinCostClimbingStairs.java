package aaa.aa.misc;

public class MinCostClimbingStairs {

	public static void main(String[] args) {

		//int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int[] a = {0,0,1,1};
		
		System.out.println(minCost(a));
	}

	private static int minCost(int[] cost) {		
		int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
		

}
