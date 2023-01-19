import java.util.Scanner;
    public class StudentVersionTwo {
    public static void main(String[] args) {
        boolean run = true;
        String choice;
        do {
            choice = displayMenu();
            if (choice.equals("x")){
                run = false;
            }
            else if (choice.equals("1")){
                int x = getNumber(1);
                int y = getNumber(2);
                int total = sumMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("2")){
                int x = getNumber(1);
                int y = getNumber(2);
                int total = subtractMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("3")){
                int x = getNumber(1);
                int y = getNumber(2);
                int total = multiplyMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else if (choice.equals("4")){
                int x = getNumber(1);
                int y = getNumber(2);
                int total = divideMethod(x,y);
                display(total);
                run = checkFinish();
            }
            else {
                System.out.println("Entry not recognised, please try again...");
            }
        } while (run) ;
    }
    public static int getNumber(int count){
        boolean numberWrong = true;
        while (numberWrong) {
            if (count == 1) {
                System.out.print("Enter 1st number: ");
            } else {
                System.out.println("Enter 2nd number: ");
            }
            Scanner reader = new Scanner(System.in);
            try {
                    int x = reader.nextInt();
                    return x;
                } catch (Exception e){
                    System.out.println("Number not recognised, please try again.");
                }
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
            if (ans.equals("y")){
                return false;
            }
            else{
                return true;
            }
    }
        public static int sumMethod(int n, int m){
            System.out.println("When adding the numbers");
            return (n * m);
        }
    
        public static int subtractMethod(int n, int m){
            System.out.println("When subtracting the numbers");
            return (n - m);
        }
    
        public static int multiplyMethod(int n, int m){
            System.out.println("When multiplying the numbers");
            return (n * m);
        }
    
        public static int divideMethod(int n, int m){
            System.out.println("When dividing the numbers");
            return ((int)n / m);
        }
    
        public static void display(int sum){
            System.out.println("The answer is: " + sum);
        }
    }