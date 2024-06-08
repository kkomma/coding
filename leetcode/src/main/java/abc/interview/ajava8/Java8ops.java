package abc.interview.ajava8;

import java.util.*;

class Java8ops {
  public static void main(String[] args) {
   
    List<Integer> a = new ArrayList<Integer>();
    a.add(1);
    a.add(1);
    a.add(3);        
    a.stream().distinct().forEach(System.out::println);
    Integer[] aa = {1,1,2,3,4,3};
    List<Integer> ii = Arrays.asList(aa);

    Set<Integer> s = new HashSet<Integer>(ii);
    System.out.println("set values:"+s.toString());
    
    
    System.out.println("sum::"+ii.stream().mapToInt(i -> i.intValue()).sum());
    System.out.println("max::"+ii.stream().mapToInt(i -> i.intValue()).max().orElse(0));
    System.out.println("min::"+ii.stream().mapToInt(i -> i.intValue()).min().orElse(0));
    System.out.println("count::"+ii.stream().mapToInt(i -> i.intValue()).count());
    System.out.println("avg::"+ii.stream().mapToInt(i -> i.intValue()).average().orElse(0.0));

    ii.stream().sorted().forEach(r->System.out.println("sorted::"+r));
    ii.stream().distinct().forEach(r->System.out.println("distinct::"+r));
    ii.stream().filter(r-> r!=2).forEach(r->System.out.println("filtered::"+r)); 
    
    System.out.println(ii.stream().filter(r->{    
      if(r==11){
      return true;
      }else{
      return false;
      }      
    }).findAny().isPresent());
    
  }
}

