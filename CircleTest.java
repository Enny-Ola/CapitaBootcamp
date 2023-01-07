public class CircleTest {
    
    public static void main(String[] args) {
        Circle myObj = new Circle();
        myObj.setColor("red");
        myObj.setRadius(1.0);
        myObj.getArea();
        System.out.println("The radius of this " + myObj.getColor() + " circle is " + myObj.getRadius() + " and the area is " + myObj.getArea());
    }
}
