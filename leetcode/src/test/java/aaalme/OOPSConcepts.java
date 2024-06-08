package aaalme;

// Define a class called "Vehicle"
class Vehicle {
    // Attributes (data members)
    private String color;
    private int wheels;
  
    // Constructor
    public Vehicle(String color, int wheels) {
      this.color = color;
      this.wheels = wheels;
    }
  
    // Methods (functions)
    public void honk() {
      System.out.println("Honk honk!");
    }
  
    public void displayInfo() {
      System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
  }
  
  // Define a subclass called "Car" that inherits from "Vehicle"
class Car extends Vehicle {
    // Additional attributes
    private int doors;
  
    // Constructor
    public Car(String color, int wheels, int doors) {
      super(color, wheels); // Call the parent class constructor
      this.doors = doors;
    }
  
    // Override the displayInfo method
    @Override
    public void displayInfo() {
      super.displayInfo(); // Call the parent class method
      System.out.println("Doors: " + doors);
    }
  }
  
  // Usage example
  public class OOPSConcepts {
    public static void main(String[] args) {
      // Create a Vehicle object
      Vehicle vehicle = new Vehicle("Red", 4);
      vehicle.honk();
      vehicle.displayInfo();
  
      // Create a Car object
      Car car = new Car("Blue", 4, 2);
      car.honk();
      car.displayInfo();
    }
  }
