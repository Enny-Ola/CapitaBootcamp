import java.util.Scanner;

public class StudentVersionThree {
    public static void main(String[] args) {
        boolean run = true;
        String choice;

        do {
            choice = displayMenu();
            switch (choice) {
                case "x" -> run = false;
                case "1" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    double total = sumMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                case "2" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    double total = subtractMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                case "3" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    double total = multiplyMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                case "4" -> {
                    double x = getNumber(1);
                    double y = getNumber(2);
                    double total = divideMethod(x, y);
                    display(total);
                    run = checkFinish();
                }
                default -> System.out.println("Entry not recognised, please try again...");
            }
        } while (run);
    }
    public static double getNumber(int count){
            if (count == 1) {
                System.out.print("Enter 1st number: ");
            } else {
                System.out.print("Enter 2nd number: ");
            }
            Scanner reader = new Scanner(System.in);
            try {
                return reader.nextDouble();
            } catch (Exception e){
                System.out.println("Number not recognised, please try again.");
            }
        return 0;
    }
    public static String displayMenu(){
        System.out.println(" Calculator Menu");
        System.out.println("1. Add numbers");
        System.out.println("2. Subtract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        System.out.println("x. Exit program");
        System.out.println();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter option (1,2,3,4,x): ");
        return reader.nextLine();
    }
    public static boolean checkFinish(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Have you finished (y/n): ");
        String ans = reader.nextLine().trim().toLowerCase();
        return !ans.equals("y");
    }
    public static double sumMethod(double n, double m){
        System.out.println("When adding the numbers");
        return (n * m);
    }
    public static double subtractMethod(double n, double m){
        System.out.println("When subtracting the numbers");
        return (n - m);
    }
    public static double multiplyMethod(double n, double m){
        System.out.println("When multiplying the numbers");
        return (n * m);
    }
    public static double divideMethod(double n, double m){
        System.out.println("When dividing the numbers");
        return (n / m);
    }
    public static void display(double sum){
        System.out.println("The answer is: " + sum);
    }
}
