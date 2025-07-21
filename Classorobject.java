import java.util.Scanner;

class Bankaccount {
    private double salary;

    public void deposite(double amount) {
        if (amount > 0) {
            salary += amount;

        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= salary) {
            salary -= amount;
        } else {
            System.out.println("insuficent balance");
        }
    }

    public double getbalance() {
        return salary;
    }

    public class Classorobject {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Bankaccount acc = new Bankaccount();
            System.out.print("input a vaild deposit:");
            double deposites = input.nextDouble();
            acc.deposite(deposites);
            acc.withdraw(3000);
            System.out.println("Balance:" + acc.getbalance());
        }

    }

}
