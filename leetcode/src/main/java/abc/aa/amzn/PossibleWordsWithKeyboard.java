package abc.aa.amzn;

import java.util.*;
import java.io.*;

public class PossibleWordsWithKeyboard {
    public static ArrayList<String> getString(String[] n,int idx){
        ArrayList<String>res=new ArrayList<String>();
        if(idx==n.length){
            res.add("");
            return res;
        }else{
            ArrayList<String>preLetter=new ArrayList<String>();
            ArrayList<String>res2=getString(n,idx+1);
            if(n[idx].equals("2")){
                Collections.addAll(preLetter,"a","b","c");
            }else
            if(n[idx].equals("3")){
                Collections.addAll(preLetter,"d","e","f");
            }else
            if(n[idx].equals("4")){
                Collections.addAll(preLetter,"g","h","i");
            }else
            if(n[idx].equals("5")){
                Collections.addAll(preLetter,"j","k","l");
            }else
            if(n[idx].equals("6")){
                Collections.addAll(preLetter,"m","n","o");
            }else
            if(n[idx].equals("7")){
                Collections.addAll(preLetter,"p","q","r","s");
            }else
            if(n[idx].equals("8")){
                Collections.addAll(preLetter,"t","u","v");
            }else
            if(n[idx].equals("9")){
                Collections.addAll(preLetter,"w","x","y","z");
            }
            for(String pr:preLetter){
                for(String r:res2){
                
                    res.add(pr+r);
                }
            }
        }
        return res;
    }
    
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T=Integer.parseInt(br.readLine());
	    while(T-->0){
	        br.readLine();
	        String[]s=br.readLine().split(" ");
	        ArrayList<String> r=getString(s,0);
	        for(String word:r){
	            System.out.print(word+" ");
	        }
	        System.out.println();
	    }
		
	}
}