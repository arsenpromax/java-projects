import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Console console = System.console();
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        System.out.println("\nWelcome to JavaBank - the best bank in the world!");

        boolean running = true;
        while (running) {
            System.out.println("\nType 1 to check balance");
            System.out.println("Type 2 to deposit money");
            System.out.println("Type 3 to withdraw money");
            System.out.println("Type 4 to exit");

            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("\nBalance: $" + balance);
                    break;
                case 2:
                    System.out.println("\nEnter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("\n$" + deposit + " deposited");
                    System.out.println("Balance: $" + balance);
                    break;
                case 3:
                    System.out.println("\nEnter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("\n$" + withdraw + " withdrawed");
                        System.out.println("Balance: $" + balance);
                        break;
                    } else
                        System.out.println("\nYou do not have enough funds");
                    break;
                case 4:
                    running = false;
                    System.out.println("\nGoodbye!");
                    break;
                default:
                    System.out.println("\nInvalid operation");
            }
        }
    }
}
