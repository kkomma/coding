package aaa.aa.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class CampusBiker {
	
	//https://leetcode.com/problems/campus-bikes/discuss/460736/Java-heap-(PriorityQueue)-following-intuition
	private class Tuple implements Comparable<Tuple> {
		int distance;
		int workerIndex;
		int bikeIndex;
		public Tuple(int d, int w, int b) {
			distance = d;
			workerIndex = w;
			bikeIndex = b;
		}

		@Override
		public int compareTo(Tuple t) {
			if (t.distance == this.distance) {
				if (t.workerIndex == this.workerIndex) {
					return Integer.compare(this.bikeIndex, t.bikeIndex);
				}
				return Integer.compare(this.workerIndex, t.workerIndex);
			}
			return Integer.compare(this.distance, t.distance);
		}
	}

	public int[] assignBikes(int[][] workers, int[][] bikes) {
		int[] result = new int[workers.length];
		Arrays.fill(result, -1);

		PriorityQueue<Tuple> pq = new PriorityQueue<>();
		for (int i = 0; i < workers.length; i++) {
			for (int j = 0; j < bikes.length; j++) {
				int mDist = Math.abs(workers[i][0] - bikes[j][0]) + 
						Math.abs(workers[i][1] - bikes[j][1]);
				pq.add(new Tuple(mDist, i, j));
			}
		}

		Set<Integer> takenBikes = new HashSet<>();
		while (!pq.isEmpty()) {
			Tuple t = pq.poll();
			if (result[t.workerIndex] == -1 && !takenBikes.contains(t.bikeIndex)) {
				result[t.workerIndex] = t.bikeIndex;
				takenBikes.add(t.bikeIndex);
			}
		}

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampusBiker campusBiker = new CampusBiker();

		int[][] workers = {{0, 0}, {1, 1}, {2, 0}};
		int[][] bikes = {{1, 0}, {2, 2}, {2, 1}};
	
		int[] result = campusBiker.assignBikes(workers, bikes);
	
		System.out.println("Assigned bikes:");
		for (int i = 0; i < result.length; i++) {
			System.out.println("Worker " + i + " -> Bike " + result[i]);
		}
	}

}
