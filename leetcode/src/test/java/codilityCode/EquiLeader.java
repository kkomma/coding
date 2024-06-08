package codilityCode;

// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

public class EquiLeader {
	public int solution(int[] A) {
		HashMap<Integer, int[]> candidates2 = new HashMap<>();
		
		boolean atLeastOneEquiLeader = false;
		int dominator = A[0];
		for(int i = 0; i < A.length; i++) {
			if (candidates2.containsKey(A[i])) {
				int[] increment = {candidates2.get(A[i])[0], candidates2.get(A[i])[1] + 1};
				candidates2.put(A[i], increment);
				if (candidates2.get(A[i])[1] > (double) A.length / 2) {
					atLeastOneEquiLeader = true;
					dominator = A[i];
				}
			} else {
				int[] initialiser = {i, 1};
				candidates2.put(A[i], initialiser);
			}
		}
		if(A.length == 1 || !atLeastOneEquiLeader) {
			return (0);
		}
		int dominatorCopies1 = 0;
		int dominatorCopies2 = candidates2.get(dominator)[1];
		int numberEquiLeaders = 0;
		for(int i = 0; i < A.length; i++) {
			if (A[i] == dominator) {
				dominatorCopies1 ++;
				dominatorCopies2 --;
			}
			if (dominatorCopies1 > (double) (i+1) / 2 && dominatorCopies2 > (double) (A.length-i-1) / 2) {
				numberEquiLeaders ++;
			}
		}
		return(numberEquiLeaders);
	}

	public static void main(String[] args) {

		//int[] A = {4,3,4,4,4,2};
		int[] A = {1,2,3,4,5};
		EquiLeader e = new EquiLeader();
		System.out.println(e.solution(A));
		
	}

}
