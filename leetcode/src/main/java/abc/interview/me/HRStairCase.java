package abc.interview.me;

public class HRStairCase {
	final static long _MOD = 1000000007;

	public static long countPathsMemoized(int numberOfSteps) {
		long[] memo = new long[numberOfSteps + 1];
		long numberOfWays = 1;
		for(int i = 1; i < numberOfSteps; i++) {
			numberOfWays += countPathsMemoized(i, memo);
		}
		return numberOfWays % _MOD;
	}

	public static long countPathsMemoized(int numberOfSteps, long[] memo) {
		if(numberOfSteps < 3) {
			return (numberOfSteps > 0) ? numberOfSteps : 0;
		}
		if(memo[numberOfSteps] == 0) {
			memo[numberOfSteps] = (
					countPathsMemoized(numberOfSteps - 1, memo)
					+ countPathsMemoized(numberOfSteps - 2, memo)
					+ countPathsMemoized(numberOfSteps - 3, memo)
					) % _MOD;

		}
		return memo[numberOfSteps];
	}  

	public static void main(String[] args) {
		int numberOfStaircases = 7;
		while(numberOfStaircases-- > 0) {
			int numberOfSteps = 3;
			System.out.println(countPathsMemoized(numberOfSteps));
		}

	}
}
