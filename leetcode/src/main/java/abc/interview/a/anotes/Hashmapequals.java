package abc.interview.a.anotes;

class Complex {
	private double re, im;    

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// Overriding equals() to compare two Complex objects
	@Override
	public boolean equals(Object o) {

		// If the object is compared with itself then return true  
		if (o == this) {
			return true;
		}

		/* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
		if (!(o instanceof Complex)) {
			return false;
		}

		// typecast o to Complex so that we can compare data members 
		Complex c = (Complex) o;

		System.out.println("val1::"+c.re);
		System.out.println("val2::"+c.im);

		// Compare the data members and return accordingly 
		return Double.compare(re, c.re) == 0
				&& Double.compare(im, c.im) == 0;
	}

}

// Driver class to test the Complex class
public class Hashmapequals {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		
		//the below == uses default equals() method in object class
		if (c1 == c2) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}

		if (c1.equals(c2)) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}

	}


}