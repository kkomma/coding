package abc.interview.me;

public class PrintArr {

	static void f(int n)
	{
		if(n>0)
		{
			f(--n);
			System.out.println(n);
			f(--n);
		}
	}

	public static void main(String[] args) {
		f(5);
	}


}
