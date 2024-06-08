package sample.code;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class RectanleArea {

	static int[][] rect = {				
			{-4,0,1,-1},
			{2,1,-2,0},
			{1,-3,1,3},
			{0,1,2,-2}			
	};
	
	public static void main(String[] args) {
		System.out.println(RectanleArea.maxSubRectangle(rect).getAsInt());
	}
	
	private static OptionalInt maxSubRectangle(int[][] rect) {
		
		int area = 0;
        List<Integer> areaList = new ArrayList<>();
        
		for(int i=0;i<rect.length; i++) {		
			for(int j=0;j<rect.length; j++) {
				area = area + rect[i][j];
				areaList.add(area);
			}
		}		
		return areaList.stream().mapToInt(i->i.intValue()).max();
		
	}

}
