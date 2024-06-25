package abc.interview.eme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class UniqDigits {
	public static void main(String[] args) {

		Random r = new Random();
		int[] yy = r.ints(10).toArray();

		List<Integer> ll = Arrays.stream(yy).boxed().collect(Collectors.toList()); // Convert to list of integers

		for (Integer i : ll) {
			System.out.println(String.valueOf(i));
		}

		for (Integer t : yy) {
			System.out.println("val::" + t);
		}

		List<Integer> aa = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			aa.add(i);
		}

		List<Integer> aaa = aa.stream().distinct().collect(Collectors.toList());
		for (Integer t : aaa) {
			System.out.println(t);
		}
	}
}
