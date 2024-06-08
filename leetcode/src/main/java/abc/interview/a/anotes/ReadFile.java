package abc.interview.a.anotes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ReadFile {
	
	public static void main(String[] args) {
		
		try {		
			Map<String, Integer> wordCount = new TreeMap<>();
			BufferedReader br = new BufferedReader(new FileReader("log.txt"));
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				String[] strs = line.split(" ");
				for(String str: strs) {
					if(wordCount.containsKey(str)) {
						wordCount.put(str, wordCount.get(str) +1);
					}else {
						wordCount.put(str, 1);
					}
				}
			}
			for(Entry<String, Integer> entry: wordCount.entrySet()) {
				System.out.println(entry.getKey()+"::"+entry.getValue());
			}			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
