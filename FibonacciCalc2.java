public class FibonacciCalc2 {
    public static long fibonacci(int i) {
        if (i <= 1)
            return i;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main(String args[]) {
        for (int i = 0; i <= 50; i++) {
            System.out.println(fibonacci(i));

        }
    }
}