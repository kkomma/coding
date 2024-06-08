package abc.interview.eme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
/*
Here is 2d array where 
S- Source
D-Destination
G-Point must be visited
." . "Free paths
"*"Block Paths
*/

public class Shortestpath {
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

		//matrix(2,4, aa);
		
		Point p = new Point(1, 1);
		String[] pp = { "*", ".",".","D",".","G",".","*","S",".","G",".","G"}; 		
		visit(pp, p);
	}
	
	public static void visit(String []map , Point start){
        int []x = {0,0,1,-1};//This represent 4 directions right, left, down , up
        int []y = {1,-1,0,0};
        LinkedList<Point> q = new LinkedList<Point>();
        q.add(start);
        int n = map.length;
        int m = map[0].length();
        int[][]dist = new int[n][m];
        for(int []a : dist){
            Arrays.fill(a,-1);
        }
        dist[start.x][start.y] = 0;
        while(!q.isEmpty()){
            Point p = q.removeFirst();
            for(int i = 0; i < 4; i++){
                int a = p.x + x[i];
                int b = p.y + y[i];
                if(a >= 0 && b >= 0 && a < n && b < m && dist[a][b] == -1 && map[a].charAt(b) != '*' ){
                    dist[a][b] = 1 + dist[p.x][p.y];
                    q.add(new Point(a,b));
                }
            }
        }
        
        for(Point p: q){
        	System.out.println(p.x);
        	System.out.println(p.y);
        }
    }
}
