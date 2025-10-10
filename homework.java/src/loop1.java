//
public class loop1 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1000){
            System.out.println(i);
            i*=10;
            System.out.println(i);
        }

        System.out.println("\n");

        for (i = 1 ; i <= 1000 ; i*=10){
            System.out.println(i);
        }


    }
}
