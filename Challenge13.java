import java.util.Random;
import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
    // declare loop variables 
    // and initialise classes 
    int number;
    int answer = 0;
    boolean humans_go = true;

    Scanner reader = new Scanner(System.in); 
    Random rnd = new Random(); 

    // computer chooses random number between 20 and 30 
    number = rnd.nextInt(20, 30); 

    // test loop variables
    //while (number > 0) {
        //answer = 0;
        if (humans_go) {
               // ask user for user input 
                System.out.println(number 
                + " is the starting number, how many do you want to remove? Choose 1,2 or 3");
                while (number > 0) {
                    answer = reader.nextInt(); // player's turn
                    humans_go = false;
                }
        } else if (answer != reader.nextInt()) {
        answer = rnd.nextInt(1, 3); // computer's turn
        humans_go = true; 
        }
        
        number = number - answer;
        System.out.println(number
        + " is the remainder, how many do you want to remove? Choose 1,2 or 3");
        //}
    }
}

    

    // continue to display current number after removing player and computer choice
    // System.out.println(currentNumberTwo);
    // System.out.println(currentNumberThree);

        // if statement to check who loses 
        //if (currentNumberTwo <= 0 ) {
          //  System.out.println("I win");
        //} else if (currentNumberThree <= 0) {
           // System.out.println("You win");
        //}
    //}

