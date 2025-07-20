import java.util.Scanner;

public class cargearsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat;

        // Step 1: Start the car
        System.out.println("Start The Engine:");
        System.out.println("Give race...");
        System.out.print("Enter gear number to move (should be 1): ");
        int pickNumber = input.nextInt();

        if (pickNumber != 1) {
            System.out.println(" Car can't be started. Please choose gear 1.");
            return;
        }

        System.out.println(" Car started successfully in gear 1!");

        input.nextLine();

        do {
            System.out.println("\n========= GEAR MENU =========");
            System.out.println("1. First Gear");
            System.out.println("2. Second Gear");
            System.out.println("3. Third Gear");
            System.out.println("4. Reverse");
            System.out.println("5. Stop");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");
            int gear = input.nextInt();

            switch (gear) {
                case 1:
                    System.out.println(" Car is moving slowly in 1st gear...");
                    break;
                case 2:
                    System.out.println(" Car is speeding up in 2nd gear...");
                    break;
                case 3:
                    System.out.println(" Car is very fast in 3rd gear!");
                    break;
                case 4:
                    System.out.println(" Car is reversing...");
                    break;
                case 5:
                    System.out.println(" Car stopped.");
                    break;
                default:
                    System.out.println(" Invalid gear choice.");
                    break;
            }

            input.nextLine();
            System.out.print("\nDo you want to continue driving? (y/n): ");
            repeat = input.nextLine();

        } while (repeat.equalsIgnoreCase("y"));

        System.out.println("Thank you! Car Engine stopped.");
    }
}
