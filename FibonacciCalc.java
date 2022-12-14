import java.math.BigInteger;
public class FibonacciCalc {
    public static BigInteger fibonacci(int n) {

        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        return fibonacci(n - 2).add(fibonacci(n - 1));
    }

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println(fibonacci(i));

        }
    }
}
