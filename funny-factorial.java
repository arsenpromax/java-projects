import java.math.BigInteger;
import java.util.Scanner;

public class funnyFactorial {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        BigInteger bigNumber = scanner.nextBigInteger();
        BigInteger bigFactorial = BigInteger.valueOf(1);

        while(bigNumber.compareTo(BigInteger.valueOf(0)) > 0) {
            bigFactorial = bigFactorial.multiply(bigNumber);
            bigNumber = bigNumber.subtract(BigInteger.valueOf(1));
        }

        System.out.println(bigFactorial);

    }
}
