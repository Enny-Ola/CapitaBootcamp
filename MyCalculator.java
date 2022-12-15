import java.util.Scanner;
public class MyCalculator {
    public static void main(String[] args) {
        // read in two numbers from the user 
        Scanner reader1 = new Scanner(System.in);
        System.out.println("enter a number and press enter");
        int num1 = reader1.nextInt();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("enter a second number and press enter");
        int num2 = reader2.nextInt();

        System.out.println("The total of both numbers is: " + myMethod(num1, num2));

        reader1.close();
        reader2.close();
    }

        // method to add the 2 numbers 
        static int myMethod(int num1, int num2) {
            return num1 + num2;
        }
      } 