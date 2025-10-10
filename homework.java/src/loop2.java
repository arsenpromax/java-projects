import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ask user for a number
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // While loop
        //Create variable i and assign it a value of 1 because we start from 1
        int i = 1;
        // While 'i' is less than or equal to the number the user printed, the program prints i and makes is bigger by 1
        while (i<=n) {
            System.out.println(i);
            i+=1;
        }

        System.out.println("\n");

        // Do-while loop
        int a = 1;
        do {
            System.out.println(a);
            a+=1;
        } while (a<=n);

        System.out.println("\n");

        // For loop
        for(int b=1; b<=n; b+=1){
            System.out.println(b);
        }

    }
}
