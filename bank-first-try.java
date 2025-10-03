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
            System.out.println("\nType 1 to check balance, 2 to deposit money, 3 to withdraw money, 4 to exit: ");

            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("$" + deposit + " deposited");
                    System.out.println("Balance: $" + balance);
                    break;
                case 3:
                    if (balance == 0)
                        System.out.println("You do not have any funds\nBalance: " + balance);
                    else {
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        if (balance >= withdraw) {
                            balance -= withdraw;
                            System.out.println("$" + withdraw + " withdrawed");
                            System.out.println("Balance: $" + balance);
                            break;
                        } else
                            System.out.println("You do not have enough funds\nBalance: " + balance);
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
