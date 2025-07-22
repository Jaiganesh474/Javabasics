import java.math.BigInteger;

public class FactorialBigInt {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
