package aaalme;

import java.util.stream.IntStream;

public class StringBuilderExample {
	
    public static void main(String[] args) {
        CustomStringBuilder sb = new CustomStringBuilder();

        // Append different types
        sb.append("Hello");
        sb.append(' ');
        sb.append(123);
        sb.append(true);
        System.out.println("Append: " + sb.toString());

        // Append code point
        sb.appendCodePoint(0x1F600); // Appends 😀
        System.out.println("Append CodePoint: " + sb.toString());

        // Capacity
        System.out.println("Capacity: " + sb.capacity());

        // charAt
        System.out.println("CharAt(6): " + sb.charAt(6));

        // chars
        IntStream charStream = sb.chars();
        System.out.print("Chars: ");
        charStream.forEach(ch -> System.out.print((char) ch + " "));
        System.out.println();

        // codePointAt
        System.out.println("CodePointAt(10): " + sb.codePointAt(10));

        // codePointBefore
        System.out.println("CodePointBefore(11): " + sb.codePointBefore(11));

        // codePointCount
        System.out.println("CodePointCount(0, 12): " + sb.codePointCount(0, 12));

        // codePoints
        IntStream codePointStream = sb.codePoints();
        System.out.print("CodePoints: ");
        codePointStream.forEach(cp -> System.out.print(cp + " "));
        System.out.println();

        // delete
        sb.delete(5, 9);
        System.out.println("Delete(5, 9): " + sb.toString());

        // deleteCharAt
        sb.deleteCharAt(5);
        System.out.println("DeleteCharAt(5): " + sb.toString());

        // ensureCapacity
        sb.ensureCapacity(100);
        System.out.println("EnsureCapacity(100), Capacity: " + sb.capacity());

        // getChars
        char[] dst = new char[5];
        sb.getChars(0, 5, dst, 0);
        System.out.print("GetChars(0, 5): ");
        System.out.println(dst);

        // indexOf
        System.out.println("IndexOf('true'): " + sb.indexOf("true"));

        // insert boolean
        sb.insert(5, false);
        System.out.println("Insert(5, false): " + sb.toString());

        // insert char
        sb.insert(5, 'X');
        System.out.println("Insert(5, 'X'): " + sb.toString());

        // insert object
        sb.insert(5, 3.14);
        System.out.println("Insert(5, 3.14): " + sb.toString());

        // lastIndexOf
        System.out.println("LastIndexOf('123'): " + sb.lastIndexOf("123"));

        // length
        System.out.println("Length: " + sb.length());

        // offsetByCodePoints        
        System.out.println("OffsetByCodePoints(0, 6): " + sb.offsetByCodePoints(0, 6));

        // replace
        System.out.println(sb.toString());
        System.out.println(sb.substring(5,10));
        sb.replace(5, 10, "WORLD");
        System.out.println("Replace(5, 10, 'WORLD'): " + sb.toString());

        // reverse
        sb.reverse();
        System.out.println("Reverse: " + sb.toString());

        // setCharAt
        sb.setCharAt(0, 'H');
        System.out.println("SetCharAt(0, 'H'): " + sb.toString());

        // setLength
        sb.setLength(10);
        System.out.println("SetLength(10): " + sb.toString());

        // subSequence
        CharSequence subSeq = sb.subSequence(0, 5);
        System.out.println("SubSequence(0, 5): " + subSeq);

        // substring
        System.out.println("Substring(0, 5): " + sb.substring(0, 5));

        // toString
        System.out.println("ToString(): " + sb.toString());

        // trimToSize
        sb.trimToSize();
        System.out.println("TrimToSize(), Capacity: " + sb.capacity());
    }

}
