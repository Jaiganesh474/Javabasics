
//Encapsulation - hiding the details like using access modifiers - public, private, protected
public class Encapsulation {

    private int age;
    private String name;

    public int getAge() {

        return age;
    }
    public void setAge(int age) {

        this.age=age;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Encapsulation obj=new Encapsulation();
        obj.setAge(1);
        obj.setName("Leo");

        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}