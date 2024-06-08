package abc.interview.me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AAAMatrixx2 {

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

		List<List<Integer>> tress = new ArrayList<List<Integer>>();		
		
		for(List<Integer> t : field){
			List<Integer> ttt = new ArrayList<Integer>();
			for(Object ii: t){	
				if(Integer.parseInt(ii.toString()) > 1){
					ttt.add(field.indexOf(t));
					ttt.add(t.indexOf(ii));
					tress.add(ttt);
				}
			}
		}		
		
		
		for(List<Integer> gg : tress){
			for(Object g : gg){
				System.out.print("tree pos in matrix::"+g.toString()+" ");
			}
			System.out.println();
		}
	
			
		
		
		//Collections.sort(tress);
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
					
				}

				if(yy != idx){
					break;
				}
			}
			System.out.println("total length::"+totalLength);
		}
	}
}
