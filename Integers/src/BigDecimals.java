import java.math.BigDecimal;

public class BigDecimals {
    public static void main(String[] args) {
        BD();
    }
    static void BD(){
        double a=1.0;
        double b=0.9;
        double sub=a-b;
        System.out.println("Subtraction: " + sub);

        BigDecimal X = BigDecimal.valueOf(b);
        BigDecimal Y = BigDecimal.valueOf(a);
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);
    }
}
