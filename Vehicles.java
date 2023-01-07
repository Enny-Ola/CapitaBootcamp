// OOP to display properties of different types of vehicles 
public class Vehicles { // create class 

    // declare variables
    private String type;
    private int speed;

    // implement getters and setters including getSpeed() behavioural method
    public String getType() { 
        return type;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed; 
    } 
}
