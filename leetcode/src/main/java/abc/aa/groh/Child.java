package abc.aa.groh;

class Parent{
	final int i = 5;
	final void print() {
		System.out.println("this is final method");
	}
	static void printstatic() {
		System.out.println("this is static method");
	}
	private void printprivate() {
		System.out.println("this is private method");
	}
}
public class Child extends Parent{
	static void printstatic() {
		System.out.println("this is static method in child class");
	}
	private void printprivate() {
		System.out.println("this is child private method");
	}
	public static void main(String[] args) {
		Parent in = new Parent();
		in.printstatic();
		
		Parent pa = new Child();
		pa.printstatic();
		
		
		Child inn = new Child();
		inn.printstatic();
		inn.print();
		//Inheritance innn = new Parent(); //not possible
	}
}
