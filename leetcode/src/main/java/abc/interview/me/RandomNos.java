package abc.interview.me;

import java.util.Random;

public class RandomNos {

	public static void main(String[] args) {
		Random rn = new Random();
		int answer = rn.nextInt(10) + 1;		
		System.out.println("answer::"+answer);
		int randomUSStoreNo = new Random().ints(1, 11).findFirst().getAsInt();
		System.out.println("randomUSStoreNo::"+randomUSStoreNo);

	}

}
