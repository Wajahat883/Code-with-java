import java.util.Scanner;

public class Drivingsimulationsolution {

    public static String gear = "P";
    public static int speed = 0;
    public static boolean isEngineOn = false;
    public static Scanner input = new Scanner(System.in);

    public static void startCar() {
        boolean displayMenu = true;
        while (displayMenu) {
            displayDashboard();
            int choice = getUserChoice();
            processChoice(choice);
            System.out.println();
        }
    }

    public static void displayDashboard() {
        System.out.println("------ Car Dashboard ------");
        System.out.println("Speed: " + speed);
        System.out.println("Engine: " + (isEngineOn ? "On" : "Off"));
        System.out.println("Gear: " + gear);
        System.out.println("Menu:");
        System.out.println("1. Turn on/off the engine");
        System.out.println("2. Change gear (P, D, R)");
        System.out.println("3. Accelerate");
        System.out.println("4. Brake");
        System.out.println("5. Exit");
    }

    public static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    public static void processChoice(int choice) {
        switch (choice) {
            case 1:
                toggleEngine();
                break;
            case 2:
                changeGear();
                break;
            case 3:
                accelerate();
                break;
            case 4:
                brake();
                break;
            case 5:
                exitSimulation();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void toggleEngine() {
        isEngineOn = !isEngineOn;
        if (!isEngineOn) {
            speed = 0;
            gear = "P";
        }
        System.out.println("Engine is now " + (isEngineOn ? "ON" : "OFF"));
    }

    public static void changeGear() {
        if (!isEngineOn) {
            System.out.println("Cannot change gear while engine is off.");
            return;
        }

        System.out.print("Enter gear (P, D, R): ");
        String newGear = input.next().toUpperCase();

        if (newGear.equals("P") || newGear.equals("D") || newGear.equals("R")) {
            gear = newGear;
            System.out.println("Gear changed to " + gear);
        } else {
            System.out.println("Invalid gear entered.");
        }
    }

    public static void accelerate() {
        if (isEngineOn && !gear.equals("P")) {
            speed += 10;
            System.out.println("Accelerated. Current speed: " + speed);
        } else {
            System.out.println("Cannot accelerate. Make sure engine is on and gear is not in 'P'.");
        }
    }

    public static void brake() {
        if (isEngineOn && speed > 0) {
            speed -= 5;
            if (speed < 0)
                speed = 0;
            System.out.println("Brake applied. Current speed: " + speed);
        } else {
            System.out.println("Cannot apply brake. Either engine is off or car is already stopped.");
        }
    }

    public static void exitSimulation() {
        System.out.println("Exiting simulation. Thank you for driving safely!");
        System.exit(0);
    }

    public static void main(String[] args) {
        startCar();
    }
}
