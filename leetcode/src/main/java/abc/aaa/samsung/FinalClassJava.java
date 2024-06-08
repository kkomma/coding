package abc.aaa.samsung;

public final class FinalClassJava {

	static int id;
	static String name;

	FinalClassJava(){
	}
	FinalClassJava(int id, String name){
		FinalClassJava.id = id;
		FinalClassJava.name = name;
	}

	private static void print() {	
		System.out.println(id+":::"+name);
	}
	public static void main(String[] args) {
		FinalClassJava ff = new FinalClassJava();
		FinalClassJava f = new FinalClassJava(1,"A");
		FinalClassJava.print();
		f = new FinalClassJava(2,"B");
		FinalClassJava.print();
	}

}
