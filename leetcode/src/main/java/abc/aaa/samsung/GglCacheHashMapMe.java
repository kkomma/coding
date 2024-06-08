package abc.aaa.samsung;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class GglCacheHashMapMe {

	static LinkedHashMap<Character,Integer> l = new LinkedHashMap<>();	
	int cacheSize;

	GglCacheHashMapMe(int cacheSize){
		this.cacheSize = cacheSize;
	}

	public synchronized void put(Character c, int i) {		
		l.put(c,i);
		if(l.keySet().size() > 2) {
			removeLast();
		}
	}

	private  void removeLast() {
		l.remove(l.keySet().iterator().next());		
	}


	public static void main(String[] args) {		
		GglCacheHashMapMe obj = new GglCacheHashMapMe(2);
		obj.put('a', 0);
		obj.put('b', 1);
		obj.put('c', 2);
		obj.put('d', 3);

		System.out.println("print map values");
		for(Entry<Character, Integer> mapp: l.entrySet()){
			System.out.println(mapp.getKey()+"::::"+mapp.getValue());
		}
	}

}
