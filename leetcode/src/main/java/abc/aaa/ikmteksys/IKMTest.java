package abc.aaa.ikmteksys;

import java.io.File;
import java.util.Calendar;
import java.util.List;

/**
 * Created by yuchen on 2/26/2017.
 */

class Parent{
    protected static int count = 0;
    public Parent() {count++;}
    static int getCount(){return count;}
}

class MathOps{
    static int n2 = getVal();
    static  int n1 = 10;
    static int getVal(){
    	System.out.println("get val called"+n1);
        return n1;
    }
    static int sum(){
    	System.out.println("sum n1::"+n1);
    	System.out.println("sum n2::"+n2);
    	return n1+n2;}
    static int minus(){
    	System.out.println("minus n1::"+n1);
    	System.out.println("minus n2::"+n2);
    	return n1-n2;
    	}

}

public class IKMTest extends Parent{
    public IKMTest(){count++;}
    List<String> s;
    public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println("get count first:"+getCount());
        IKMTest t = new IKMTest();
        System.out.println("get count second:"+getCount());

        int x = 5;
        x = ~x;
        System.out.println("~x::"+x);
        x = x >> 1;

        System.out.println("x val after ~ and >> 1::"+x);

        if(x < 0);
        else System.out.println("x val less than 0 condition::"+x);


        //System.out.println(t.s.size());

        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.AUGUST, 30);
        cal.roll(Calendar.MONTH, 7);
        System.out.println("" + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.MONTH) + "-" +cal.get(Calendar.YEAR));
        cal.add(Calendar.MONTH, 11);
        System.out.println("" + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.MONTH) + "-" +cal.get(Calendar.YEAR));

        int a =9, b=2;
        float f = a/ b;
        System.out.println("a/b::"+f);
        f = f / 2;
        System.out.println("f/2::"+f);
        f = a+b/f;
        System.out.println("a+b/f::"+f);

        System.out.println("Math.nextAfter::"+Math.nextAfter(10.22, 0.01));
        System.out.println("Math.nextUp::"+Math.nextUp(10.22));
        System.out.println("Math.round(::"+Math.round(10.55));

        Boolean bb = new Boolean("false");
        Float ff = new Float(23.43);
        Double dd = new Double("17.46d");
        //Character cc = new Character("C");

        System.out.println("MathOps.sum()::"+MathOps.sum());
        System.out.println("MathOps.miuns()::"+MathOps.minus());

        File file = new File("test.txt");
        File backup = new File("test.txt.bak");
        backup.delete();
        file.renameTo(backup);

    }
}
