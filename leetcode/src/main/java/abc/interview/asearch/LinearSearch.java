package abc.interview.asearch;

public class LinearSearch {

	private static int[] theArray = {3,2,66,1,99,8,22};

	public static String linearSearchForValue(int value){
		boolean valueInArray = false;
		String indexsWithValue = "";
		for(int i = 0; i < theArray.length; i++){
			if(theArray[i] == value){
				valueInArray = true;
				indexsWithValue+= i + " ";
			}
		}
		if(!valueInArray){
			indexsWithValue = "None";
		}
		System.out.print("The Value was Found in the Following: " + indexsWithValue);
		System.out.println();
		return indexsWithValue;
	}



	public static void main(String[] args) {
		linearSearchForValue(1);
	}

}
