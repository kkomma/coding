package aaa.aa.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.PriorityQueue;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.Comparator;

class Pair {
	String word;
	int count;
	public Pair(String word, int count){
		this.word=word;
		this.count=count;
	}
}


public class SongsGeneresMap {

	public static void main(String[] args) {

		Map<String, List<String>> userSongs  = new HashMap<>();
		Map<String, List<String>> songGenres = new HashMap<>();

		List<String> u1 = asList("song1", "song2", "song3", "song4", "song8");
		List<String> u2 = asList("song5", "song6", "song7");	   	
		userSongs.put("David", u1);
		userSongs.put("Emma", u2);

		List<String> s1 = asList("song1", "song3");
		List<String> s2 = asList("song7");	   	
		List<String> s3 = asList("song2", "song4");	   	
		List<String> s4 = asList("song5", "song6");	   	
		List<String> s5 = asList("song8", "song9");	   	

		songGenres.put("Rock", s1);
		songGenres.put("Dubstep", s2);
		songGenres.put("Techno", s3);
		songGenres.put("Pop", s4);
		songGenres.put("Jazz", s5);

		System.out.println(songsGeneresMap(userSongs,songGenres).toString());

	}

	private static Map<String, List<String>> songsGeneresMap(Map<String, List<String>> userSongs, Map<String, List<String>> songGenres) {

		Map<String, List<String>> retMap = new HashMap<>();
		Map<String, String> generesList = new HashMap<>();

		for(Map.Entry<String, List<String>> map: songGenres.entrySet()) {
			for(String s: map.getValue()) {
				generesList.put(s,map.getKey());
			}			
		}

		for(Map.Entry<String, List<String>> map: userSongs.entrySet()) {
			HashMap<String,Integer> l = new HashMap<>(); 
			for(String s: map.getValue()) {
				if(generesList.containsKey(s)) {
					String key = generesList.get(s);
					if(!l.containsKey(key)) {					
						l.put(key,1);
					}else {						
						l.put(key,l.get(key) +1);
					}
				}
			}

			int k = Integer.MIN_VALUE;
			for(Map.Entry<String, Integer> m: l.entrySet()) {
				if(m.getValue()>=k) {	
					k = m.getValue();
			   }
		    }
			
			List<String> result = new ArrayList<>();							
			for(Map.Entry<String, Integer> entry: l.entrySet()){
				if(entry.getValue()>=k) {
					result.add(entry.getKey());
				}
			}
			retMap.put(map.getKey(), result);
		}

		return retMap;
	}

}
