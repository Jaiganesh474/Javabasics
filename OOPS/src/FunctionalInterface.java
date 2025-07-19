
@java.lang.FunctionalInterface
interface ANew{
    void show();
}

class BNew implements ANew{
    public void show() {
        System.out.println("Hello  from B");
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        ANew obj= new BNew();
        obj.show();
    }
}
