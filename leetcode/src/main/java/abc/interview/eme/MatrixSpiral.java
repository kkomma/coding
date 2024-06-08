package abc.interview.eme;

public class MatrixSpiral {

	public static void  getPosition(int matrixSize, int kth) {
		int start = 0;
		int block = matrixSize - 1;
		while (matrixSize > 1 && kth > block * 4) {
			matrixSize -= 2;
			start++;
			kth -= (block * 4);
			block = matrixSize - 1;
		}
		if (kth <= block) {
			System.out.println(start + "," + (start + kth - 1));
		} else if (kth <= block * 2) {
			System.out.println((start + kth - block - 1) + "," + (start + block));
		} else if (kth <= block * 3) {
			System.out.println((start + block) + "," + (start + block - (kth - block * 2 - 1)));
		} else {
			System.out.println((start + block - (kth - block * 3 - 1)) + "," + (start));
		}
	}
	
	
	public static void main(String[] args) {
		getPosition(4,2);
	}

}
