//StringBuffer is a mutable sequence of characters.
// It is used to create objects that can be modified after they are created.
// StringBuffer is synchronized, which means it is thread-safe.
// It is used in scenarios where a lot of modifications are required on a string.
// It is more efficient than String when it comes to concatenation and modification of strings.
//Stringbuffer example

class A {
    StringBuffer sb = new StringBuffer("Hello");

    public void append(String str) {
        sb.append(str);
    }

    public void insert(int index, String str) {
        sb.insert(index, str);
    }

    public void delete(int start, int end) {
        sb.delete(start, end);
    }

    public void reverse() {
        sb.reverse();
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

public class Stringbuffer {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Original String: " + a);

        a.append(" World");
        System.out.println("After append: " + a);

        a.insert(5, ",");
        System.out.println("After insert: " + a);

        a.delete(5, 6);
        System.out.println("After delete: " + a);

        a.reverse();
        System.out.println("After reverse: " + a);
    }
}
