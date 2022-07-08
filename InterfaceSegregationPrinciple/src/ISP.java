
//in that case, if we implement that the problem will be like
//for all 2d there are area but for 3d the shape interface will create an issue
//as its enforce to override the volume method, so we need to segregate that as below
/*interface Shape{
    public double area();
    public double volume();
}*/
interface Shape2D{
    public double area();
}

interface Shape3D{
    public double volume();
}

//now if the shape is 2d then we only implement Shape2D
class Square implements Shape2D{

    private double width;
    private double height;

    public Square() {
    }

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //getters and setters

    @Override
    public double area() {
        return this.height*this.width;
    }
}
//now if the shape is dd then we only implement Shape3D
class Cube implements Shape2D,Shape3D{

    private double width;
    private double height;
    private double length;

    public Cube() {
    }

    public Cube(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    //getters and setters


    @Override
    public double area() {
        return 6*Math.pow(this.height,2);
    }

    @Override
    public double volume() {
        return Math.pow(this.height,3);
    }
}

public class ISP {
    public static void main(String[] args) {

        System.out.println("Interface Segregation Principle");
        System.out.println("-------------------------------");

        Square square = new Square(4,4);
        System.out.println("Area of square is:"+square.area());

        Cube cube = new Cube(3,3,3);
        System.out.println("Area of cube is:"+cube.area());
        System.out.println("Volume of cube is:"+cube.volume());
    }
}