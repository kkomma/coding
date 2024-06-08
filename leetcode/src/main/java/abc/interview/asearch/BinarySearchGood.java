package abc.interview.asearch;

public class BinarySearchGood {
	
	//numbers must be in ascending order
	private static int[] theArray = {1,5,8,9,11,17,19,20};
	public static int binarySearchForValue(int value){
		int lowIndex = 0;
		int highIndex = theArray.length - 1;
		
		while(lowIndex <= highIndex){
						
			int middleIndex = lowIndex+ ((highIndex - lowIndex) / 2);			
			System.out.println("middleIndex:"+middleIndex);

			if(theArray[middleIndex] < value){
				lowIndex = middleIndex + 1;
			}
			else if(theArray[middleIndex] > value) {
				highIndex = middleIndex - 1;
			}
			else {
				System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
				return middleIndex;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(binarySearchForValue(17));
	}
}
