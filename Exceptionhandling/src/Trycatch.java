class MyException extends Exception{
    public MyException(String string){
        super(string);
    }
}

public class Trycatch {
    public static void main(String a[]) {
        int i=20;
        int j;

        try{
            j=18/i;

            if(j==0) throw new MyException("Oops..!! it's error so i dont want to print error");
        }

        catch (MyException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("C");
        }

    }
}
