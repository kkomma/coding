package aaalme;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomStringBuilder {
    private char[] value;
    private int count;

    public CustomStringBuilder() {
        this.value = new char[16];
        this.count = 0;
    }

    public CustomStringBuilder append(Object obj) {
        String str = String.valueOf(obj);
        int len = str.length();
        ensureCapacityInternal(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    public CustomStringBuilder appendCodePoint(int codePoint) {
        int len = Character.charCount(codePoint);
        ensureCapacityInternal(count + len);
        Character.toChars(codePoint, value, count);
        count += len;
        return this;
    }

    public int capacity() {
        return value.length;
    }

    public char charAt(int index) {
        if ((index < 0) || (index >= count)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }

    public IntStream chars() {
        return IntStream.range(0, count).map(i -> value[i]);
    }

    public int codePointAt(int index) {
        return Character.codePointAt(value, index);
    }

    public int codePointBefore(int index) {
        return Character.codePointBefore(value, index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return Character.codePointCount(value, beginIndex, endIndex - beginIndex);
    }

    public IntStream codePoints() {
        return IntStream.range(0, count).map(i -> codePointAt(i));
    }

    public CustomStringBuilder delete(int start, int end) {
        if (start < 0) throw new StringIndexOutOfBoundsException(start);
        if (end > count) throw new StringIndexOutOfBoundsException(end);
        if (start > end) throw new StringIndexOutOfBoundsException();
        int len = end - start;
        System.arraycopy(value, start + len, value, start, count - end);
        count -= len;
        return this;
    }

    public CustomStringBuilder deleteCharAt(int index) {
        if ((index < 0) || (index >= count)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        System.arraycopy(value, index + 1, value, index, count - index - 1);
        count--;
        return this;
    }

    public void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > value.length) {
            value = Arrays.copyOf(value, minimumCapacity);
        }
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        if (srcBegin < 0 || srcEnd > count || srcBegin > srcEnd) {
            throw new StringIndexOutOfBoundsException();
        }
        System.arraycopy(value, srcBegin, dst, dstBegin, srcEnd - srcBegin);
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int indexOf(String str, int fromIndex) {
        return new String(value, 0, count).indexOf(str, fromIndex);
    }

    public CustomStringBuilder insert(int offset, boolean b) {
        return insert(offset, String.valueOf(b));
    }

    public CustomStringBuilder insert(int offset, char c) {
        ensureCapacityInternal(count + 1);
        System.arraycopy(value, offset, value, offset + 1, count - offset);
        value[offset] = c;
        count++;
        return this;
    }

    public CustomStringBuilder insert(int offset, Object obj) {
        String str = String.valueOf(obj);
        int len = str.length();
        ensureCapacityInternal(count + len);
        System.arraycopy(value, offset, value, offset + len, count - offset);
        str.getChars(0, len, value, offset);
        count += len;
        return this;
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, count);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return new String(value, 0, count).lastIndexOf(str, fromIndex);
    }

    public int length() {
        return count;
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return Character.offsetByCodePoints(value, 0, count, index, codePointOffset);
    }

    public CustomStringBuilder replace(int start, int end, String str) {
        if (start < 0 || start > count || start > end) {
            throw new StringIndexOutOfBoundsException();
        }
        int len = str.length();
        ensureCapacityInternal(count + len - (end - start));
        System.arraycopy(value, end, value, start + len, count - end);
        str.getChars(0, len, value, start);
        count += len - (end - start);
        return this;
    }

    public CustomStringBuilder reverse() {
        for (int i = 0; i < count / 2; i++) {
            char tmp = value[i];
            value[i] = value[count - i - 1];
            value[count - i - 1] = tmp;
        }
        return this;
    }

    public void setCharAt(int index, char ch) {
        if ((index < 0) || (index >= count)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        value[index] = ch;
    }

    public void setLength(int newLength) {
        if (newLength < 0) throw new StringIndexOutOfBoundsException(newLength);
        ensureCapacityInternal(newLength);
        if (count < newLength) {
            Arrays.fill(value, count, newLength, '\0');
        }
        count = newLength;
    }

    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > count || start > end) {
            throw new StringIndexOutOfBoundsException();
        }
        return new String(value, start, end - start);
    }

    public String substring(int start, int end) {
        if (start < 0 || end > count || start > end) {
            throw new StringIndexOutOfBoundsException();
        }
        return new String(value, start, end - start);
    }

    public String substring(int start) {
        return substring(start, count);
    }

    public String toString() {
        return new String(value, 0, count);
    }

    public void trimToSize() {
        if (count < value.length) {
            value = Arrays.copyOf(value, count);
        }
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        if (minimumCapacity - value.length > 0) {
            value = Arrays.copyOf(value, newCapacity(minimumCapacity));
        }
    }

    private int newCapacity(int minCapacity) {
        int newCapacity = (value.length << 1) + 2;
        return (newCapacity - minCapacity < 0) ? minCapacity : newCapacity;
    }
}

