
// Parent class
class Vehicle {
    protected int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public void speedUp() {
        System.out.println("Speeding up the vehicle");
        speed += 10;
    }

    public void displaySpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Accelerating the car");
        super.speedUp(); // Call the parent class method
    }
}

// Subclass 2
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        System.out.println("Pedaling the bicycle");
        speed += 5; // Increase speed differently for a bicycle
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bicycle();

        vehicle1.speedUp();
        vehicle1.displaySpeed();

        vehicle2.speedUp();
        vehicle2.displaySpeed();
    }
}
