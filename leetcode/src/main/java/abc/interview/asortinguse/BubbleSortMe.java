package abc.interview.asortinguse;

public class BubbleSortMe {

	static int[] a = {3,1,65,4,66,2,88,33,99};

	static void swap(int i, int j){		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}
	
	
	public static void main(String[] args) {
		for(int i=0; i < a.length; i++){
			for(int j=0; j < a.length; j++){
				if(a[i] > a[j]){
					swap(i, j);
				}	
			}					
		}		
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
