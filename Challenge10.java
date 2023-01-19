import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Challenge10 {
    public static void main(String[] args) {
        
        //Declare variables of type integer 
        int userChoice, computerChoice, rock, paper, scissors, userScore, computerScore;
        userScore = 0;
        computerScore = 0;

        // initialise array lists to store choices
        ArrayList<Integer> userChoices = new ArrayList<Integer>();
        ArrayList<Integer> computerChoices = new ArrayList<Integer>();
        
        try (//create input object so as to use it's methods for geting use input
        Scanner input = new Scanner (System.in)) {
            //Assigning values to the following variables:
            rock = 0;
            paper = 1;
            scissors = 2;

            //create random input for the computer
            Random rnd = new Random(); 

            while (true) {
            // computer chooses random number between 0 and 2     
            computerChoice = rnd.nextInt(3);

            //ask for user to choose a number 
            System.out.println("\nEnter one of the following (0=rock, 1=paper, 2=scissors)");
            userChoice = input.nextInt();

            // add user and computer choices to array lists 
            userChoices.add(userChoice);
            computerChoices.add(computerChoice);

            // ensure user inputs correctly
            if (userChoice > 2) { 
                System.out.println("You must enter a number between 0 and 2 "); 
            }
            
            // check if its a tie
            if ((userChoice == rock && computerChoice == 0) 
            || (userChoice == paper && computerChoice == 1) 
            || (userChoice == scissors && computerChoice == 2)) {
                System.out.println("You drew: " + userChoice + " and your Computer drew: " + computerChoice);
                System.out.println("It's a tie, try again!"); 
            } 
            
            // check if user wins 
            if ((userChoice== paper && computerChoice == 2)
            || (userChoice == rock && computerChoice == 1)
            || (userChoice == scissors && computerChoice == 0)) {
                
                System.out.println("You drew: " + userChoice + " and your Computer drew: " + computerChoice);
                System.out.println("Yaaayyyy, You win!");

                // keep score of user wins 
                userScore++;
                
            }
            // check if computer wins 
            else if ((userChoice== rock && computerChoice == 2)
            || (userChoice == paper && computerChoice == 0)
            || (userChoice == scissors && computerChoice == 1)) {
                System.out.println("You drew: " + userChoice + " and your Computer drew: " + computerChoice);
                System.out.println("Sorry, Computer wins!");

                // keep score of computer wins
                computerScore++;
            }
            // display user and computer choices so far 
            System.out.println("You have so far drawn: " + userChoices + " and Your computer has so far drawn: " + computerChoices); 

            //display user wins vs computer wins 
            System.out.println("Your score so far is: " + userScore + " Your computer's score so far is: " + computerScore);
   }
        }
}
}