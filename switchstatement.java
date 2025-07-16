
import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruite name:");
        String chooseflavour = input.nextLine();

        switch (chooseflavour) {

            case "mango":
                System.out.println("mango is the fruit of summer ");

                break;
            case "apple":
                System.out.println("apple is the fruit of all weather");
                break;
            case "graps":
                System.out.println("graps is the fruit of winter ");
                break;

            default:
                System.out.println("invalid data please write correct");
                break;
        }
    }
}
