package abc.aa.groh;

class Bar {
	public void print() {
		System.out.println("Bar class");
	}
}

public class Foo extends Bar {
	public void print(int i) {
		System.out.println("foo class");
	}
	public static void main(String[] args) {
		Bar b = new Foo();
		b.print();
		//Foo f = new Bar();
		//b.print(111); // compilation error
	}
}
