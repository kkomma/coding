package aaalme;

public class AllAnagrams {

	public static void main(String[] args) {
		String str = "abc";		
		char[] arr = str.toCharArray();
		int n = arr.length;
		permute(arr, 0, n - 1);
	}
	
	public static void permute(char[] arr, int l, int r) {
		if (l == r) {
			System.out.println(String.valueOf(arr));
		} else {
			for (int i = l; i <= r; i++) {
				swap(arr, l, i);
				permute(arr, l + 1, r);
				swap(arr, l, i);
			}
		}
	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
