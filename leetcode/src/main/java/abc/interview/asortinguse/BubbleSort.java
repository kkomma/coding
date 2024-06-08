package abc.interview.asortinguse;

public class BubbleSort {

	private int[] theArray1 = new int[50];
	private int arraySize = 10;
	public void generateRandomArray(){
		for(int i = 0; i < arraySize; i++){
			theArray1[i] = (int)(Math.random()*10)+10;
		}
	}


	private static int[] theArray = {3,2,66,1,99,8};

	private static void bubblesort() {
		for(int i = theArray.length-1; i >1; i--){
			for(int j = 0; j < i; j++){
				if(theArray[j] > theArray[j+1]){
					swap(j, j+1);
				}
			}
		}
	}

	private static void swap(int i, int j) {
		int temp = theArray[i];
		theArray[i] = theArray[j];
		theArray[j] = temp;		
	}

	public static void main(String[] args) {
		bubblesort();
		for(int k = 0; k < theArray.length; k++){
			System.out.print(theArray[k]+" ");	
		}

	}
}
