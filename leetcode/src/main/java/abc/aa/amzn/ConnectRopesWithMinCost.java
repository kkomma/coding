package abc.aa.amzn;

import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/connect-n-ropes-minimum-cost/

public class ConnectRopesWithMinCost {

	static int minCost(int arr[], int n) 
	{ 
		// Create a priority queue 
		PriorityQueue<Integer> pq =  new PriorityQueue<Integer>(); 

		// Adding items to the pQueue 
		for(int i=0;i<n;i++) 
		{ 
			pq.add(arr[i]); 
		} 

		// Initialize result 
		int res = 0; 

		// While size of priority queue  
		// is more than 1 
		while (pq.size() > 1) 
		{ 
			System.out.println("queue:::"+pq.toString());
			// Extract shortest two ropes from pq 
			int first = pq.poll(); 
			int second = pq.poll(); 
			System.out.println("first"+first);
			System.out.println("second"+second);

			// Connect the ropes: update result 
			// and insert the new rope to pq 
			res += first + second; 
			pq.add(first + second); 
		} 

		return res; 
	} 

	public static void main(String[] args) {
		int len[] = {4, 3, 2, 6}; 
		int size = len.length; 
		System.out.println("Total cost for connecting"+ 
				" ropes is " + minCost(len, size)); 
	}

}
