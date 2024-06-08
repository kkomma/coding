package abc.aaa.ikmteksys;


public class Res1 {

	static int total = 10;
	public void call() {
		int total = 5;
		System.out.println(this.total);
	}
	public static void main(String[] args) {

		Res1 res = new Res1();
		res.call();
	}

}
