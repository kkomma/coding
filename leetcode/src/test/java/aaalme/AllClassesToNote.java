//package aaalme;
//


////Defining first thread with task
////The task of this thread is to print the numbers from 0 to 1000 times
//class Thread1 extends Thread
//{
//@Override
//public void run()
//{
//    for(int i = 0; i <= 1000; i++)
//    {
//        System.out.println(i);
//    }
//}
//}
//
////Defining second thread with task
////The task of this thread is to print the numbers from 1001 to 2000
//class Thread2 extends Thread
//{
//@Override
//public void run()
//{
//    for(int i = 1001; i<= 2000; i++)
//    {
//        System.out.println(i);
//    }
//}
//}
//
//public class ThreadsInJava
//{
////Main Thread
//public static void main(String[] args)
//{
//    //Creating first thread
//    Thread1 t1 = new Thread1();
//    t1.start();
//
//    //Creating second thread
//    Thread2 t2 = new Thread2();
//    t2.start();
//    
//}
//}
//
//
//package abc.aaa.threads;
//
//import abc.aaa.threads.Thread3;
//import abc.aaa.threads.Thread4;
//
////Defining first thread with task
////The task of this thread is to print the numbers from 0 to 1000 times
//class Thread3 implements Runnable
//{
//@Override
//public void run()
//{
//    for(int i = 0; i <= 1000; i++)
//    {
//        System.out.println(i);
//    }
//}
//}
//
////Defining second thread with task
////The task of this thread is to print the numbers from 1001 to 2000
//class Thread4 implements Runnable
//{
//@Override
//public void run()
//{
//    for(int i = 1001; i<= 2000; i++)
//    {
//        System.out.println(i);
//    }
//}
//}
//
//public class ThreadsRunnable
//{
////Main Thread
//public static void main(String[] args)
//{
//    //Creating first thread
//    Thread3 t1 = new Thread3();
//    Thread thread1 = new Thread(t1);
//    thread1.start();
//    
//    //Creating second thread
//    Thread4 t2 = new Thread4();
//    Thread thread2 = new Thread(t2);
//    thread2.start();
//}
//}




//import java.util.Arrays;
//import static java.util.Arrays.asList;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Random;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.PriorityQueue;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Deque;
//import java.util.ArrayDeque;
////54_Spiral_Matrix.java
//
//public class Spiral_Matrix {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        if (matrix == null || matrix.length == 0) {
//            return Collections.emptyList();
//        }
//
//        List<Integer> result = new ArrayList<>();
//
//        int left = 0;
//        int right = matrix[0].length - 1;
//        int up = 0;
//        int down = matrix.length - 1;
//
//        int totalElements = matrix.length * matrix[0].length;
//
//        while (result.size() < totalElements) {
//            for (int j = left; j <= right && result.size() < totalElements; j++) {
//                result.add(matrix[up][j]);
//            }
//
//            for (int i = up + 1; i <= down - 1 && result.size() < totalElements; i++) {
//                result.add(matrix[i][right]);
//            }
//
//            for (int j = right; j >= left && result.size() < totalElements; j--) {
//                result.add(matrix[down][j]);
//            }
//
//            for (int i = down - 1; i >= up + 1 && result.size() < totalElements; i--) {
//                result.add(matrix[i][left]);
//            }
//
//            ++left;
//            --right;
//            ++up;
//            --down;
//        }
//
//        return result;
//    }
//
//        public static void main(String[] args) {
//            Spiral_Matrix spiralMatrix = new Spiral_Matrix();
//        
//            // Test case 1: Empty matrix
//            int[][] matrix1 = {};
//            List<Integer> result1 = spiralMatrix.spiralOrder(matrix1);
//            System.out.println("Test case 1: " + result1); // Expected output: []
//        
//            // Test case 2: 1x1 matrix
//            int[][] matrix2 = {{1}};
//            List<Integer> result2 = spiralMatrix.spiralOrder(matrix2);
//            System.out.println("Test case 2: " + result2); // Expected output: [1]
//        
//            // Test case 3: 3x3 matrix
//            int[][] matrix3 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//            };
//            List<Integer> result3 = spiralMatrix.spiralOrder(matrix3);
//            System.out.println("Test case 3: " + result3); // Expected output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
//        
//            // Test case 4: 4x5 matrix
//            int[][] matrix4 = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20}
//            };
//            List<Integer> result4 = spiralMatrix.spiralOrder(matrix4);
//            System.out.println("Test case 4: " + result4); // Expected output: [1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
//        
//            // Add more test cases as needed...
//        }
//
//
//}
//
//
//
//package abc.aaa.samsung;
//
//import java.util.Arrays;
//
//public class ReverseByGroup {
//
//	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5,6,7};
//		reverseByGroup(a,a.length,3);
//		System.out.println(Arrays.toString(a));
//	}
//
//	private static void reverseByGroup(int[] a, int n, int k) {
//		
//		for(int i=0;i<n;i=i+k) {
//			int left = i;
//			int right = Math.min(i+k-1, n-1);
//			
//			int temp;
//			while(left<right) {
//				temp = a[left];
//				a[left] = a[right];
//				a[right] = temp;
//				left++;
//				right--;
//			}
//		}
//		
//	}
//
//}
//
//
//
//
//package abc.aaa.samsung;
//
//public class RotateString {
//
//	private static void leftRotate(String str, int offset) {
//		 char[] A = str.toCharArray();
//	     int len = A.length;
//	     if(len>0) {
//	    	 offset = offset % len;	 
//	     }
//	     
//	     reverse(A, 0, len - offset - 1);
//	     reverse(A, len - offset, len - 1);
//	     reverse(A, 0, len - 1);
//	     StringBuilder sb = new StringBuilder();
//	     for(int i=0;i<A.length;i++) {
//	    	 sb.append(A[i]);
//	     }
//	     System.out.println("rotated string:"+sb.toString());
//	}
//	
//	private static void rightRotate(String str, int offset) {
//		leftRotate(str, str.length() - offset);
//	}
//
//		
//	public static void main(String[] args) {
//		//String str = "abcdef"; 
//		String str = "this is the test class";
//		leftRotate(str, 2);
//		str = "this is the test class";
//		rightRotate(str, 4);
//	     
//	}
//
//	private static void reverse(char[] str, int start, int end) {
//        while (start < end) {
//            char temp = str[start];
//            str[start] = str[end];
//            str[end] = temp;
//            start++;
//            end--;
//        }
//    }
//}
//
//
//
//
//package aaaaa.lc.TopKElements;
//
//import java.util.Arrays;
//import static java.util.Arrays.asList;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Random;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.PriorityQueue;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Deque;
//import java.util.ArrayDeque;
////347_Top_K_Frequent_Elements.java
//
//public class Top_K_Frequent_Elements {
//    public List<Integer> topKFrequent(int[] nums, int k) {
//        List<Integer> result = new ArrayList<>();
//        if (nums == null || nums.length == 0) {
//            return result;
//        }
//
//        Map<Integer, Integer> hm = new HashMap<>();
//
//        for (int num : nums) {
//            hm.put(num, hm.getOrDefault(num, 0) + 1);
//        }
//
//        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
//
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            pq.add(entry);
//        }
//
//        while (k > 0) {
//            result.add(pq.poll().getKey());
//            k--;
//        }
//
//        return result;
//    }
//    public static void main(String[] args) {
//        Top_K_Frequent_Elements solution = new Top_K_Frequent_Elements();
//    
//        // Test case 1: Basic input
//        int[] nums1 = {1, 1, 1, 2, 2, 3};
//        int k1 = 2;
//        List<Integer> result1 = solution.topKFrequent(nums1, k1);
//        System.out.println("Test case 1: " + result1); // Expected output: [1, 2]
//    
//        // Test case 2: Empty input
//        int[] nums2 = {};
//        int k2 = 3;
//        List<Integer> result2 = solution.topKFrequent(nums2, k2);
//        System.out.println("Test case 2: " + result2); // Expected output: []
//    
//        // Test case 3: Input with negative numbers
//        int[] nums3 = {-1, -1, 0, 1, 1, 2};
//        int k3 = 2;
//        List<Integer> result3 = solution.topKFrequent(nums3, k3);
//        System.out.println("Test case 3: " + result3); // Expected output: [-1, 1]
//    
//        // Test case 4: Input with duplicate numbers
//        int[] nums4 = {3, 1, 1, 2, 2, 2, 3, 3, 3};
//        int k4 = 3;
//        List<Integer> result4 = solution.topKFrequent(nums4, k4);
//        System.out.println("Test case 4: " + result4); // Expected output: [3, 2, 1]
//    }
//    
//}
//
//
//package aaaaa.lc.TopKElements;
//
//import java.util.Arrays;
//import static java.util.Arrays.asList;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Random;
//import java.util.Queue;
//import java.util.Stack;
//import java.util.PriorityQueue;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Deque;
//import java.util.ArrayDeque;
////451_Sort_Characters_By_Frequency.java
//
//public class Sort_Characters_By_Frequency {
//    public String frequencySort(String s) {
//        if (s == null || s.length() == 0) {
//            return s;
//        }
//
//        HashMap<Character, Integer> hm = new HashMap<>();
//        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : s.toCharArray()) {
//            hm.put(c, hm.getOrDefault(c, 0) + 1);
//        }
//
//        pq.addAll(hm.entrySet());
//
//        while (!pq.isEmpty()) {
//            Map.Entry<Character, Integer> entry = pq.poll();
//
//            for (int i = 0; i < entry.getValue(); i++) {
//                sb.append(entry.getKey());
//            }
//        }
//
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//        Sort_Characters_By_Frequency obj = new Sort_Characters_By_Frequency();
//    
//        // Test Case 1: Empty string
//        String s1 = "";
//        String expected1 = "";
//        String result1 = obj.frequencySort(s1);
//        System.out.println(result1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");
//    
//        // Test Case 2: String with single character
//        String s2 = "a";
//        String expected2 = "a";
//        String result2 = obj.frequencySort(s2);
//        System.out.println(result2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");
//    
//        // Test Case 3: String with multiple characters, no repeated characters
//        String s3 = "abcde";
//        String expected3 = "abcde";
//        String result3 = obj.frequencySort(s3);
//        System.out.println(result3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");
//    
//        // Test Case 4: String with multiple characters, some repeated characters
//        String s4 = "abccba";
//        String expected4 = "ccbbaa";
//        String result4 = obj.frequencySort(s4);
//        System.out.println(result4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");
//    }
//}
//
//
//package abc.aaa.samsung;
//
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
//import java.util.Map.Entry;
//
//public class GglCache {
//
//	static LinkedHashMap<Integer,Integer> l = new LinkedHashMap<>();
//	static LinkedHashSet<Integer> jjj = new LinkedHashSet<>(); 
//	
//	int n;
//	GglCache(int n){
//		this.n = n;
//	}
//	
//	public synchronized void put(Integer k,Integer v) {
//		l.put(k,v);
//		if(l.keySet().size()>n) {
//			removeLast();
//		}
//	}
//	
//	private  void removeLast() {
//		l.remove(l.keySet().iterator().next());		
//	}
//
//
//	public static void main(String[] args) {
//
//		GglCache g = new GglCache(2);
//		g.put(1, 2);
//		g.put(2, 3);
//		g.put(4, 5);
//		g.put(6, 7);
//		
//		System.out.println("print map values");
//		for(Entry<Integer, Integer> mapp: l.entrySet()){
//		System.out.println(mapp.getKey()+"::::"+mapp.getValue());
//		}
//		
//	}
//
//}
//
//
//
//
//package abc.aaa.samsung;
//
//import java.util.LinkedHashSet;
//
//public class GglCacheHashSetMe {
//
//	static LinkedHashSet<Character> l = new LinkedHashSet<>();	
//	int cacheSize;
//
//	GglCacheHashSetMe(int cacheSize){
//		this.cacheSize = cacheSize;
//	}
//
//	public synchronized void add(Character c) {		
//		l.add(c);
//		if(l.size() > 2) {
//			removeLast();
//		}
//	}
//
//	private  void removeLast() {
//		l.remove(l.iterator().next());		
//	}
//
//
//	public static void main(String[] args) {		
//		GglCacheHashSetMe obj = new GglCacheHashSetMe(2);
//		obj.add('a');
//		obj.add('b');
//		obj.add('c');
//		obj.add('d');
//		
//		System.out.println("print set values");
//		for(Character c : l) {
//			System.out.println(c);
//		}
//	}
//
//}
//
//
//package abc.aa.amzn;
//
//public class IpAddressValidation{
//
//	private static boolean isValidNumber(String ipNumber){
//		System.out.println("called isValidNumber");
//		char[] c = ipNumber.toCharArray();
//		for(int i=0; i< c.length;i++){
//			if(!Character.isDigit(c[i])){
//				System.out.println("retunr3");
//				return false;
//			}
//		}
//		int value = Integer.parseInt(ipNumber);
//		if(value < 0 || value > 255){
//			System.out.println("retunr4");
//			return false;
//		}
//		return true;
//	}
//
//
//	private static boolean isValidIp(String ip){
//		String[] ipParts = ip.split("\\.");		
//		System.out.println(ipParts.length);		
//		if(ip.equals("0.0.0.0") || ip.equals("255.255.255.255") || ipParts.length != 4){
//			System.out.println("retunr1");
//			return false;
//		}		
//		for(int i=0 ; i < ipParts.length;i++){
//			System.out.println("part::"+ipParts[i]);
//			if(ipParts[i].length() > 0 && ipParts[i] != null) {
//				boolean isVal = isValidNumber(ipParts[i]);
//			    System.out.println("isVal:"+isVal);
//				if(!isVal){
//					System.out.println("retunr2");
//					return false;
//				}	
//			}else {
//				return false;
//			}
//			
//		}
//		return true;
//	}
//
//	private static boolean isValidIPv6(String ip) {
//		String[] ipParts = ip.split(":");
//		if (ipParts.length != 8) {
//			return false;
//		}
//		for (String part : ipParts) {
//			if (part.length() == 0 || part.length() > 4) {
//				return false;
//			}
//			for (int i = 0; i < part.length(); i++) {
//				char c = part.charAt(i);
//				if (!Character.isDigit(c) && !isHexCharacter(c)) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//	private static boolean isHexCharacter(char c) {
//		return (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
//	}
//
//	public static void main(String[] args){
//		//String ip = "255.3.2.1";
//		String ip = "255.255..255";
//		System.out.println(isValidIp(ip));
//
//		String ipv4 = "255.3.2.1";
//		String ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
//		System.out.println(isValidIp(ipv4)); // Output: true
//		System.out.println(isValidIPv6(ipv6)); // Output: true
//
//	}
//
//}
//
//



//package aaalme;
//
//import static org.hamcrest.CoreMatchers.containsString;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//
//
//public class WorkWithFiles {
//
//
//	private String readFromInputStream(InputStream inputStream)
//			throws IOException {
//		StringBuilder resultStringBuilder = new StringBuilder();
//		try (BufferedReader br= new BufferedReader(new InputStreamReader(inputStream))) {			      
//			String line;
//			while ((line = br.readLine()) != null) {
//				resultStringBuilder.append(line).append("\n");
//			}
//		}
//		return resultStringBuilder.toString();
//	}
//
//
//	public void givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData() {
//		String expectedData = "Hello, world!";
//
//		Class<WorkWithFiles> clazz = WorkWithFiles.class;
//		InputStream inputStream = clazz.getResourceAsStream("/fileTest.txt");
//		try {
//			String data = readFromInputStream(inputStream);
//			System.out.println(data);
//			containsString(expectedData);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}	
//
//
//	public static void main(String[] args) {
//		WorkWithFiles workWithFiles = new WorkWithFiles();
//		workWithFiles.givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData();
//
//		Class<WorkWithFiles> clazz = WorkWithFiles.class;
//		InputStream inputStream = clazz.getResourceAsStream("/fileTest.txt");		
//		try {
//			String fileData = workWithFiles.readFromInputStream(inputStream);
//			System.out.println("called readFromInputStream");
//			System.out.println(fileData);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
//
//
