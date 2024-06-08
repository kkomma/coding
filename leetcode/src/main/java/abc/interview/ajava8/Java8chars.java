package abc.interview.ajava8;

import java.util.*;


class Java8chars {
  
  static void nthmax(){
  
    //Integer[] a = {4,3,27,6,8,33,43,54};
	Integer[] a = {1,2,3,4,5,6,7,8};
    List<Integer> b = Arrays.asList(a);
    
    b.stream().sorted().forEach(r->{
       if(b.indexOf(r)== b.size() - 3){
       System.out.println(r);
       }      
    });    
  }
  
  static void removechar(String str, char c){    
    StringBuilder s = new StringBuilder();    
    char[] a = str.toCharArray();    
    
    for(int i=0;i<a.length;i++){    
      if(a[i]!=c){
        s.append(a[i]);
      }
    }
    System.out.println("removed string::"+s.toString());  
  }
  static void vowels(String str){  
    int count =0;
    char[] a = str.toCharArray();    
    for(int i=0;i<a.length;i++){    
      switch(a[i]){      
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
          count++;
          break;
        default:
      }
    }    
    System.out.println("count::"+count);  
  }
  
  public static void main(String[] args) {   
    vowels("aeroplane union");
    removechar("codec letter", 'e');
    nthmax();
  }
}