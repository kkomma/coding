package abc.interview.me;

public class AAAParking {

	public static void main(String[] args) {
		//System.out.println(parking("10:00", "13:21"));		
		parking("10:00", "13:21");
		parking("10:00", "10:21");
		parking("10:00", "10:10");
		parking("00:01", "23:01");
	}

	private static int parking(String E, String L) {       
	   E = E.replace(":", ".");
	   L = L.replace(":", ".");		
	   double s = Double.parseDouble(E);
       double t = Double.parseDouble(L);       
       s = Math.ceil(s);
       t =  Math.ceil(t);
       
       int diff = (int) (t - s);
       System.out.println("diff::"+diff);
       
       int intialHour = 3;
       int remHours = diff - 1;
       int totalBill = 2 + intialHour + (remHours*4);	    
       System.out.println(totalBill);
       return totalBill;
	}

}
