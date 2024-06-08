package abc.interview.eme;

public class LargestThreeMultiply {

	public static void main(String[] args) {
		int array[] = { 2,5,7,1,8,10,4,-1,6,-2 };
		int[] largest = new int[3];
		int max = 0 , index =0 , multiply = 1;
		for(int j=0; j < 3; j++){
			max = array[0];
			for(int i = 1; i < array.length; i++){
				if(max < array[i]){
					max = array[i];
					index = i;
				}
			}
			largest[j] = max;
			array[index] = Integer.MIN_VALUE;
			multiply = multiply * max;
			System.out.println("max "+j +" "+max);
		}
		System.out.println("multiply::"+multiply);		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}

	}

}
