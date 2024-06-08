package abc.aa.amzn;

enum Trngle{
	NONE("0"),EQUILATERAL("1"),ISOCELES("2"),SCALENE("3");
	String col;
	Trngle(String col){
		this.col = col;
	}
}
public class Traingle {

	public static void main(String[] args) {
		System.out.println(GetTriangleType(5,5,5));
		System.out.println(GetTriangleType(5,5,7));
		System.out.println(GetTriangleType(5,6,7));
	}

	static String GetTriangleType(double a, double b, double c)
	{
		double Epsilon = 1.0E-6;
		if (a+b > c && b+c > a && c+a > b)
		{
			boolean ab = (Math.abs(a-b) < Epsilon);
			boolean bc = (Math.abs(b-c) < Epsilon);
			boolean ca = (Math.abs(c-a) < Epsilon);
			
			if (ab && bc && ca)
				return "Equilateral";
			if (ab || bc || ca)
				return "Isoceles";
			return "Scalene";
		}
		else
		{
			return "None";
		}
	}
}
