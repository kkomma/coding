package abc.aaa.samsung;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class GglCache {

	static LinkedHashMap<Integer,Integer> l = new LinkedHashMap<>();
	static LinkedHashSet<Integer> jjj = new LinkedHashSet<>(); 
	
	int n;
	GglCache(int n){
		this.n = n;
	}
	
	public synchronized void put(Integer k,Integer v) {
		l.put(k,v);
		if(l.keySet().size()>n) {
			removeLast();
		}
	}
	
	private  void removeLast() {
		l.remove(l.keySet().iterator().next());		
	}


	public static void main(String[] args) {

		GglCache g = new GglCache(2);
		g.put(1, 2);
		g.put(2, 3);
		g.put(4, 5);
		g.put(6, 7);
		
		System.out.println("print map values");
		for(Entry<Integer, Integer> mapp: l.entrySet()){
		System.out.println(mapp.getKey()+"::::"+mapp.getValue());
		}
		
	}

}
