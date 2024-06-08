package abc.aa.groh;

class A5 {
	public A5() {
		this(10);
		System.out.println("this called");
	}
	public A5(int i) {
		System.out.println(1);
	}
	void A5() {
		System.out.println(2);
	}
	void A5(int j) {
		System.out.println(3);
	}
}

public class A4{
	public static void main(String[] args) {
		new A5().A5();
	}
}




