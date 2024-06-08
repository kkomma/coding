package abc.aa.amzn;

public class SearchInMatrxSorted {

	static void searchInSortedMatrix(int[][] arr, int rowSize, int colSize, int num) {
		int i = 0;
		int j = colSize-1;

		while (i < rowSize && j >= 0) {
			if (arr[i][j] == num) {
				System.out.print("num Found at " + i + " " + j);
				return;
			}
			if (arr[i][j] > num)
				j--;
			else
				i++;
		}
		System.out.print("num Element not found");
		return;
	}
	
	public static void main(String[] args) {
		int[][] a = { 
				    {1, 2, 3, 4},
				    {5, 6, 7, 8},
				    {9, 10, 11, 12}
		};
	
		searchInSortedMatrix(a,3,4,7);
	}

}
