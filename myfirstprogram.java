import java.util.Scanner;

public class myfirstprogram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = input.nextLine();
        int number = input.nextInt();
        System.out.println(name + "number" + number);

        // print star
        int star = 5;
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                if (i == j || j == i - 1 || i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();

        }

        String firstname = "Muhammad ";
        String lastname = "Wajahat";
        String watchMoive = "Last-Hope";
        String username = firstname + lastname;
        int tickets = 3;
        double priceoftickets = 450.00;
        double totalprice = tickets * priceoftickets;
        System.out.println("Booking Details:");
        System.out.println("Watchmovie:" + watchMoive.toUpperCase());
        System.out.println("Username:" + username.toUpperCase());
        System.out.println("How much tickets:" + tickets);
        System.out.println("one ticket price:" + priceoftickets);
        System.out.println("total price:" + totalprice);
        // if else statement using

        int[] tony = { 100, 200, 300, 500, 700 };
        String[] items = { "Food", "Gas", "shooping", "Package", "takepc" };
        int totalbalance = 2000;

        for (int i = 0; i < tony.length; i++) {
            int price = tony[i];
            String item = items[i];

            if (totalbalance >= price) {
                System.out.println("Tony bought:" + item + "for Rs:" + price);
                totalbalance -= price;
                System.out.println("Remaing balance:" + totalbalance);

                if (totalbalance <= 500) {
                    System.out.println("Balance low:" + totalbalance + "send tony home!");
                }
            } else {
                System.out.println("balance to much low tony can't go to the trip" + item + "no money" + price);
            }

        }

    }
}