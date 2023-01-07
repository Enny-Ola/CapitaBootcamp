public class Circle {
    private double radius;
    private String color;
    double pi = 3.14;
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    // behavioural getArea method 
    public double getArea() {
        return pi * this.radius * this.radius;
    }
}
