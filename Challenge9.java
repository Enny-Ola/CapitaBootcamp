import java.util.Scanner; // import scanner class
import java.util.Random; // import random class
public class Challenge9 {
    public static void main(String[] args) {

    Scanner reader = new Scanner(System.in); // initiaise Scanner class

    // while loop to continue generating playing cards
    while (true) {
        System.out.println("press the enter key to generate a random playing card or press 'n' and enter to quit"); // ask for user input
        String userInput = reader.nextLine();
        if (userInput.equals("n")) {
            System.out.println("Thank you, bye!");
            break;
        } else {
        String suits[] = {"Hearts", "Spades", "Diamonds", "Clubs"}; // generate suits array
        String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen of", "King of", "Ace of"}; // generate cards array
        Random random = new Random(); // initialise random method
        System.out.println(cards[random.nextInt(cards.length)] + " " + suits[random.nextInt(suits.length)]); // generate a random card and suit combination
    }
   }
  }
 }
