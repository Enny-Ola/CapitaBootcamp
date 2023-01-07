// class program to test Vehicles class
public class VehiclesTest {    
    // implement main class for executing code
    public static void main(String[] args) {
        // instantiate new objects of the Vehicles class 
        Vehicles Car = new Vehicles();
        Vehicles Train = new Vehicles();
        Vehicles Plane = new Vehicles();

        // call set and then get methods for each new object 
        // to display each of their properties 
        Car.setType("Sedan");
        Car.setSpeed(120);
        System.out.println("The " + Car.getType() + 
        " is the most popular type of car with an average speed of " + 
        Car.getSpeed() + " mph.\n");

        Train.setType("Electric train");
        Train.setSpeed(175);
        System.out.println("The " + Train.getType() + 
        " is the most popular type of train with an average speed of " + 
        Train.getSpeed() + " mph.\n");

        Plane.setType("Boeing 747");
        Plane.setSpeed(575);
        System.out.println("The " + Plane.getType() + 
        " is the most popular type of Plane with an average speed of " + 
        Plane.getSpeed() + " mph.");
    }
}
