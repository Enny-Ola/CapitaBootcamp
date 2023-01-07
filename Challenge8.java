import java.util.Scanner; // import scanner class  
import java.time.temporal.ChronoUnit; // import chronounit class
import java.time.LocalDate; // import localdate class
import java.time.format.DateTimeFormatter;  // Import DateTimeFormatter class
public class Challenge8 {
    public static void main(String[] args) { 
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // initialise datetimeformatter class 
    Scanner reader = new Scanner(System.in); // initialise scanner class
    String userDoB; // declare user input 
    LocalDate firstDate, todaysDate; // declare the dates to be converted using chronounit method

    System.out.println("enter your date of birth in 'dd-MM-yyyy' format: "); // ask for user input
    userDoB = reader.nextLine();
   
    firstDate = LocalDate.parse(userDoB, myFormatObj); // convert user date of birth to correct format
    todaysDate = LocalDate.now(); // get today's date
    long days = ChronoUnit.DAYS.between(firstDate, todaysDate); // convert user age into days 
    long years = days/365; // convert user age into years 
   
    // if statement to confirm if they can vote 
    if (years < 18) {
        System.out.println("sorry not old enough to vote");
        
    } else {
        System.out.println("old enough to vote");
        System.out.println(todaysDate + " " + userDoB);
    }
    reader.close();
  }
}
