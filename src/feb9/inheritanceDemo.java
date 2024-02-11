package feb9;

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

    public void start() {
        System.out.println("vehicle is Starting");
    }

    public void stop() {
        System.out.println("vehicle is stopping");
    }

    public void displayInfo() {
        System.out.println("Make of vehicle is " + make);
        System.out.println("Model of the vehicle is " + model);
        System.out.println("Year of the vehicle is " + year);

    }

}

class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    public void numberOfDoors() {
        System.out.println("It has for four doors");
    }

}

class MotorCycle extends Vehicle {
    public MotorCycle(String make, String model, int year) {
        super(make, model, year);
    }

    public void numberOfCylinders() {
        System.out.println("It has 4 cylinders");
    }
}

class ElectricVehicle extends Car {
    public ElectricVehicle(String make, String model, int year) {
        super(make, model, year);
    }

    public void batteryCapacity() {
        System.out.println("Battery capacity is 1200volts");
    }

    public void ChargeBatter() {
        System.out.println("Battery is charging");
    }

}

public class inheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Fusion", 2011);
        MotorCycle motorcycle = new MotorCycle("Yamaha", "Fz-S", 2016);
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla", "Y-model", 2020);
        car.displayInfo();


        car.numberOfDoors();
        motorcycle.displayInfo();
        motorcycle.numberOfCylinders();

        
        electricVehicle.displayInfo();
        electricVehicle.batteryCapacity();
    }
}