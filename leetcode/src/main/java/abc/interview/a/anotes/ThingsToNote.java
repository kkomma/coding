package abc.interview.a.anotes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
 *** if overridden equals() says two keys are same (default equals() doesn't say true as the two keys will have two memory references), they should produce same hashcode(), 
 *hence hashcode() should be overridden 
 *** in order to produce same hash code and there by index for bucket, hashcode() should be overridden to produce same index 
 
 //https://www.tutorialspoint.com/java/java_basic_operators.htm
 
 //HashTable vs HashMap vs Concurrent HashMap all kinds of Map implementations
 https://www.youtube.com/watch?v=APL28XpFP0c
 //hash code and equals contract
 https://www.youtube.com/watch?v=IwUwIrz9Ge8
  
thread life cycle - new --> runnable-->non-runnable-->running-->terminated();
   
The problem is caused by the un-overridden method "hashCode()". The contract between equals() and hashCode() is:
1) If two objects are equal, then they must have the same hash code.
2) If two objects have the same hash code, they may or may not be equal.

hashCode() method
hashCode() method is used to get the hash Code of an object. hashCode() method of object class returns the memory reference of object in integer form. 
Definition of hashCode() method is public native hashCode(). It indicates the implementation of hashCode() is native because there is not any direct method 
in java to fetch the reference of object. It is possible to provide your own implementation of hashCode().
In HashMap, hashCode() is used to calculate the bucket and therefore calculate the index.

equals() method
equals method is used to check that 2 objects are equal or not. This method is provided by Object class. You can override this in your class to provide your 
own implementation.

HashMap uses equals() to compare the key whether the are equal or not. If equals() method return true, they are equal otherwise not equal.
index = hashCode(key) & (n-1).

MyClass a = new MyClass();
MyClass b = new MyClass();

since default hashcode() returns memory reference, even though above keys a and b of same type, they will be stored in two memory references if default hashcode() is not overridden. 
since for both a and b returned hash value is different (two memory refernces), the index derived will be different. so it should be overridden

//because of not overridng the hashcode(), map.containsKey("b") will fail and will result in issues 
 
since default euqals() method does object comparision ( memory references(a and b have diff refs) and not the contents, so it will return false. in order to test for contents eqaulity 
equals() method should be overridden      

As a side note, when we override equals(), it is recommended to also override the hashCode() method. If we don�t do so, equal objects may get different hash-values; and hash based collections, 
including HashMap, HashSet, and Hashtable do not work properly (see this for more details). We will be coverig more about hashCode() in a separate post.

class Complex {
    private double re, im;    
     
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
}
 
// Driver class to test the Complex class
public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1 == c2) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}


protected  Object	clone() 
          Creates and returns a copy of this object.
          
 boolean	equals(Object obj) 
          Indicates whether some other object is "equal to" this one.
          
protected  void	finalize() 
          Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
          
 Class<? extends Object>	getClass() 
          Returns the runtime class of an object.
          
 int	hashCode() 
          Returns a hash code value for the object.
          
 void	notify() 
          Wakes up a single thread that is waiting on this object's monitor.
          
 void	notifyAll() 
          Wakes up all threads that are waiting on this object's monitor.
          
 String	toString() 
          Returns a string representation of the object.
          
 void	wait() 
          Causes current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object.
          
 void	wait(long timeout) 
          Causes current thread to wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
                    
 void	wait(long timeout, int nanos)
           Causes current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or some other thread interrupts the current thread, or a certain amount of real time has elapsed.

 */

public class ThingsToNote {

	Integer[] a = {3,5,2,8,9};	
	int[] b = {55,33,88,12,99};
	String[] x = {"steve", "bill", "warren", "elon"};
	static Map<String, String> map = new HashMap<String, String>();
	static Map<String, String> LinkedHashMap = new java.util.LinkedHashMap<String, String>();

	void mapSetoperations(){
		map.put("a", "1");
		map.put("b", "3");
		map.put("a", "5");
		map.put("d", "55");

		Set<String> strSet = map.keySet();
		Collection aCol = map.entrySet();
		Collection aCol1 = map.values();
		Iterator it = strSet.iterator();

		map.remove(a);

		while(it.hasNext()){
			System.out.println(it.next());
			/*	String s = (String) it.next();
			if(s.equals("a")){
				it.remove();
			}*/
		}
	}

	void linkedhashmapSetoperations(){
		LinkedHashMap.put("a", "1");
		LinkedHashMap.put("b", "3");
		LinkedHashMap.put("a", "5");
		LinkedHashMap.put("d", "55");		
		Set<String> strSet = LinkedHashMap.keySet();		
		Collection aCol = map.entrySet();
		Collection aCol1 = map.values();
	}

	public static void main(String[] args){
		ThingsToNote t = new ThingsToNote();
		t.mapSetoperations();		
		System.out.println("sqrt::"+(int)Math.sqrt(3));
		System.out.println("pow:::"+(int)Math.pow(3, 2));
		System.out.println("ceil::"+Math.ceil(5.1));
		System.out.println("floor::"+Math.floor(5.1));		
		System.out.println("max::"+Math.max(55, 5));
		System.out.println("min::"+Math.min(55, 5));				
		System.out.println("abs::"+Math.abs(-44));	
		
		
		Random r = new Random();		
		System.out.println(r.nextInt(10));
		r.ints(10).forEach(System.out::println);
		r.ints(10, 1, 10).forEach(System.out::println);		
		int[] yy = r.ints(10).toArray();		
		for(Integer ii: yy){
			System.out.println("arr::"+ii);
		}		
		
		mymehods();
		bitwise();
	}
	
	
	public static void mymehods(){
		int left =3;
		int right = 6;
		int mid = (left + right) >>> 1;
		System.out.println(mid);

		Character s = 'A';
		System.out.println((int) s);
		int i = 102;
		System.out.println((char) i);

		String nn = "10011011";
		int jj = Integer.parseInt(nn,2);
		System.out.println("decemal1::"+jj);

		int n = 10011011;
		int decimal=0,p=0;
		while(n != 0)
		{
			decimal+=((n%10)*Math.pow(2,p));
			n=n/10;
			p++;
		}
		System.out.println("decimal::"+decimal);
		System.out.println("print binary numbers from end:::");		
		int k = 155;
		while(k>0){
			System.out.print(k%2 + " ");
			System.out.println("k::"+k);
			k = k/2;
		}		
		System.out.println();
		System.out.println("binary sring33::"+Integer.toBinaryString(3));
		System.out.println("binary sring::"+Integer.toBinaryString(-1));
		// prints "11111111111111111111111111111111"
		System.out.println(Integer.toBinaryString(-1 >> 16));
		// prints "11111111111111111111111111111111"
		System.out.println(Integer.toBinaryString(-1 >>> 16));
		// prints "1111111111111111"

		System.out.println(Integer.toBinaryString(121));
		// prints "1111001"
		System.out.println(Integer.toBinaryString(121 >> 1));
		// prints "111100"
		System.out.println(Integer.toBinaryString(121 >>> 1));
		// prints "111100"

	}
	
	 public static void bitwise() {
	      int a = 60;	/* 60 = 0011 1100 */
	      int b = 13;	/* 13 = 0000 1101 */
	      int c = 0;

	      
	      c = a & b;        /* 12 = 0000 1100 */
	      System.out.println("a & b = " + c );

	      c = a | b;        /* 61 = 0011 1101 */
	      System.out.println("a | b = " + c );

	      c = a ^ b;        /* 49 = 0011 0001 */
	      System.out.println("a ^ b = " + c );

	      c = ~a;           /*-61 = 1100 0011 */
	      System.out.println("~a = " + c );

	      c = a << 2;       /* 240 = 1111 0000 */
	      System.out.println("a << 2 = " + c );

	      c = a >> 2;       /* 15 = 1111 */
	      System.out.println("a >> 2  = " + c );

	      c = a >>> 2;      /* 15 = 0000 1111 */
	      System.out.println("a >>> 2 = " + c );
	   }


}
