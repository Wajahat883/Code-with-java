import java.util.Scanner;

public class claculatorusingswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeate;
        do {
            System.out.println("Enter some number:");
            System.out.println("1st number:");
            int number1 = input.nextInt();
            System.out.println("2nd number:");
            int number2 = input.nextInt();
            input.nextLine();
            System.out.println("Choose operator (+, -, *, /):");
            String operator = input.nextLine();
            switch (operator) {
                case "+":
                    System.out.println("Add:" + (number1 + number2));
                    break;
                case "-":
                    System.out.println("Minus:" + (number1 - number2));
                    break;
                case "*":
                    System.out.println("multiple:" + (number1 * number2));
                case "/":
                    if (number2 != 0) {
                        System.out.println("Divide: " + (number1 / number2));
                    } else {
                        System.out.println("can't divided by zero");
                    }

                default:
                    System.out.println("invalid oprator");
                    break;
            }
            System.out.println("do you want more y/n");
            repeate = input.nextLine();
        } while (repeate.equalsIgnoreCase("Y"));
        System.out.println("Thank you for using the calculator!");

    }
}
