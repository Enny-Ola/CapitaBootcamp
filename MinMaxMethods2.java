import java.util.Scanner;
public class MinMaxMethods2 {   
    public static void main(String[] args) {
        
        // ask for user input in double format
        Scanner reader1 = new Scanner(System.in);
        System.out.println("enter a decimal number");
        double number1 = reader1.nextDouble();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("enter a second decimal number");
        double number2 = reader2.nextDouble();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("enter a third decimal number");
        double number3 = reader3.nextDouble();

        // test if user inputted integers or doubles 
        if ((number1 % 1) == 0 && (number2 % 1) == 0 && (number3 % 1) == 0) {
            System.out.println("Sorry wrong format!, try again");
        }
        else {
            System.out.println("The minimum number is: " + MinMethod(number1, number2, number3));
            System.out.println("The maximum number is: " + MaxMethod(number1, number2, number3));
        }
        reader1.close();
        reader2.close();
        reader3.close();
    }
    // method to return minimum of int numbers
    static int MinMethod(int number1, int number2, int number3) {
        return Math.min(number1, Math.min(number2, number3));
    }
    // method to return minimum of double numbers (by overloading MinMethod)
    static double MinMethod(double number1, double number2, double number3) {
        return Math.min(number1, Math.min(number2, number3));
    }
    // method to return maximum of int numbers
    static int MaxMethod(int number1, int number2, int number3) {
        return Math.max(number1, Math.max(number2, number3));
    }
    // method to return maximum of double numbers (by overloading MaxMethod)
    static double MaxMethod(double number1, double number2, double number3) {
        return Math.max(number1, Math.max(number2, number3));
    }
}