package abc.aaa.samsung;

import java.util.LinkedHashSet;

public class GglCacheHashSetMe {

	static LinkedHashSet<Character> l = new LinkedHashSet<>();	
	int cacheSize;

	GglCacheHashSetMe(int cacheSize){
		this.cacheSize = cacheSize;
	}

	public synchronized void add(Character c) {		
		l.add(c);
		if(l.size() > 2) {
			removeLast();
		}
	}

	private  void removeLast() {
		l.remove(l.iterator().next());		
	}


	public static void main(String[] args) {		
		GglCacheHashSetMe obj = new GglCacheHashSetMe(2);
		obj.add('a');
		obj.add('b');
		obj.add('c');
		obj.add('d');
		
		System.out.println("print set values");
		for(Character c : l) {
			System.out.println(c);
		}
	}

}