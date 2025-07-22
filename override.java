// Base class Notification
class Notification {
    String android;
    String apple;
    String laptop;

    Notification(String android, String apple, String laptop) {
        this.android = android;
        this.apple = apple;
        this.laptop = laptop;
    }

    void send() {
        System.out.println("Sending notifications to all devices:");
        System.out.println("- Android: " + android);
        System.out.println("- Apple:   " + apple);
        System.out.println("- Laptop:  " + laptop);
    }
}

// Subclass Android
class Android extends Notification {
    Android(String android, String apple, String laptop) {
        super(android, apple, laptop);
    }

    @Override
    void send() {
        System.out.println("Notification sent to Android: " + android);
    }
}

// Subclass Apple
class Apple extends Notification {
    Apple(String android, String apple, String laptop) {
        super(android, apple, laptop);
    }

    @Override
    void send() {
        System.out.println("Notification sent to Apple (iOS): " + apple);
    }
}

// Subclass Laptop
class Laptop extends Notification {
    Laptop(String android, String apple, String laptop) {
        super(android, apple, laptop);
    }

    @Override
    void send() {
        System.out.println("Notification sent to Laptop: " + laptop);
    }
}

public class override {
    public static void main(String[] args) {
        Notification n1 = new Android("Hello Android!", "Hello iPhone!", "Hello Laptop!");
        Notification n2 = new Apple("Hello Android!", "Hello iPhone!", "Hello Laptop!");
        Notification n3 = new Laptop("Hello Android!", "Hello iPhone!", "Hello Laptop!");

        n1.send(); // Android ka override chalega
        n2.send(); // Apple ka override chalega
        n3.send(); // Laptop ka override chalega

        System.out.println("\n--- General Send Call ---");
        Notification nAll = new Notification("AllA", "AllB", "AllC");
        nAll.send(); // Base class ka general method chalega
    }
}
