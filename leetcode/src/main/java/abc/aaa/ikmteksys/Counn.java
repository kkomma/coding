package abc.aaa.ikmteksys;

public class Counn {

	public static void main(String[] args) {

		
		int i=0, j=0;
		int counter = 0;
		outer:
			for(i=0;i<4;i++)
			{
				for(j=0;j<2;j++) {
					counter++;
					if(i==2)
						i++;
					continue outer;						
				}
			}
		System.out.println(i +"::"+counter);
	}

}
