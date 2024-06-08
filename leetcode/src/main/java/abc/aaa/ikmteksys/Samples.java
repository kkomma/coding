package abc.aaa.ikmteksys;

public class Samples {

	private static int count;
	static {
		System.out.println("in block 1");
		count = 10;
	}
	
	private int[] data;
	{		
		System.out.println("in block 2");		
		data = new int[count];
		for(int i=0;i<count;i++) {
			data[i] = i;		
		}
	}
	
	public static void main(String[] args) {

		System.out.println("count = "+count);
		System.out.println("before 1st call to new");
		Samples s  = new Samples();
		System.out.println("before 2nd call to new");
		Samples s1  = new Samples();
		
	}

}
