
class A{
    void show() throws ClassNotFoundException{
        Class.forName("Trycatc");
    }
}
public class ThrowsExample {
    static{
        System.out.println("Class A loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
