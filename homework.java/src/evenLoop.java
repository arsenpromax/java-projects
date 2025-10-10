import java.util.Scanner;

public class evenLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        //while
        int a = 1;
        while (a<=n){
            if (a % 2 == 0)
                System.out.println(a);
            a+=1;
        }

        System.out.println("\n");

        //do-while
        int b = 1;
        do {
            if (b % 2 == 0)
                System.out.println(b);
            b+=1;
        } while (b<=n);

        System.out.println("\n");

        //for
        for (int i=1; i<=n; i+=1){
            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}
