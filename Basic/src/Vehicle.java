public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String color;

    public Vehicle(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return year + " " + make + " " + model + " (" + color + ")";
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, String color, int numDoors) {
        super(make, model, year, color);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public String toString() {
        return super.toString() + ", " + numDoors + " doors";
    }
}

class Truck extends Vehicle {
    private int maxPayloadWeight;

    public Truck(String make, String model, int year, String color, int maxPayloadWeight) {
        super(make, model, year, color);
        this.maxPayloadWeight = maxPayloadWeight;
    }

    public int getMaxPayloadWeight() {
        return maxPayloadWeight;
    }

    public String toString() {
        return super.toString() + ", max payload weight: " + maxPayloadWeight + " lbs";
    }
}

class Motorcycle extends Vehicle {
    private int engineDisplacement;

    public Motorcycle(String make, String model, int year, String color, int engineDisplacement) {
        super(make, model, year, color);
        this.engineDisplacement = engineDisplacement;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public String toString() {
        return super.toString() + ", engine displacement: " + engineDisplacement + " cc";
    }
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car("Toyota", "Camry", 2015, "White", 4);
        vehicles[1] = new Car("Honda", "Accord", 2015, "Black", 4);
        vehicles[2] = new Truck("Ford", "F-150", 2015, "Red", 3000);
        vehicles[3] = new Truck("Chevrolet", "Silverado", 2015, "Blue", 3500);
        vehicles[4] = new Motorcycle("Harley-Davidson", "Sportster", 2015, "Black", 883);
        vehicles[5] = new Motorcycle("Honda", "Shadow", 2015, "Red", 750);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
