import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;

// Main section where everything is sorted and connected
public class Main {
    public static double balance = 0;
    public static void main(String[] args) {

        balanceFileHandler();
        System.out.println("\nWelcome to JavaBank - the best bank in the world!");
        mainMenu();

    }

    // Main menu
    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
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
                    try(FileWriter writer = new FileWriter("balance.txt")){
                        writer.write(Double.toString(balance));
                    }
                    catch(IOException e){
                        System.out.println("Balance error");
                    }
                    break;
                case 3:
                    if (balance == 0)
                        System.out.println("You do not have any funds\nBalance: " + balance);
                    else {
                        System.out.println("Enter amount to withdraw: ");
                        double withdraw = scanner.nextDouble();
                        if (balance >= withdraw) {
                            balance -= withdraw;
                            System.out.println("$" + withdraw + " withdrawn");
                            System.out.println("Balance: $" + balance);
                            try(FileWriter writer = new FileWriter("balance.txt")){
                                writer.write(Double.toString(balance));
                            }
                            catch(IOException e){
                                System.out.println("Balance error");
                            }
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

    // Read and save balance and handle files
    public static void balanceFileHandler(){
        Path filePath = Paths.get("balance.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)));
            String balanceStr = reader.readLine();
            balance = Double.parseDouble(balanceStr);
            reader.close();
        } catch(FileNotFoundException e) {
            try(FileWriter writer = new FileWriter("balance.txt")){
                writer.write(Double.toString(balance));
            }
            catch(IOException e1){
                System.out.println("Error - contact the developer");
            }
        } catch (IOException e2) {
            System.out.println("Error - contact the developer");
        }
    }

}
