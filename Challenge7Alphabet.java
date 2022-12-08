import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Challenge7Alphabet {
    public static void main(String[] args) {

        // initialise Scanner class, first parsing method and declare user 1st input
        Scanner reader = new Scanner(System.in);

        // initialise Scanner class, second parsing method and declare user 2nd input
        Scanner reader2 = new Scanner(System.in);

        // initialise array list
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (true) {
            // ask for user input
            System.out.print("\n How fast can you type the alphabet?" +
                    "\n When ready, click enter to start typing," +
                    "\n or n and enter to quit: ");
            String firstResponse = reader.nextLine(); 
            
            // check if user input is in alphabetical order
            if (firstResponse.equals("n")) 
            {
                System.out.println("Thank you, bye!");
                break;
            }
            else 
            {
            // get user start time and finish time
            Instant startTime = Instant.now();
            
            // ask user to start typing and get their start time
            System.out.println("\n Make sure you type in small letters & click enter when you finish. Good luck :): ");
            String secondResponse = reader2.nextLine();
            Instant finishTime = Instant.now();

            // subtract 1st time from 2nd time and use this to tell user how long they took
            // also convert user response to uppercase 
            long totalTime = ChronoUnit.SECONDS.between(startTime, finishTime);
            System.out.println("\n You've just typed: " + secondResponse.toUpperCase() + " in " + totalTime + " seconds");

            // add seconds to array list
            list.add((int)totalTime);

            // check if user input is in alphabetical order
            char[] alphabetOrder = secondResponse.toCharArray();
            Arrays.sort(alphabetOrder);
            String str1 = "";

                 // now check each array index matches the sorted order
                for(int i = 0; i < alphabetOrder.length; i++)
                {
                    str1 += alphabetOrder[i] + "";
                }
                if(str1.equals(secondResponse)) {
                    // tell user they typed correctly
                    System.out.println(" and you typed in the correct order, nice work!");
                
                    //list.forEach(item -> System.out.println(item));
                    // tell user best record time
                    Collections.sort(list);
                    System.out.println(" Your fastest time so far is " + list.get(0) + " seconds");
                } else {
                    // tell user their order was incorrect
                    System.out.println(" but oops your alphabets are in the wrong order, try again!");
                }
            }
        }
        reader.close();
        reader2.close();
    }

}
