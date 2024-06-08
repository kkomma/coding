package abc.interview.eme;

//Structure of a point in 2D space
class Pointt
{
	int x, y;
	Pointt(int x, int y){
		this.x = x;
		this.y = y;
	}
};

public class Square {

	//A utility function to find square of distance
	//from point 'p' to poitn 'q'
	int distSq(Pointt p, Pointt q)
	{
		return (p.x - q.x)*(p.x - q.x) +
				(p.y - q.y)*(p.y - q.y);
	}

	//This function returns true if (p1, p2, p3, p4) form a
	//square, otherwise false
	boolean isSquare(Pointt p1, Pointt p2, Pointt p3, Pointt p4)
	{
		int d2 = distSq(p1, p2);  // from p1 to p2
		int d3 = distSq(p1, p3);  // from p1 to p3
		int d4 = distSq(p1, p4);  // from p1 to p4

		// If lengths if (p1, p2) and (p1, p3) are same, then
		// following conditions must met to form a square.
		// 1) Square of length of (p1, p4) is same as twice
		//    the square of (p1, p2)
		// 2) p4 is at same distance from p2 and p3
		if (d2 == d3 && 2*d2 == d4)
		{
			int d = distSq(p2, p4);
			return (d == distSq(p3, p4) && d == d2);
		}

		// The below two cases are similar to above case
		if (d3 == d4 && 2*d3 == d2)
		{
			int d = distSq(p2, p3);
			return (d == distSq(p2, p4) && d == d3);
		}
		if (d2 == d4 && 2*d2 == d3)
		{
			int d = distSq(p2, p3);
			return (d == distSq(p3, p4) && d == d2);
		}

		return false;
	}

	//Driver program to test above function
	public static void main(String[] args)
	{		
		Pointt p1 = new Pointt(20,10);
		Pointt p2 = new Pointt(10,20);
		Pointt p3 = new Pointt(20,20);
		Pointt p4 = new Pointt(10,10);		
		Square s = new Square();		
		String ss = s.isSquare(p1, p2, p3, p4)? "yes": "no";		
		System.out.println("isSquare::"+ss);
	}
	
}