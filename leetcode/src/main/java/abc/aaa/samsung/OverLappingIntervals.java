package abc.aaa.samsung;

import java.util.*;

public class OverLappingIntervals {

	private static class Event {
		int start;
		int end;

		public Event(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "["+start + "," + end + "],";
		}
		
		
	}

	private static List<Event> merge(Event[] input) {
		//Given [1,3],[2,6],[8,10],[15,18],
		Arrays.sort(input, (x, y) -> x.start - y.start);
		List<Event> result = new LinkedList<>();

		Event current = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i].start > current.end) {
				// System.out.println("Cannot merge. Event starting after this.");
				result.add(current);
				current = input[i];
			} else {
				if (input[i].end <= current.end) {
					// System.out.println("Non need to merge. Event ending earlier or at same
					// time");
				} else if (input[i].end > current.end) {
					// System.out.println("Merge....");
					current.end = input[i].end;
				} else {
					// System.out.println("Cannot happen..........");
				}
			}
		}
		result.add(current);
		return result;

	}

	public static void main(String[] args) {
		//Given [1,3],[2,6],[8,10],[15,18],
		//return [1,6],[8,10],[15,18]
		Event[] events = new Event[4];
		events[0] = new Event(1, 3);
		events[1] = new Event(2, 6);
		events[2] = new Event(8, 10);
		events[3] = new Event(15, 18);			
		List<Event> result = merge(events);
		for (Event event : result) {
			System.out.print(event);
		}
		System.out.println();
	}

}