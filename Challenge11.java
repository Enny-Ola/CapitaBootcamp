// program for logic gate questions and answers 
import java.util.Scanner;
public class Challenge11 {
    public static void main(String[] args) { 

    // initialise scanner class 
    Scanner reader = new Scanner(System.in);

    // ask user to choose logic gate
    System.out.println("\n Lets get answers to some logic gate questions");
    System.out.println("\n To implement the AND Logic gate, enter 'AND' ");
    System.out.println("\n To implement the OR Logic gate, enter 'OR' ");
    System.out.println("\n To implement the XOR Logic gate, enter 'XOR' ");
    System.out.println("\n To implement the NAND Logic gate, enter 'NAND' ");
    System.out.println("\n To implement the NOR Logic gate, enter 'NOR' ");

    // collect user input 
    String userChoice1 = reader.nextLine();

    System.out.println("\n Now, enter either 0 or 1");
    int userChoice2 = reader.nextInt();

    System.out.println("\n Again, enter either 0 or 1");
    int userChoice3 = reader.nextInt();

    // Check for AND input 
    if (userChoice1.equals("AND") || userChoice1.equals("and")) {
    System.out.println("\n Your AND logic gate result is: " + userChoice2 + " x " + userChoice3 + " = " + (userChoice2 * userChoice3));

    // Check for OR input 
    } else if ((userChoice1.equals("OR") || userChoice1.equals("or")) && 
    ((userChoice2 == 1 && userChoice3 == 1) 
    || (userChoice2 == 1 && userChoice3 == 0)
    || (userChoice2 == 0 && userChoice3 == 1))) {
        System.out.println("\n Your OR logic gate result is: 1");
    } else if ((userChoice1.equals("OR") || userChoice1.equals("or")) 
    && (userChoice2 == 0 && userChoice3 == 0)) {
        System.out.println("\n Your OR logic gate result is: 0");

    // Check for XOR input 
    } else if ((userChoice1.equals("XOR") || userChoice1.equals("xor")) 
    && ((userChoice2 == 0 && userChoice3 == 0)) || (userChoice2 == 1 && userChoice3 == 1)) {
        System.out.println("\n Your XOR logic gate result is: 0");
    } else if ((userChoice1.equals("XOR") || userChoice1.equals("xor")) 
    && ((userChoice2 == 0 && userChoice3 == 1)) || (userChoice2 == 1 && userChoice3 == 0)) {
    System.out.println("\n Your OR logic gate result is: 1");
// Check for NAND input 
} else if ((userChoice1.equals("NAND") || userChoice1.equals("nand")) 
    && ((userChoice2 == 0 && userChoice3 == 1) 
    || (userChoice2 == 1 && userChoice3 == 0) 
    || (userChoice2 == 0 && userChoice2 == 0))) {
        System.out.println("\n Your XOR logic gate result is: 1");

    // Check for NAND input 
    } else if ((userChoice1.equals("NAND") || userChoice1.equals("nand")) 
    && ((userChoice2 == 1 && userChoice3 == 1))) { 
        System.out.println("\n Your NAND logic gate result is: 0");
    } else if ((userChoice1.equals("NAND") || userChoice1.equals("nand")) 
    && ((userChoice2 == 0 && userChoice3 == 1) 
    || (userChoice2 == 1 && userChoice3 == 0) 
    || (userChoice2 == 0 && userChoice2 == 0))) {
        System.out.println("\n Your NAND logic gate result is: 1");

    // Check for NOR input 
    } else if ((userChoice1.equals("NOR") || userChoice1.equals("nor")) 
    & ((userChoice2 == 0 && userChoice3 == 0))) { 
        System.out.println("\n Your NOR logic gate result is: 1");
    } else if ((userChoice1.equals("NOR") || userChoice1.equals("nor")) 
    && ((userChoice2 == 0 && userChoice3 == 1) 
    || (userChoice2 == 1 && userChoice3 == 0) 
    || (userChoice2 == 1 && userChoice2 == 1))) { 
        System.out.println("\n Your NOR logic gate result is: 0");
            }
        }
    }


