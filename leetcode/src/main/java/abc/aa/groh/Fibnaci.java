package abc.aa.groh;

public class Fibnaci {

	static int fibn(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibn(n-2) + fibn(n-1);
	}

	public static void main(String[] args) {
		for(int i = 1; i <=10; i++){
			System.out.print(fibn(i)+ " ");
		}

	}

}
