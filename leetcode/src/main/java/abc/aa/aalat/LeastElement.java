package abc.aa.aalat;

public class LeastElement {

	public static void main(String[] args) {
		int[] a = {7,8,9,0,1,2,3,4,5,6};		
		int min = a[0];		
		for(int i=1 ; i < a.length;i++) {			
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(min);
		
		int minn  = 0;
		for(int i=0 ; i < a.length-1;i++) {			
			if(a[i]>a[i+1]) {
				minn = a[i+1];
				break;
			}
		}
		System.out.println(minn);

	}

}
