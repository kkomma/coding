package abc.aa.amzn;

import java.util.HashMap;

public class MatrixCommonElementInSortedRows {

	public static void main(String[] args) {

		int[][] a = { {1, 2, 3, 4, 5},{2, 3, 5, 8, 10},{3, 5, 7, 9, 11}, {1, 3, 5, 7, 9}};

		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				if(hm.containsKey(a[i][j])){
					hm.put(a[i][j], hm.get(a[i][j])+1);
					if(hm.get(a[i][j]) == 4){
						System.out.println(a[i][j]);
						//return;
					}
					//continue;
				}else {
					hm.put(a[i][j], 1);	
				}
				
			}	
		}

	}

}
