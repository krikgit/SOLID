//Liskov Substitution Principle
class Vehicle{
    public void getSpeed(){
        System.out.println("This is speed from Vehicle");
    }
    public void getCubicCapacity(){
        System.out.println("This is Cubic Capacity from Vehicle");
    }
}

class Car extends Vehicle{
    public void getSpeed(){
        System.out.println("This is speed from Car");
    }
    public void getCubicCapacity(){
        System.out.println("This is Cubic Capacity from Car");
    }

    public void getHatchBack(){
        System.out.println("This is Hatch Back from Car");
    }
}

class Bus extends Vehicle{
    public void getSpeed(){
        System.out.println("This is speed from Bus");
    }
    public void getCubicCapacity(){
        System.out.println("This is Cubic Capacity from Bus");
    }

    public void getExitLoc(){
        System.out.println("This is Exit Loc from Bus");
    }
}
public class LSP {
    public static void main(String[] args) {
        System.out.println("Liskov Substitution Principle");
        System.out.println("-------------------------------");
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();

        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}