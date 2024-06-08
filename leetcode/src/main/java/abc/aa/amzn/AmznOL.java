package abc.aa.amzn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AmznOL {
	
	public static void main(String[] args) {
		
		System.out.println((int)Math.sqrt(3));
		System.out.println((int)Math.pow(3, 2));
		
		List<List<String>> codeList = new LinkedList<List<String>>();		
		List<String> code = new ArrayList<String>();				
		code.add("apple");
		code.add("apple");
		codeList.add(code);
		
		List<String> code1 = new ArrayList<String>();				
		code1.add("banana");
		code1.add("anything");
		code1.add("banana");
		codeList.add(code1);
		
		List<String> shoppingList = new ArrayList<String>();				
		shoppingList.add("orange");
		shoppingList.add("apple");
		shoppingList.add("apple");
		shoppingList.add("banana");
		shoppingList.add("orange");
		shoppingList.add("banana");
				
		System.out.println("ret::"+checkWinner1(codeList, shoppingList));
		
	}
	
	private static int checkWinner1(List<List<String>> codeList, List<String> shoppingCart) {
		
		List<String> ll = new LinkedList<String>();		
		for(List<String> l: codeList){
			for(Object s: l){
				ll.add(s.toString());
			}			
		}
		shoppingCart = shoppingCart.subList(shoppingCart.indexOf(ll.get(0)), shoppingCart.lastIndexOf(ll.get(ll.size()-1))+1);		
		int f = ll.indexOf("anything");		
		System.out.println("index of anything:::"+f);
		
		for(int m = 0; m < ll.size(); m++){
			if(m == f){
			}else if(ll.get(m).equals(shoppingCart.get(m))){
			}else{
				return -1;
			}
		}
		return 0;
	}


}
