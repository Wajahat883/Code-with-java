class vehical {
    String model;
    String type;
    String year;
    int speed;

    public vehical(String model, String type, String year) {
        this.model = model;
        this.type = type;
        this.year = year;
        this.speed = 0;
        System.out.println("vehicle created.");
    }

    public void accelerate() {
        this.speed += 5;

    }

    public void brake() {
        this.speed -= 5;
    }
}

class Car extends vehical {
    int seatposition;

    public Car(String model, String type, String year) {
        super(model, type, year);
        this.seatposition = 0;
        System.out.println("car careated ");

    }

    public void adjustseat(int adjustment) {
        this.seatposition += adjustment;
        if (adjustment > 0) {
            System.out.println("Moving seat forward...");
        } else if (adjustment < 0) {
            System.out.println("Moving seat backward...");
        } else {
            System.out.println("Seat position not changed.");
        }
    }
}

public class SupperandSubClasses {

    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "new", "2025");
        tesla.accelerate();
        tesla.brake();
        tesla.adjustseat(2);
    }
}
