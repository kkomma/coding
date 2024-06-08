package abc.interview.eme;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class CacheImpl {				
		private LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		private int N;
		public CacheImpl(int N) {
			this.N = N;
		}
		private void removeLast() {
			linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
		}
		public synchronized void put(String k, String v) {			
			linkedHashMap.put(k, v);
			if (linkedHashMap.keySet().size() > N) {
				removeLast();
			}			
			System.out.println("print map values");
			for(Entry<String, String> mapp: linkedHashMap.entrySet()){
				System.out.println(mapp.getKey()+"::::"+mapp.getValue());
			}
		}

	public static void main(String[] args) {
		CacheImpl cacheImpl = new CacheImpl(2);
		cacheImpl.put("a", "123");
		cacheImpl.put("b", "1234");
		cacheImpl.put("c", "1235");
		cacheImpl.put("d", "1236");
	}

}

