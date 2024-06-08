package abc.interview.adynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DynDecompress {

	public static void main(String[] args) {

		String s = "2[bc]3[a]4[e]1[ab]";
		String[] ss = s.split("\\d");

		List<String> list = new ArrayList<String>();        
		for(String sss: ss){
			System.out.println(sss);
			list.add(sss);					
		}
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("2[bc]3[a]4[e]1[ab]");

		StringBuilder sb = new StringBuilder();
		
		int times = 1;
		while (m.find()) {
			int cnt = Integer.parseInt(m.group());
			while(cnt > 0){
				sb.append(list.get(times).toString().replaceAll("\\[", "").replaceAll("\\]", ""));
				cnt--;
			}
			times++;
		}		
		System.out.println(sb.toString());
	}
}
