public class fizzBuzz {
    public static void main(String[] args) {

        //while
        int a = 1;
        while (a<=20){
            if (a % 3 == 0)
                System.out.println("Fizz");
            else if (a % 5 == 0)
                System.out.println("Buzz");
            a+=1;
        }

        System.out.println("\n");

        //do-while
        int b = 1;
        do {
            if (b % 3 == 0)
                System.out.println("Fizz");
            else if (b % 5 == 0)
                System.out.println("Buzz");
            b+=1;
        } while (b<=20);

        System.out.println("\n");

        //for
        for (int i=1; i<=20; i+=1){
            if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
        }

    }
}
