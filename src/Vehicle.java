public class Vehicle {
    void drive(){
        System.out.println("Driving!");
    }
    void vehicleBreak(){
        System.out.println("Break!");
    }
    void reverse(){
        System.out.println("Reverse!");
    }
}
class Car extends Vehicle{
    void motorRacing(){
        System.out.println("Racing!");
    }
}
class ModernCar extends Car{
    void fly(){
        System.out.println("Flying!");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("Surfing!");
    }
}
class ModernBoat extends Boat{
    void landRidding(){
        System.out.println("Ridding!");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar mc = new ModernCar();
        ModernBoat mb = new ModernBoat();
        mc.drive();
        mc.vehicleBreak();
        mc.reverse();
        mc.motorRacing();
        mc.fly();
        mb.drive();
        mb.vehicleBreak();
        mb.reverse();
        mb.surf();
        mb.landRidding();
    }
}
