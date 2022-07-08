//Open closed principle
interface AreaShapeCalculator{
    double area();
}
//after modification
class Rectangle implements AreaShapeCalculator{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return this.length*this.width;
    }
}
//after modification
class Circle implements AreaShapeCalculator{
    private double radious;

    public Circle() {
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radious,2);
    }
}
//So as we can see every we add a shape and try to calulate area there is needed chage
//which basically violates OCP
// To prevent it we can create interface and implement the area calculation feature with it
//hence commenting
/*class AreaCalculator{
    public double areaOfRectangle(Rectangle rectangle){
        return  rectangle.getLength()*rectangle.getWidth();
    }
    public double areaOfCircle(Circle circle){
        return (22/7)*circle.getRadious()*circle.getRadious();
    }
}*/

//Now this class work like delegation but flexible,
//We can create and calculate area as much as we want
class AreaCalculator{
    public double areaCalculator(AreaShapeCalculator shape){
        return  shape.area();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Open Closed Principle");
        System.out.println("----------------------");

        AreaShapeCalculator shapeCircle = new Circle(5);
        System.out.println("Area of the circle is:"+shapeCircle.area());

        AreaShapeCalculator shapeRect = new Rectangle(2,4);
        System.out.println("Area of the rectangle is:"+shapeRect.area());
    }
}