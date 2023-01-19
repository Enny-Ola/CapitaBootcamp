import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {

    try (// initialise scanner class
    Scanner reader = new Scanner (System.in)) {
        // ask for user input
        System.out.println("Enter a random number greater than 1 and I'll show you its factors");
        int number = reader.nextInt();

        // begin display statement
        boolean flag = false;

        for (int i = 2; i <= number / 2; ++i) {
            
            if (number % i == 0) {
                flag = true;
                break;
                } 
            }
                if (!flag) {
                    System.out.println(number + " is a prime number");
                } else {
                    System.out.println(number + " is not a prime number");
                }
    }
        }
    }
