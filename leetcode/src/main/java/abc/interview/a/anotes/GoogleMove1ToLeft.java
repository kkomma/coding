package abc.interview.a.anotes;

public class GoogleMove1ToLeft {

	static void rev() {
        int[] a = {1,0,0,1,1,1,0,1};		
		int target = 1;
		int count = a.length-1;		
		for(int i = a.length - 1; i>0; i--) {
			if(a[i] == target) {				
			}else {
				System.out.println("count before:"+count);
				a[count--] = a[i];
				System.out.println("count after:"+count);
			}
		}		
		while(count > 0) {
			a[count--] = target;			
		}		
		for(int i=0;i<a.length;i++) {		
		   System.out.println(a[i]);
		}		
		
	}
	public static void main(String[] args) {		
		rev();
		
		System.out.println("========================");
		int[] a = {1,0,0,1,1,1,0,1};		
		int target = 1;
		int count = 0;		
		for(int i=0;i<a.length;i++) {		
			if(a[i] == target) {				
			}else {
				System.out.println("count before:"+count);
				a[count++] = a[i];
				System.out.println("co:"+a[0]);
				System.out.println("count after:"+count);
			}
		}		
		while(count < a.length) {
			a[count++] = target;			
		}		
		for(int i=0;i<a.length;i++) {		
		   System.out.println(a[i]);
		}		
	}
}
