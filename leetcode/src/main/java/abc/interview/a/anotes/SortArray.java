package abc.interview.a.anotes;

public class SortArray {

	static int[] a = {4,2,7,1,9,22,3,11,15};
	
	public static void main(String[] args) {
		
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a.length; j++) {				
				if(a[i] > a[j]) {
					swap(i,j);
				}
			}
		}

		System.out.println("sorted array");		
		for(int k=0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

	private static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
