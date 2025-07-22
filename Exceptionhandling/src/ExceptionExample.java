import java.util.Scanner;

//Exception handling in Java
public class ExceptionExample {
    public static void main(String[] args) {
        int i = 0;
        int j;

        try {
            j = 18 / i;

            if (j==0) throw new MyException("Oops..!! Can't divide by zero");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("C");
        }
    }
}
