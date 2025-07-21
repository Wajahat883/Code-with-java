class vehical {
    String model;
    String type;
    String year;

}

class car extends vehical {
    void sound() {
        System.out.println("that's car make more sound ");
    }
}

public class constructor {

    public static void main(String[] args) {
        car cars = new car();
        cars.model = "farari";
        cars.type = "new";
        cars.year = "2025";
        System.out.println("that's car is very nice:" + cars.model + " " + cars.type + " " + cars.year);
        cars.sound();
    }
}