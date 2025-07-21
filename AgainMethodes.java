import java.util.Scanner;

public class AgainMethodes {

    static double side;

    public static void setside() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a valid number:");
        side = input.nextDouble();

    }

    public static double calculatearea() {
        return side * side;
    }

    public static void main(String[] args) {
        setside();

        double area = calculatearea();
        System.out.println("put area value:" + area);
    }
}
