package abc.interview.me;

import java.util.*;

public class HashTableDemo {

   public static void main(String args[]) {
      // Create a hash map
      Hashtable<String, Double> balance = new Hashtable<String, Double>();
      
      
      
      Enumeration names;
      String str;
      double bal;

      balance.put("Zara", new Double(3434.34));
      balance.put("Mahnaz", new Double(123.22));
      balance.put("Ayan", new Double(1378.00));
      balance.put("Daisy", new Double(99.22));
      balance.put("Qadir", new Double(-19.08));

	  System.out.println("=========================");
      Set<String> t = balance.keySet();      
      Collection<Double> c = balance.values();
      Iterator<Double> it1 = c.iterator();
      while(it1.hasNext()){
    	  System.out.println(it1.next());
      }
      
      System.out.println("=========================");
      Iterator it = t.iterator();
      while(it.hasNext()){
    	  System.out.println(it.next());
      }
	  System.out.println("=========================");
      // Show all balances in hash table.
      names = balance.keys();
      
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " + balance.get(str));
      }        
      System.out.println();
      
      // Deposit 1,000 into Zara's account
      bal = ((Double)balance.get("Zara")).doubleValue();
      balance.put("Zara", new Double(bal + 1000));
      System.out.println("Zara's new balance: " + balance.get("Zara"));
   }
}
