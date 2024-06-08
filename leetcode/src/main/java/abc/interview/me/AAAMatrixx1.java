package abc.interview.me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AAAMatrixx1 {

	public static void main(String[] args) {

		List<List<Integer>> aa = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		//1,1,0,2
		//3,1,1,1
		l1.add(1);
		l1.add(1);
		l1.add(0);
		l1.add(2);
		aa.add(l1);

		List<Integer> l2 = new ArrayList<Integer>();
		//1,1,0,2
		//3,1,1,1
		l2.add(3);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		aa.add(l2);
		matrix(2,4, aa);
	}

	private static void matrix(int numRows, int numColumns, List<List<Integer>> field) {

		int[][] a = new int[numRows][numColumns];		
		for(List<Integer> t : field){		
			int count = 0;
			for(Object ii: t){				
				a[field.indexOf(t)][count] = Integer.parseInt(ii.toString());
				count++;
			}
		}

		List<Integer> tress = new ArrayList<Integer>();		
		for(List<Integer> t : field){					
			for(Object ii: t){	
				int y = Integer.parseInt(ii.toString());
				if(y>1){
					tress.add(y);	
				}				
			}
		}		
		Collections.sort(tress);
		for(int i=0;i<numRows;i++)
		{
			for(int j=0;j<numColumns;j++)
			{				
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}

		for(int yy = 0; yy <tress.size(); yy++ ){
			
			int stepCounter = 1;
			int totalLength = 0;
			int idx = yy;
			for(int i=0;i<numRows;i++)
			{
				for(int j=0;j<numColumns;j++)
				{		
					if(a[i][j] != 0){
						if(a[i][j] == tress.get(yy)){
							System.out.println("if block value::"+a[i][j]+":step count:::"+stepCounter);
							totalLength = stepCounter + a[i][j];
							idx++;
							break;
						}
						stepCounter++;
					}else if(a[i+1][j] != 0){					
						if(a[i+1][j] == tress.get(yy)){
							System.out.println("if else block value::"+a[i][j]+":step count:::"+stepCounter);
							totalLength = stepCounter + a[i][j];
							idx++;
							break;
						}
					}
				}
				
				if(yy != idx){
					break;
				}
			}
			System.out.println("total length::"+totalLength);
		}
	}
}
