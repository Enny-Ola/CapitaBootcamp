import java.util.Scanner;
public class MinMaxMethods1 {   
    public static void main(String[] args) {
        // ask for user input
        Scanner reader1 = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = reader1.nextInt();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("enter a second number");
        int number2 = reader2.nextInt();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("enter a third number");
        int number3 = reader3.nextInt();

        System.out.println("The minimum number is: " + MinMethod(number1, number2, number3));
        System.out.println("The maximum number is: " + MaxMethod(number1, number2, number3));

        reader1.close();
        reader2.close();
        reader3.close();
    }
    
    static int MinMethod(int number1, int number2, int number3) {
        return Math.min(number1, Math.min(number2, number3));
    }
    static int MaxMethod(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }
}
