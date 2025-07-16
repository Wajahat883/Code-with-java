import java.util.Scanner;

// Beginning of the main class
public class JavaCodewithAllTODOsImplemented {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int dayOfTheWeek = 1;

        System.out.println(
                "********** MENU *****************\n" +
                        "These are the choices for week of the day.\nPlease enter only values from 1-7:\n" +
                        "1. MONDAY\n" +
                        "2. TUESDAY\n" +
                        "3. WEDNESDAY\n" +
                        "4. THURSDAY\n" +
                        "5. FRIDAY\n" +
                        "6. SATURDAY\n" +
                        "7. SUNDAY\n" +
                        "***********************************");

        System.out.print("Enter your choice (1-7): ");
        dayOfTheWeek = keyboard.nextInt();

        int subChoice;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");

                System.out.println(
                        "*********** SUB MENU FOR MONDAY ******\n" +
                                "1. Yes, I had my breakfast\n" +
                                "2. No, I would like one\n" +
                                "**************************************");

                System.out.print("Enter your choice (1 or 2): ");
                subChoice = keyboard.nextInt();

                if (subChoice == 1) {
                    System.out.println("Good. Now you have a catchup meeting at 9AM. Prepare your notes.");
                } else if (subChoice == 2) {
                    System.out.println("Let us divert on Highway 54 and have a Burger on the drive-in.");
                } else {
                    System.out.println("NO such choice available.");
                }

                break;

            case 2:
                System.out.println("Tuesday: Time for team sync-up and planning.");
                break;

            case 3:
                System.out.println("Wednesday: Mid-week check-in and progress review.");
                break;

            case 4:
                System.out.println("Thursday: Continue project work and send updates.");
                break;

            case 5:
                System.out.println("Friday: Final touches and preparing for weekend.");
                break;

            case 6:
                System.out.println("Saturday: Relax and enjoy your hobbies.");
                break;

            case 7:
                System.out.println("Sunday: Family time and rest day.");
                break;

            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

    }

}
