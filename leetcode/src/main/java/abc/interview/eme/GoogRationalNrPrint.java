package abc.interview.eme;

import java.text.DecimalFormat;

public class GoogRationalNrPrint {

	public static void main(String[] args) {
		double d1 = 1/3D;
		double d2 = 22/7D;		
		DecimalFormat df = new DecimalFormat("#.00");		
		System.out.println(df.format(4/2f));
		
		String s1 = String.valueOf(d1);
		String s2 = String.valueOf(d2);		
		String[] str = {s1, s2};

		for(String s: str){
			System.out.println("string:"+s);
			int firstIndex = s.indexOf(".") + 1;
			String s1s = s.substring(firstIndex , firstIndex + 1);	
			System.out.println("idx char:"+s1s);
			int secondIndex = s.indexOf(s1s, firstIndex + 1);
			System.out.println("firstIndex::"+firstIndex);
			System.out.println("secondIndex::"+secondIndex);
			String ss = s.substring(0, s.indexOf(".")+1).concat("(").concat(s.substring(firstIndex, secondIndex)).concat(")");
			System.out.println("ss:::"+ss);
			System.out.println("====================");
		}
	}
}
